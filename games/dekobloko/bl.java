/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends kf {
    static int field_T;
    boolean field_S;
    private ka field_ab;
    static String field_W;
    static fd field_U;
    static w field_Y;
    private int field_V;
    static char[] field_Z;
    static String field_X;

    private final int a(int param0) {
        if (param0 != -10604) {
            return -74;
        }
        return !this.field_S ? 0 : this.field_ab.g((byte) -83) == this ? 256 : 0;
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 92) {
            discarded$0 = this.h((byte) -10);
        }
        this.b(param2, param1, cf.field_f + -param1 >> -715540319, -param2 + vd.field_n >> -532348575, -16555);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 == (this.field_V ^ -1)) {
          return;
        } else {
          if (256 <= this.field_V) {
            if ((param2 ^ -1) != -1) {
              return;
            } else {
              this.b(-128, param3 - -this.field_D, param0 - -this.field_u);
              super.a(param0, -122, param2, param3);
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == si.field_n) {
                  break L1;
                } else {
                  if (this.field_t > si.field_n.field_I) {
                    break L1;
                  } else {
                    if (this.field_y > si.field_n.field_H) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              si.field_n = new ck(this.field_t, this.field_y);
              break L0;
            }
            L2: {
              tb.a(true, si.field_n);
              hk.b();
              this.b(-128, 0, 0);
              super.a(-this.field_u + -param0, -116, param2, -param3 + -this.field_D);
              mk.a((byte) -5);
              si.field_n.c(this.field_u + param0, this.field_D + param3, this.field_V);
              if (param1 < -103) {
                break L2;
              } else {
                this.field_V = -41;
                break L2;
              }
            }
            return;
          }
        }
    }

    bl(ka param0, int param1, int param2) {
        super(-param1 + cf.field_f >> -954919615, vd.field_n - param2 >> -1866710303, param1, param2, (gl) null);
        try {
            this.field_S = false;
            this.field_V = 0;
            this.field_ab = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ce e(byte param0) {
        ce var2 = super.e(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (ce) (this);
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        String[] stackIn_47_0 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String stackIn_50_2 = null;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        String stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        String stackIn_131_1 = null;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_137_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        String[] stackIn_155_0 = null;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_156_2 = 0;
        int stackOut_157_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        String[] stackOut_154_0 = null;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String stackOut_49_2 = null;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_48_2 = null;
        int stackOut_128_0 = 0;
        int stackOut_129_0 = 0;
        String stackOut_129_1 = null;
        int stackOut_131_0 = 0;
        String stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        int stackOut_130_0 = 0;
        String stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        int stackOut_136_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_161_2 = 0;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    fj.field_e = true;
                    bc.field_B = param1;
                    if (-1 == (bc.field_B ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (-2 == (bc.field_B ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            if (-3 != (bc.field_B ^ -1)) {
                              break L6;
                            } else {
                              var3_int = te.a(cm.a((byte) 91, de.field_ab, new String[]{"<br><%0><br>"}), 86, om.field_a, vg.field_I, rk.field_R);
                              var4 = -1;
                              var5 = 0;
                              L7: while (true) {
                                L8: {
                                  L9: {
                                    if (var5 >= var3_int) {
                                      break L9;
                                    } else {
                                      stackOut_6_0 = "<%0>".equals(vg.field_I[var5]);
                                      stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                                      stackIn_7_0 = stackOut_6_0;
                                      if (var9 != 0) {
                                        break L8;
                                      } else {
                                        L10: {
                                          if (!stackIn_7_0) {
                                            break L10;
                                          } else {
                                            var4 = var5;
                                            if (var9 == 0) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var5++;
                                        if (var9 == 0) {
                                          continue L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_11_0 = var4 ^ -1;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L8;
                                }
                                if (stackIn_12_0 != 0) {
                                  tg.field_g = new String[var4];
                                  an.a(vg.field_I, 0, tg.field_g, 0, var4);
                                  dh.field_b = new String[-1 + (var3_int + -var4)];
                                  an.a(vg.field_I, 1 + var4, dh.field_b, 0, -var4 + var3_int + -1);
                                  var4 = -1;
                                  var3_int = te.a(cm.a((byte) 86, ga.field_d, new String[]{"<br><%0><br>"}), 112, om.field_a, vg.field_I, rk.field_R);
                                  var5 = 0;
                                  L11: while (true) {
                                    L12: {
                                      L13: {
                                        if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                          break L13;
                                        } else {
                                          stackOut_16_0 = "<%0>".equals(vg.field_I[var5]);
                                          stackIn_22_0 = stackOut_16_0 ? 1 : 0;
                                          stackIn_17_0 = stackOut_16_0;
                                          if (var9 != 0) {
                                            break L12;
                                          } else {
                                            L14: {
                                              if (!stackIn_17_0) {
                                                break L14;
                                              } else {
                                                var4 = var5;
                                                if (var9 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            var5++;
                                            if (var9 == 0) {
                                              continue L11;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_21_0 = -1;
                                      stackIn_22_0 = stackOut_21_0;
                                      break L12;
                                    }
                                    if (stackIn_22_0 != var4) {
                                      L15: {
                                        vb.field_U = new String[var4];
                                        an.a(vg.field_I, 0, vb.field_U, 0, var4);
                                        wb.field_Qb = new String[var3_int - (var4 + 1)];
                                        an.a(vg.field_I, var4 - -1, wb.field_Qb, 0, -1 + (-var4 + var3_int));
                                        if (tg.field_g.length >= vb.field_U.length) {
                                          stackOut_26_0 = tg.field_g.length;
                                          stackIn_27_0 = stackOut_26_0;
                                          break L15;
                                        } else {
                                          stackOut_25_0 = vb.field_U.length;
                                          stackIn_27_0 = stackOut_25_0;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        var5 = stackIn_27_0;
                                        if ((dh.field_b.length ^ -1) > (wb.field_Qb.length ^ -1)) {
                                          stackOut_29_0 = wb.field_Qb.length;
                                          stackIn_30_0 = stackOut_29_0;
                                          break L16;
                                        } else {
                                          stackOut_28_0 = dh.field_b.length;
                                          stackIn_30_0 = stackOut_28_0;
                                          break L16;
                                        }
                                      }
                                      var6 = stackIn_30_0;
                                      var7 = var5 + (7 - -var6);
                                      rk.field_P = new String[var7];
                                      k.field_g = new int[var7];
                                      var8 = 0;
                                      L17: while (true) {
                                        L18: {
                                          L19: {
                                            if ((var7 ^ -1) >= (var8 ^ -1)) {
                                              break L19;
                                            } else {
                                              k.field_g[var8] = -1;
                                              var8++;
                                              if (var9 != 0) {
                                                break L18;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L17;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                          qf.field_i = new int[2];
                                          rk.field_P[1] = i.field_g;
                                          k.field_g[1] = 0;
                                          rk.field_P[0] = tf.field_Z;
                                          qf.field_i[0] = 5;
                                          rk.field_P[2] = wi.field_a;
                                          k.field_g[3] = 1;
                                          rk.field_P[3] = sc.field_p;
                                          rk.field_P[4] = uj.field_c;
                                          qf.field_i[1] = 2;
                                          rk.field_P[5] = "";
                                          break L18;
                                        }
                                        var8 = 0;
                                        L20: while (true) {
                                          L21: {
                                            L22: {
                                              if ((var8 ^ -1) <= (var5 ^ -1)) {
                                                break L22;
                                              } else {
                                                stackOut_38_0 = rk.field_P;
                                                stackOut_38_1 = var8 + 6;
                                                stackOut_38_2 = -var5 + (var8 - -vb.field_U.length);
                                                stackIn_44_0 = stackOut_38_0;
                                                stackIn_44_1 = stackOut_38_1;
                                                stackIn_44_2 = stackOut_38_2;
                                                stackIn_39_0 = stackOut_38_0;
                                                stackIn_39_1 = stackOut_38_1;
                                                stackIn_39_2 = stackOut_38_2;
                                                if (var9 != 0) {
                                                  break L21;
                                                } else {
                                                  L23: {
                                                    stackOut_39_0 = (String[]) ((Object) stackIn_39_0);
                                                    stackOut_39_1 = stackIn_39_1;
                                                    stackIn_41_0 = stackOut_39_0;
                                                    stackIn_41_1 = stackOut_39_1;
                                                    stackIn_40_0 = stackOut_39_0;
                                                    stackIn_40_1 = stackOut_39_1;
                                                    if (stackIn_39_2 >= 0) {
                                                      stackOut_41_0 = (String[]) ((Object) stackIn_41_0);
                                                      stackOut_41_1 = stackIn_41_1;
                                                      stackOut_41_2 = vb.field_U[-var5 + (vb.field_U.length + var8)];
                                                      stackIn_42_0 = stackOut_41_0;
                                                      stackIn_42_1 = stackOut_41_1;
                                                      stackIn_42_2 = stackOut_41_2;
                                                      break L23;
                                                    } else {
                                                      stackOut_40_0 = (String[]) ((Object) stackIn_40_0);
                                                      stackOut_40_1 = stackIn_40_1;
                                                      stackOut_40_2 = "";
                                                      stackIn_42_0 = stackOut_40_0;
                                                      stackIn_42_1 = stackOut_40_1;
                                                      stackIn_42_2 = stackOut_40_2;
                                                      break L23;
                                                    }
                                                  }
                                                  stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                                  var8++;
                                                  if (var9 == 0) {
                                                    continue L20;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_43_0 = rk.field_P;
                                            stackOut_43_1 = var5;
                                            stackOut_43_2 = 6;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackIn_44_1 = stackOut_43_1;
                                            stackIn_44_2 = stackOut_43_2;
                                            break L21;
                                          }
                                          stackIn_44_0[stackIn_44_1 + stackIn_44_2] = null;
                                          k.field_g[var5 + 6] = -2;
                                          var8 = 0;
                                          L24: while (true) {
                                            L25: {
                                              if (var8 >= var6) {
                                                break L25;
                                              } else {
                                                stackOut_46_0 = rk.field_P;
                                                stackIn_155_0 = stackOut_46_0;
                                                stackIn_47_0 = stackOut_46_0;
                                                if (var9 != 0) {
                                                  L26: while (true) {
                                                    if ((stackIn_155_0.length ^ -1) >= (var4 ^ -1)) {
                                                      break L2;
                                                    } else {
                                                      stackOut_156_0 = ig.field_dc;
                                                      stackOut_156_1 = -1;
                                                      stackOut_156_2 = k.field_g[var4] ^ -1;
                                                      stackIn_162_0 = stackOut_156_0;
                                                      stackIn_162_1 = stackOut_156_1;
                                                      stackIn_162_2 = stackOut_156_2;
                                                      stackIn_157_0 = stackOut_156_0;
                                                      stackIn_157_1 = stackOut_156_1;
                                                      stackIn_157_2 = stackOut_156_2;
                                                      if (var9 != 0) {
                                                        break L1;
                                                      } else {
                                                        L27: {
                                                          stackOut_157_0 = stackIn_157_0;
                                                          stackIn_159_0 = stackOut_157_0;
                                                          stackIn_158_0 = stackOut_157_0;
                                                          if (stackIn_157_1 < stackIn_157_2) {
                                                            stackOut_159_0 = stackIn_159_0;
                                                            stackOut_159_1 = ke.field_d;
                                                            stackIn_160_0 = stackOut_159_0;
                                                            stackIn_160_1 = stackOut_159_1;
                                                            break L27;
                                                          } else {
                                                            stackOut_158_0 = stackIn_158_0;
                                                            stackOut_158_1 = cc.field_a;
                                                            stackIn_160_0 = stackOut_158_0;
                                                            stackIn_160_1 = stackOut_158_1;
                                                            break L27;
                                                          }
                                                        }
                                                        ig.field_dc = stackIn_160_0 + stackIn_160_1;
                                                        var4++;
                                                        if (var9 == 0) {
                                                          stackOut_154_0 = rk.field_P;
                                                          stackIn_155_0 = stackOut_154_0;
                                                          continue L26;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L28: {
                                                    stackOut_47_0 = (String[]) ((Object) stackIn_47_0);
                                                    stackOut_47_1 = 7 - (-var5 - var8);
                                                    stackIn_49_0 = stackOut_47_0;
                                                    stackIn_49_1 = stackOut_47_1;
                                                    stackIn_48_0 = stackOut_47_0;
                                                    stackIn_48_1 = stackOut_47_1;
                                                    if (wb.field_Qb.length <= var8) {
                                                      stackOut_49_0 = (String[]) ((Object) stackIn_49_0);
                                                      stackOut_49_1 = stackIn_49_1;
                                                      stackOut_49_2 = "";
                                                      stackIn_50_0 = stackOut_49_0;
                                                      stackIn_50_1 = stackOut_49_1;
                                                      stackIn_50_2 = stackOut_49_2;
                                                      break L28;
                                                    } else {
                                                      stackOut_48_0 = (String[]) ((Object) stackIn_48_0);
                                                      stackOut_48_1 = stackIn_48_1;
                                                      stackOut_48_2 = wb.field_Qb[var8];
                                                      stackIn_50_0 = stackOut_48_0;
                                                      stackIn_50_1 = stackOut_48_1;
                                                      stackIn_50_2 = stackOut_48_2;
                                                      break L28;
                                                    }
                                                  }
                                                  stackIn_50_0[stackIn_50_1] = stackIn_50_2;
                                                  var8++;
                                                  if (var9 == 0) {
                                                    continue L24;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                            di.field_F = ik.a(4);
                                            if (var9 == 0) {
                                              break L3;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw new IllegalStateException();
                                    }
                                  }
                                } else {
                                  throw new IllegalStateException();
                                }
                              }
                            }
                          }
                          L29: {
                            if (-4 == (bc.field_B ^ -1)) {
                              break L29;
                            } else {
                              L30: {
                                if ((bc.field_B ^ -1) == -5) {
                                  break L30;
                                } else {
                                  if (bc.field_B == 5) {
                                    var3_int = te.a(gd.field_i, 76, om.field_a, vg.field_I, rk.field_R);
                                    var4 = 3 + var3_int;
                                    rk.field_P = new String[var4];
                                    k.field_g = new int[var4];
                                    var5 = 0;
                                    L31: while (true) {
                                      L32: {
                                        L33: {
                                          if ((var5 ^ -1) <= (var4 ^ -1)) {
                                            break L33;
                                          } else {
                                            k.field_g[var5] = -1;
                                            var5++;
                                            if (var9 != 0) {
                                              break L32;
                                            } else {
                                              if (var9 == 0) {
                                                continue L31;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                        qf.field_i = new int[2];
                                        break L32;
                                      }
                                      var5 = 0;
                                      L34: while (true) {
                                        L35: {
                                          L36: {
                                            if ((var3_int ^ -1) >= (var5 ^ -1)) {
                                              break L36;
                                            } else {
                                              rk.field_P[var5] = vg.field_I[var5];
                                              var5++;
                                              if (var9 != 0) {
                                                break L35;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L34;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                          rk.field_P[-3 + var4] = "";
                                          rk.field_P[var4 + -2] = fj.field_c;
                                          k.field_g[-2 + var4] = 0;
                                          qf.field_i[0] = 3;
                                          rk.field_P[var4 + -1] = og.field_gb;
                                          k.field_g[-1 + var4] = 1;
                                          qf.field_i[1] = 5;
                                          break L35;
                                        }
                                        if (var9 == 0) {
                                          break L3;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  } else {
                                    throw new IllegalArgumentException();
                                  }
                                }
                              }
                              var3_int = te.a(dc.field_g, 117, om.field_a, vg.field_I, rk.field_R);
                              var4 = 2 + var3_int;
                              k.field_g = new int[var4];
                              rk.field_P = new String[var4];
                              var5 = 0;
                              L37: while (true) {
                                L38: {
                                  L39: {
                                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                                      break L39;
                                    } else {
                                      k.field_g[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L38;
                                      } else {
                                        if (var9 == 0) {
                                          continue L37;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  qf.field_i = new int[1];
                                  break L38;
                                }
                                var5 = 0;
                                L40: while (true) {
                                  L41: {
                                    L42: {
                                      if (var3_int <= var5) {
                                        break L42;
                                      } else {
                                        rk.field_P[var5] = vg.field_I[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L41;
                                        } else {
                                          if (var9 == 0) {
                                            continue L40;
                                          } else {
                                            break L42;
                                          }
                                        }
                                      }
                                    }
                                    rk.field_P[-2 + var4] = "";
                                    rk.field_P[var4 + -1] = og.field_gb;
                                    k.field_g[-1 + var4] = 0;
                                    qf.field_i[0] = 5;
                                    break L41;
                                  }
                                  if (var9 == 0) {
                                    break L3;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                          }
                          L43: {
                            L44: {
                              if (!lf.field_e.field_a) {
                                break L44;
                              } else {
                                var3_int = te.a(rb.field_a, 99, om.field_a, vg.field_I, rk.field_R);
                                if (var9 == 0) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            var3_int = te.a(si.field_c, 81, om.field_a, vg.field_I, rk.field_R);
                            break L43;
                          }
                          var4 = 2 - -var3_int;
                          rk.field_P = new String[var4];
                          k.field_g = new int[var4];
                          var5 = 0;
                          L45: while (true) {
                            L46: {
                              L47: {
                                if ((var5 ^ -1) <= (var4 ^ -1)) {
                                  break L47;
                                } else {
                                  k.field_g[var5] = -1;
                                  var5++;
                                  if (var9 != 0) {
                                    break L46;
                                  } else {
                                    if (var9 == 0) {
                                      continue L45;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                              qf.field_i = new int[1];
                              break L46;
                            }
                            var5 = 0;
                            L48: while (true) {
                              L49: {
                                L50: {
                                  if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                    break L50;
                                  } else {
                                    rk.field_P[var5] = vg.field_I[var5];
                                    var5++;
                                    if (var9 != 0) {
                                      break L49;
                                    } else {
                                      if (var9 == 0) {
                                        continue L48;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                }
                                rk.field_P[var4 - 2] = "";
                                rk.field_P[var4 + -1] = og.field_gb;
                                k.field_g[-1 + var4] = 0;
                                qf.field_i[0] = 5;
                                break L49;
                              }
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var3_int = te.a(df.field_X, 96, om.field_a, vg.field_I, rk.field_R);
                      var4 = var3_int + 2;
                      k.field_g = new int[var4];
                      rk.field_P = new String[var4];
                      var5 = 0;
                      L51: while (true) {
                        L52: {
                          L53: {
                            if ((var4 ^ -1) >= (var5 ^ -1)) {
                              break L53;
                            } else {
                              k.field_g[var5] = -1;
                              var5++;
                              if (var9 != 0) {
                                break L52;
                              } else {
                                if (var9 == 0) {
                                  continue L51;
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                          qf.field_i = new int[1];
                          break L52;
                        }
                        var5 = 0;
                        L54: while (true) {
                          L55: {
                            L56: {
                              if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                break L56;
                              } else {
                                rk.field_P[var5] = vg.field_I[var5];
                                var5++;
                                if (var9 != 0) {
                                  break L55;
                                } else {
                                  if (var9 == 0) {
                                    continue L54;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                            }
                            rk.field_P[-2 + var4] = "";
                            rk.field_P[-1 + var4] = og.field_gb;
                            k.field_g[-1 + var4] = 0;
                            qf.field_i[0] = 5;
                            break L55;
                          }
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var3_int = te.a(df.field_X, 124, om.field_a, vg.field_I, rk.field_R);
                  var4 = 3 + var3_int;
                  rk.field_P = new String[var4];
                  k.field_g = new int[var4];
                  var5 = 0;
                  L57: while (true) {
                    L58: {
                      L59: {
                        if (var5 >= var4) {
                          break L59;
                        } else {
                          k.field_g[var5] = -1;
                          var5++;
                          if (var9 != 0) {
                            break L58;
                          } else {
                            if (var9 == 0) {
                              continue L57;
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                      qf.field_i = new int[2];
                      break L58;
                    }
                    var5 = 0;
                    L60: while (true) {
                      L61: {
                        L62: {
                          if ((var3_int ^ -1) >= (var5 ^ -1)) {
                            break L62;
                          } else {
                            rk.field_P[var5] = vg.field_I[var5];
                            var5++;
                            if (var9 != 0) {
                              break L61;
                            } else {
                              if (var9 == 0) {
                                continue L60;
                              } else {
                                break L62;
                              }
                            }
                          }
                        }
                        rk.field_P[var4 - 3] = "";
                        rk.field_P[-2 + var4] = me.field_C;
                        k.field_g[var4 + -2] = 0;
                        qf.field_i[0] = 4;
                        rk.field_P[-1 + var4] = og.field_gb;
                        k.field_g[-1 + var4] = 1;
                        break L61;
                      }
                      qf.field_i[1] = 5;
                      break L3;
                    }
                  }
                }
                L63: {
                  if (param0 <= -8) {
                    break L63;
                  } else {
                    field_U = (fd) null;
                    break L63;
                  }
                }
                k.field_f.field_l = qf.field_i.length;
                var3_int = 0;
                var4 = 0;
                L64: while (true) {
                  L65: {
                    L66: {
                      if ((var4 ^ -1) <= (rk.field_P.length ^ -1)) {
                        break L66;
                      } else {
                        stackOut_128_0 = 0;
                        stackIn_137_0 = stackOut_128_0;
                        stackIn_129_0 = stackOut_128_0;
                        if (var9 != 0) {
                          break L65;
                        } else {
                          L67: {
                            stackOut_129_0 = stackIn_129_0;
                            stackOut_129_1 = rk.field_P[var4];
                            stackIn_131_0 = stackOut_129_0;
                            stackIn_131_1 = stackOut_129_1;
                            stackIn_130_0 = stackOut_129_0;
                            stackIn_130_1 = stackOut_129_1;
                            if (k.field_g[var4] < 0) {
                              stackOut_131_0 = stackIn_131_0;
                              stackOut_131_1 = (String) ((Object) stackIn_131_1);
                              stackOut_131_2 = 0;
                              stackIn_132_0 = stackOut_131_0;
                              stackIn_132_1 = stackOut_131_1;
                              stackIn_132_2 = stackOut_131_2;
                              break L67;
                            } else {
                              stackOut_130_0 = stackIn_130_0;
                              stackOut_130_1 = (String) ((Object) stackIn_130_1);
                              stackOut_130_2 = 1;
                              stackIn_132_0 = stackOut_130_0;
                              stackIn_132_1 = stackOut_130_1;
                              stackIn_132_2 = stackOut_130_2;
                              break L67;
                            }
                          }
                          L68: {
                            var5 = si.a(stackIn_132_0 != 0, stackIn_132_1, stackIn_132_2 != 0);
                            if (var5 > var3_int) {
                              var3_int = var5;
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L64;
                          } else {
                            break L66;
                          }
                        }
                      }
                    }
                    stackOut_136_0 = -3;
                    stackIn_137_0 = stackOut_136_0;
                    break L65;
                  }
                  L69: {
                    L70: {
                      if (stackIn_137_0 != (bc.field_B ^ -1)) {
                        break L70;
                      } else {
                        var10 = tg.field_g;
                        var4_ref_String__ = var10;
                        var5 = 0;
                        L71: while (true) {
                          L72: {
                            if (var10.length <= var5) {
                              break L72;
                            } else {
                              var11 = var10[var5];
                              var7 = si.a(false, var11, false);
                              stackOut_140_0 = var7;
                              stackOut_140_1 = var3_int;
                              stackIn_147_0 = stackOut_140_0;
                              stackIn_147_1 = stackOut_140_1;
                              stackIn_141_0 = stackOut_140_0;
                              stackIn_141_1 = stackOut_140_1;
                              if (var9 != 0) {
                                L73: while (true) {
                                  if (stackIn_147_0 >= stackIn_147_1) {
                                    break L70;
                                  } else {
                                    var12 = var4_ref_String__[var5];
                                    var7 = si.a(false, var12, false);
                                    stackOut_148_0 = var3_int;
                                    stackOut_148_1 = var7;
                                    stackIn_153_0 = stackOut_148_0;
                                    stackIn_153_1 = stackOut_148_1;
                                    stackIn_149_0 = stackOut_148_0;
                                    stackIn_149_1 = stackOut_148_1;
                                    if (var9 != 0) {
                                      break L69;
                                    } else {
                                      L74: {
                                        if (stackIn_149_0 >= stackIn_149_1) {
                                          break L74;
                                        } else {
                                          var3_int = var7;
                                          break L74;
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        stackOut_146_0 = var5;
                                        stackOut_146_1 = var4_ref_String__.length;
                                        stackIn_147_0 = stackOut_146_0;
                                        stackIn_147_1 = stackOut_146_1;
                                        continue L73;
                                      } else {
                                        break L70;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L75: {
                                  if (stackIn_141_0 > stackIn_141_1) {
                                    var3_int = var7;
                                    break L75;
                                  } else {
                                    break L75;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L71;
                                } else {
                                  break L72;
                                }
                              }
                            }
                          }
                          var4_ref_String__ = dh.field_b;
                          var5 = 0;
                          L76: while (true) {
                            stackOut_146_0 = var5;
                            stackOut_146_1 = var4_ref_String__.length;
                            stackIn_147_0 = stackOut_146_0;
                            stackIn_147_1 = stackOut_146_1;
                            if (stackIn_147_0 >= stackIn_147_1) {
                              break L70;
                            } else {
                              var12 = var4_ref_String__[var5];
                              var7 = si.a(false, var12, false);
                              stackOut_148_0 = var3_int;
                              stackOut_148_1 = var7;
                              stackIn_153_0 = stackOut_148_0;
                              stackIn_153_1 = stackOut_148_1;
                              stackIn_149_0 = stackOut_148_0;
                              stackIn_149_1 = stackOut_148_1;
                              if (var9 != 0) {
                                break L69;
                              } else {
                                L77: {
                                  if (stackIn_149_0 >= stackIn_149_1) {
                                    break L77;
                                  } else {
                                    var3_int = var7;
                                    break L77;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L76;
                                } else {
                                  break L70;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    ig.field_dc = (qk.field_m + pa.field_Y << -1078448671) * k.field_f.field_l;
                    ri.field_i = -(var3_int >> -2049814175) + (var3_int + qk.field_d);
                    stackOut_152_0 = qk.field_d;
                    stackOut_152_1 = -(var3_int >> 504032897);
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    break L69;
                  }
                  ge.field_e = stackIn_153_0 + stackIn_153_1;
                  var4 = 0;
                  L78: while (true) {
                    stackOut_154_0 = rk.field_P;
                    stackIn_155_0 = stackOut_154_0;
                    if ((stackIn_155_0.length ^ -1) >= (var4 ^ -1)) {
                      break L2;
                    } else {
                      stackOut_156_0 = ig.field_dc;
                      stackOut_156_1 = -1;
                      stackOut_156_2 = k.field_g[var4] ^ -1;
                      stackIn_162_0 = stackOut_156_0;
                      stackIn_162_1 = stackOut_156_1;
                      stackIn_162_2 = stackOut_156_2;
                      stackIn_157_0 = stackOut_156_0;
                      stackIn_157_1 = stackOut_156_1;
                      stackIn_157_2 = stackOut_156_2;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L79: {
                          stackOut_157_0 = stackIn_157_0;
                          stackIn_159_0 = stackOut_157_0;
                          stackIn_158_0 = stackOut_157_0;
                          if (stackIn_157_1 < stackIn_157_2) {
                            stackOut_159_0 = stackIn_159_0;
                            stackOut_159_1 = ke.field_d;
                            stackIn_160_0 = stackOut_159_0;
                            stackIn_160_1 = stackOut_159_1;
                            break L79;
                          } else {
                            stackOut_158_0 = stackIn_158_0;
                            stackOut_158_1 = cc.field_a;
                            stackIn_160_0 = stackOut_158_0;
                            stackIn_160_1 = stackOut_158_1;
                            break L79;
                          }
                        }
                        ig.field_dc = stackIn_160_0 + stackIn_160_1;
                        var4++;
                        if (var9 == 0) {
                          continue L78;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_161_0 = ul.field_d;
              stackOut_161_1 = ig.field_dc;
              stackOut_161_2 = 890590369;
              stackIn_162_0 = stackOut_161_0;
              stackIn_162_1 = stackOut_161_1;
              stackIn_162_2 = stackOut_161_2;
              break L1;
            }
            fc.field_a = stackIn_162_0 + -(stackIn_162_1 >> stackIn_162_2);
            tj.field_jc = new int[rk.field_P.length][];
            var4 = 0;
            var5 = fc.field_a;
            L80: while (true) {
              L81: {
                L82: {
                  if (rk.field_P.length <= var4) {
                    break L82;
                  } else {
                    var6 = k.field_g[var4];
                    stackOut_164_0 = -1;
                    stackOut_164_1 = var6 ^ -1;
                    stackIn_170_0 = stackOut_164_0;
                    stackIn_170_1 = stackOut_164_1;
                    stackIn_165_0 = stackOut_164_0;
                    stackIn_165_1 = stackOut_164_1;
                    if (var9 != 0) {
                      break L81;
                    } else {
                      L83: {
                        L84: {
                          if (stackIn_165_0 >= stackIn_165_1) {
                            break L84;
                          } else {
                            var5 = var5 + ke.field_d;
                            if (var9 == 0) {
                              break L83;
                            } else {
                              break L84;
                            }
                          }
                        }
                        var7 = si.a(false, rk.field_P[var4], true);
                        var5 = var5 + qk.field_m;
                        var8 = qk.field_d - (var7 >> -1233259135);
                        tj.field_jc[var4] = new int[4];
                        tj.field_jc[var4][0] = var8 - mb.field_c;
                        tj.field_jc[var4][1] = var5;
                        tj.field_jc[var4][2] = var7 - -(mb.field_c << 1785328417);
                        var5 = var5 + ((pa.field_Y << -668883583) + qk.field_m + cc.field_a);
                        tj.field_jc[var4][3] = cc.field_a + (pa.field_Y << 1538379393);
                        break L83;
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L80;
                      } else {
                        break L82;
                      }
                    }
                  }
                }
                stackOut_169_0 = -3;
                stackOut_169_1 = bc.field_B ^ -1;
                stackIn_170_0 = stackOut_169_0;
                stackIn_170_1 = stackOut_169_1;
                break L81;
              }
              L85: {
                L86: {
                  if (stackIn_170_0 != stackIn_170_1) {
                    break L86;
                  } else {
                    k.field_f.a(-1, 0, -1, param2);
                    if (var9 == 0) {
                      break L85;
                    } else {
                      break L86;
                    }
                  }
                }
                k.field_f.a(0, 0, ub.a(bh.field_g, (byte) -81, pm.field_f), param2);
                break L85;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "bl.IC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          fl.a(130, param1 ^ 12362, 16694016, mb.field_e, 80 + param0, w.field_kb);
          var2 = 145;
          kd.field_t.c(param0 + 82, var2, 18, 18);
          var2 = var2 + (16 + ga.a(188, 0, var2, nk.field_c, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16);
          tg.a(true, 2).c(82 + param0, var2, 18, 18);
          stackOut_0_0 = var2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((kd.field_p ^ -1) != -1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 16;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0 + (stackIn_3_1 - -(ga.a(188, 0, var2, kb.field_e, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16));
          vk.a(nf.field_e, param0 + 190, 3, gi.field_c, kk.field_n, var2, -22981);
          hk.g(309 - -param0, 117, 242, 263172);
          hk.g(310 - -param0, 117, 242, 6316128);
          fl.a(130, param1 ^ 12362, 16694016, hg.field_d, 320 + param0, w.field_kb);
          var2 = 145;
          tg.a(true, 0).c(320 - -param0, var2, 18, 18);
          var2 = var2 + (16 * ga.a(212, 0, var2, dk.field_f, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) + 16);
          if (param1 == 12618) {
            break L1;
          } else {
            bl.a(105, 85, false);
            break L1;
          }
        }
        fl.a(var2 - -14, 256, 16694016, kc.field_q, param0 + 320, w.field_kb);
        var2 += 29;
        tg.a(true, 3).c(param0 + 320, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(212, 0, var2, ki.field_u, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) * 16));
    }

    boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          this.field_V = this.a(-10604);
          if (param0 >= 77) {
            break L0;
          } else {
            this.field_S = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_V) {
              break L2;
            } else {
              if (this.field_S) {
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

    boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var2 = this.a(-10604);
          var3 = var2 - this.field_V;
          if (param0 > 15) {
            break L0;
          } else {
            this.a(-126, -71, 58, -27);
            break L0;
          }
        }
        L1: {
          if (0 < var3) {
            this.field_V = this.field_V + (-1 + var3 - -8) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 < (var3 ^ -1)) {
            this.field_V = this.field_V + (1 + (-16 + var3)) / 16;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (this.field_V != 0) {
              break L4;
            } else {
              if (-1 != (var2 ^ -1)) {
                break L4;
              } else {
                if (this.field_S) {
                  break L4;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
          }
          stackOut_12_0 = 0;
          stackIn_13_0 = stackOut_12_0;
          break L3;
        }
        return stackIn_13_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    final static void g(byte param0) {
        bf.field_x = bg.a(true);
        if (param0 > -12) {
            field_Z = (char[]) null;
        }
        ah.field_c = new ka();
        dd.a(true, true, (byte) 66);
    }

    public static void i(int param0) {
        field_Y = null;
        if (param0 != 2) {
            field_X = (String) null;
        }
        field_U = null;
        field_W = null;
        field_X = null;
        field_Z = null;
    }

    static {
        field_W = "Chat view has been scrolled up. Scroll down to chat.";
        field_Z = new char[128];
        field_X = "Back";
    }
}
