/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends ofa implements tsa {
    static volatile int field_X;
    private sta field_T;
    private rj field_Z;
    private rj[] field_U;
    private rj field_N;
    private dh[] field_P;
    private rj field_W;
    static String field_Q;
    static String field_R;
    private rla field_ab;
    private boolean field_O;
    private rj field_L;
    private rj field_V;
    private boolean field_M;
    private boolean field_Y;
    private rj field_S;

    final static void j(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        Object var1_ref2 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_19_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_ref2 = nfa.field_n;
            synchronized (var1_ref2) {
              L1: {
                if (param0 == 3321) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          cda.field_p = cda.field_p + 1;
                          vha.field_b = nt.field_a;
                          if (0 > ita.field_f) {
                            break L5;
                          } else {
                            L6: while (true) {
                              if (hka.field_a == ita.field_f) {
                                break L4;
                              } else {
                                var2 = cna.field_c[hka.field_a];
                                hka.field_a = 127 & hka.field_a + 1;
                                stackOut_7_0 = -1;
                                stackIn_20_0 = stackOut_7_0;
                                stackIn_8_0 = stackOut_7_0;
                                if (var4 != 0) {
                                  break L3;
                                } else {
                                  L7: {
                                    L8: {
                                      if (stackIn_8_0 < (var2 ^ -1)) {
                                        break L8;
                                      } else {
                                        oj.field_tb[var2] = true;
                                        if (var4 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    oj.field_tb[var2 ^ -1] = false;
                                    break L7;
                                  }
                                  if (var4 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var2 = 0;
                        L9: while (true) {
                          L10: {
                            if (112 <= var2) {
                              break L10;
                            } else {
                              oj.field_tb[var2] = false;
                              var2++;
                              if (var4 != 0) {
                                break L2;
                              } else {
                                if (var4 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          ita.field_f = hka.field_a;
                          break L4;
                        }
                      }
                      stackOut_19_0 = rca.field_n;
                      stackIn_20_0 = stackOut_19_0;
                      break L3;
                    }
                    nt.field_a = stackIn_20_0;
                    break L2;
                  }
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "at.J(" + param0 + ')');
        }
    }

    at(jta param0) {
        super(param0, 430, 254);
        int incrementValue$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        dh[] var3_ref_dh__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        rj var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        ae var7 = null;
        dh var8 = null;
        int var9 = 0;
        String var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        dh stackIn_10_1 = null;
        Object stackIn_25_0 = null;
        dh stackIn_25_1 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_57_0 = null;
        sta stackIn_57_1 = null;
        sta stackIn_57_2 = null;
        int stackIn_57_3 = 0;
        Object stackIn_58_0 = null;
        sta stackIn_58_1 = null;
        sta stackIn_58_2 = null;
        int stackIn_58_3 = 0;
        Object stackIn_59_0 = null;
        sta stackIn_59_1 = null;
        sta stackIn_59_2 = null;
        int stackIn_59_3 = 0;
        Object stackIn_60_0 = null;
        sta stackIn_60_1 = null;
        sta stackIn_60_2 = null;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String stackIn_84_0 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        dh stackOut_9_1 = null;
        Object stackOut_24_0 = null;
        dh stackOut_24_1 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_56_0 = null;
        sta stackOut_56_1 = null;
        sta stackOut_56_2 = null;
        int stackOut_56_3 = 0;
        Object stackOut_57_0 = null;
        sta stackOut_57_1 = null;
        sta stackOut_57_2 = null;
        int stackOut_57_3 = 0;
        Object stackOut_58_0 = null;
        sta stackOut_58_1 = null;
        sta stackOut_58_2 = null;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        Object stackOut_59_0 = null;
        sta stackOut_59_1 = null;
        sta stackOut_59_2 = null;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String stackOut_83_0 = null;
        String stackOut_82_0 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_P = af.a(99, dsa.field_c);
                if ((this.field_P.length ^ -1) >= -1) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var2_int >= this.field_P.length) {
                          break L5;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_36_0 = stackOut_4_0;
                          stackIn_5_0 = stackOut_4_0;
                          if (var9 != 0) {
                            break L1;
                          } else {
                            L6: {
                              L7: {
                                if (((at) (this)).field_P[var2_int] != null) {
                                  break L7;
                                } else {
                                  if (var9 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var3 = var2_int - -1;
                              L8: while (true) {
                                L9: {
                                  if (var3 >= this.field_P.length) {
                                    break L9;
                                  } else {
                                    stackOut_9_0 = null;
                                    stackOut_9_1 = this.field_P[var3];
                                    stackIn_25_0 = stackOut_9_0;
                                    stackIn_25_1 = stackOut_9_1;
                                    stackIn_10_0 = stackOut_9_0;
                                    stackIn_10_1 = stackOut_9_1;
                                    if (var9 != 0) {
                                      L10: while (true) {
                                        L11: {
                                          if (stackIn_25_0 == stackIn_25_1) {
                                            break L11;
                                          } else {
                                            var2_int++;
                                            break L11;
                                          }
                                        }
                                        var3++;
                                        if (var9 == 0) {
                                          if (this.field_P.length <= var3) {
                                            break L4;
                                          } else {
                                            if (var9 != 0) {
                                              break L2;
                                            } else {
                                              stackOut_24_0 = null;
                                              stackOut_24_1 = this.field_P[var3];
                                              stackIn_25_0 = stackOut_24_0;
                                              stackIn_25_1 = stackOut_24_1;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                    } else {
                                      L12: {
                                        L13: {
                                          if (stackIn_10_0 != stackIn_10_1) {
                                            break L13;
                                          } else {
                                            if (var9 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        if (this.field_P[var3].field_a != this.field_P[var2_int].field_a) {
                                          break L12;
                                        } else {
                                          if (this.field_P[var2_int].field_c != this.field_P[var3].field_c) {
                                            break L12;
                                          } else {
                                            this.field_P[var3] = null;
                                            break L12;
                                          }
                                        }
                                      }
                                      var3++;
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (wba.field_o == null) {
                                  break L6;
                                } else {
                                  if (null == this.field_P[var2_int]) {
                                    break L6;
                                  } else {
                                    if (wba.field_o.a(this.field_P[var2_int].field_c, (byte) 43, this.field_P[var2_int].field_a)) {
                                      break L6;
                                    } else {
                                      this.field_P[var2_int] = null;
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int++;
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2_int = 0;
                      var3 = 0;
                      L14: while (true) {
                        if (this.field_P.length <= var3) {
                          break L4;
                        } else {
                          if (var9 != 0) {
                            break L2;
                          } else {
                            stackOut_24_0 = null;
                            stackOut_24_1 = this.field_P[var3];
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            L15: {
                              if (stackIn_25_0 == stackIn_25_1) {
                                break L15;
                              } else {
                                var2_int++;
                                break L15;
                              }
                            }
                            var3++;
                            if (var9 == 0) {
                              continue L14;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var3_ref_dh__ = this.field_P;
                    this.field_P = new dh[var2_int];
                    var4 = 0;
                    var5 = 0;
                    L16: while (true) {
                      L17: {
                        if (var3_ref_dh__.length <= var5) {
                          break L17;
                        } else {
                          if (var9 != 0) {
                            break L2;
                          } else {
                            L18: {
                              if (var3_ref_dh__[var5] == null) {
                                break L18;
                              } else {
                                incrementValue$1 = var4;
                                var4++;
                                this.field_P[incrementValue$1] = var3_ref_dh__[var5];
                                break L18;
                              }
                            }
                            var5++;
                            if (var9 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      ag.a(-95, this.field_P);
                      break L2;
                    }
                  }
                }
              }
              stackOut_35_0 = this;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            }
            L19: {
              stackOut_36_0 = this;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (-1 <= (this.field_P.length ^ -1)) {
                stackOut_38_0 = this;
                stackOut_38_1 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L19;
              } else {
                stackOut_37_0 = this;
                stackOut_37_1 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L19;
              }
            }
            L20: {
              ((at) (this)).field_M = stackIn_39_1 != 0;
              if (!sta.g((byte) 97)) {
                stackOut_41_0 = 0;
                stackIn_42_0 = stackOut_41_0;
                break L20;
              } else {
                stackOut_40_0 = 1;
                stackIn_42_0 = stackOut_40_0;
                break L20;
              }
            }
            L21: {
              var2_int = stackIn_42_0;
              stackOut_42_0 = this;
              stackIn_44_0 = stackOut_42_0;
              stackIn_43_0 = stackOut_42_0;
              if (vpa.a(56)) {
                stackOut_44_0 = this;
                stackOut_44_1 = 0;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                break L21;
              } else {
                stackOut_43_0 = this;
                stackOut_43_1 = 1;
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                break L21;
              }
            }
            L22: {
              ((at) (this)).field_Y = stackIn_45_1 != 0;
              if (var2_int != 0) {
                stackOut_47_0 = 3;
                stackIn_48_0 = stackOut_47_0;
                break L22;
              } else {
                stackOut_46_0 = 2;
                stackIn_48_0 = stackOut_46_0;
                break L22;
              }
            }
            L23: {
              var3 = stackIn_48_0;
              if (var2_int == 0) {
                if (wba.field_o != null) {
                  if (wba.field_o.d(-1)) {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L23;
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_56_0 = stackOut_53_0;
                    break L23;
                  }
                } else {
                  stackOut_51_0 = 0;
                  stackIn_56_0 = stackOut_51_0;
                  break L23;
                }
              } else {
                stackOut_49_0 = 0;
                stackIn_56_0 = stackOut_49_0;
                break L23;
              }
            }
            L24: {
              L25: {
                var4 = stackIn_56_0;
                stackOut_56_0 = this;
                stackOut_56_1 = null;
                stackOut_56_2 = null;
                stackOut_56_3 = 10;
                stackIn_59_0 = stackOut_56_0;
                stackIn_59_1 = stackOut_56_1;
                stackIn_59_2 = stackOut_56_2;
                stackIn_59_3 = stackOut_56_3;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                stackIn_57_2 = stackOut_56_2;
                stackIn_57_3 = stackOut_56_3;
                if (var2_int != 0) {
                  break L25;
                } else {
                  stackOut_57_0 = this;
                  stackOut_57_1 = null;
                  stackOut_57_2 = null;
                  stackOut_57_3 = stackIn_57_3;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  stackIn_59_2 = stackOut_57_2;
                  stackIn_59_3 = stackOut_57_3;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  stackIn_58_2 = stackOut_57_2;
                  stackIn_58_3 = stackOut_57_3;
                  if (var4 != 0) {
                    break L25;
                  } else {
                    stackOut_58_0 = this;
                    stackOut_58_1 = null;
                    stackOut_58_2 = null;
                    stackOut_58_3 = stackIn_58_3;
                    stackOut_58_4 = 75;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_60_2 = stackOut_58_2;
                    stackIn_60_3 = stackOut_58_3;
                    stackIn_60_4 = stackOut_58_4;
                    break L24;
                  }
                }
              }
              stackOut_59_0 = this;
              stackOut_59_1 = null;
              stackOut_59_2 = null;
              stackOut_59_3 = stackIn_59_3;
              stackOut_59_4 = 58;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              stackIn_60_3 = stackOut_59_3;
              stackIn_60_4 = stackOut_59_4;
              break L24;
            }
            L26: {
              ((at) (this)).field_T = new sta(stackIn_60_3, stackIn_60_4, 410, 105, (isa) null, var3, 1);
              this.field_T.field_E = 83;
              this.field_T.a(5, 5, (byte) 97);
              this.a(this.field_T, -1);
              this.field_W = this.a(-82, ie.field_f, ke.field_a, (qc) (this));
              if (var2_int == 0) {
                break L26;
              } else {
                this.field_N = this.a(-87, rra.field_a, kka.field_o, (qc) (this));
                break L26;
              }
            }
            L27: {
              this.field_V = this.a(-94, ita.field_e, pa.field_c, (qc) (this));
              stackOut_62_0 = this;
              stackIn_64_0 = stackOut_62_0;
              stackIn_63_0 = stackOut_62_0;
              if (var2_int != 0) {
                stackOut_64_0 = this;
                stackOut_64_1 = 3;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                break L27;
              } else {
                stackOut_63_0 = this;
                stackOut_63_1 = 2;
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                break L27;
              }
            }
            L28: {
              ((at) (this)).field_U = new rj[stackIn_65_1];
              this.field_U[1] = this.field_V;
              if (var2_int == 0) {
                break L28;
              } else {
                this.field_U[2] = this.field_N;
                break L28;
              }
            }
            L29: {
              this.field_U[0] = this.field_W;
              if (!this.field_M) {
                break L29;
              } else {
                if (var2_int == 0) {
                  break L29;
                } else {
                  var5_ref_String__ = new String[this.field_P.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L30: while (true) {
                    L31: {
                      L32: {
                        if (this.field_P.length <= var7_int) {
                          break L32;
                        } else {
                          var8 = this.field_P[var7_int];
                          if (var9 != 0) {
                            break L31;
                          } else {
                            L33: {
                              if (dq.field_f == null) {
                                break L33;
                              } else {
                                if (wba.field_o.field_s != var8.field_a) {
                                  break L33;
                                } else {
                                  if (wba.field_o.field_p != var8.field_c) {
                                    break L33;
                                  } else {
                                    var6_int = var7_int;
                                    break L33;
                                  }
                                }
                              }
                            }
                            var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_c;
                            var7_int++;
                            if (var9 == 0) {
                              continue L30;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      this.field_ab = new rla(var5_ref_String__, var6_int, 150);
                      this.field_ab.a((byte) -31, 126, 18, this.field_V.field_i + this.field_T.field_i, -19 + (this.field_V.field_p + (this.field_V.field_n + this.field_T.field_n)));
                      break L31;
                    }
                    this.field_u.a((byte) 126, (vg) (this.field_ab));
                    break L29;
                  }
                }
              }
            }
            L34: {
              L35: {
                this.field_Z = this.a((qc) (this), po.field_i, 30815);
                var5 = this.field_Z.field_m / 2 + this.field_Z.field_i;
                this.field_Z.field_m = 150;
                this.field_Z.field_i = -this.field_Z.field_m + (var5 - 20);
                this.field_L = this.a((qc) (this), wm.field_b, 30815);
                this.field_L.field_y = false;
                this.field_L.field_i = var5 - -20;
                this.field_L.field_m = this.field_Z.field_m;
                if (var2_int != 0) {
                  break L35;
                } else {
                  if (var4 == 0) {
                    break L34;
                  } else {
                    break L35;
                  }
                }
              }
              L36: {
                if (var2_int == 0) {
                  stackOut_83_0 = tla.field_a;
                  stackIn_84_0 = stackOut_83_0;
                  break L36;
                } else {
                  stackOut_82_0 = ab.field_w;
                  stackIn_84_0 = stackOut_82_0;
                  break L36;
                }
              }
              var10 = stackIn_84_0;
              var6_ref = var10;
              var7 = new ae(var10, (qc) null);
              var7.field_m = this.field_m;
              var7.field_p = 80;
              var7.field_n = 163;
              var7.field_i = 0;
              var7.field_r = (isa) ((Object) new vpa(mj.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.a(var7, -1);
              break L34;
            }
            L37: {
              this.field_O = false;
              var6 = this.g(-46);
              if (var6 == null) {
                break L37;
              } else {
                var6.field_w = true;
                break L37;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var2 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var2);
            stackOut_88_1 = new StringBuilder().append("at.<init>(");
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param0 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L38;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L38;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ')');
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        boolean discarded$22 = false;
        boolean discarded$23 = false;
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_36_0 = 0;
        rj stackIn_40_0 = null;
        Object stackIn_40_1 = null;
        rj stackIn_41_0 = null;
        Object stackIn_41_1 = null;
        rj stackIn_42_0 = null;
        Object stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_43_0 = 0;
        rj stackIn_46_0 = null;
        Object stackIn_46_1 = null;
        rj stackIn_47_0 = null;
        Object stackIn_47_1 = null;
        rj stackIn_48_0 = null;
        Object stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_49_0 = 0;
        rj stackIn_56_0 = null;
        Object stackIn_56_1 = null;
        rj stackIn_57_0 = null;
        Object stackIn_57_1 = null;
        rj stackIn_58_0 = null;
        Object stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        rj stackIn_67_0 = null;
        Object stackIn_67_1 = null;
        rj stackIn_68_0 = null;
        Object stackIn_68_1 = null;
        rj stackIn_69_0 = null;
        Object stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        rj stackIn_82_0 = null;
        Object stackIn_82_1 = null;
        rj stackIn_83_0 = null;
        Object stackIn_83_1 = null;
        rj stackIn_84_0 = null;
        Object stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_85_0 = 0;
        rj stackIn_92_0 = null;
        Object stackIn_92_1 = null;
        rj stackIn_93_0 = null;
        Object stackIn_93_1 = null;
        rj stackIn_94_0 = null;
        Object stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_96_0 = 0;
        boolean stackIn_100_0 = false;
        Object stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        Object stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        Object stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_55_0 = null;
        Object stackOut_55_1 = null;
        rj stackOut_57_0 = null;
        Object stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        rj stackOut_56_0 = null;
        Object stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_59_0 = 0;
        rj stackOut_66_0 = null;
        Object stackOut_66_1 = null;
        rj stackOut_68_0 = null;
        Object stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        rj stackOut_67_0 = null;
        Object stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_72_0 = 0;
        rj stackOut_91_0 = null;
        Object stackOut_91_1 = null;
        rj stackOut_93_0 = null;
        Object stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        rj stackOut_92_0 = null;
        Object stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_95_0 = 0;
        rj stackOut_81_0 = null;
        Object stackOut_81_1 = null;
        rj stackOut_83_0 = null;
        Object stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        rj stackOut_82_0 = null;
        Object stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_35_0 = 0;
        rj stackOut_39_0 = null;
        Object stackOut_39_1 = null;
        rj stackOut_41_0 = null;
        Object stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        rj stackOut_40_0 = null;
        Object stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_42_0 = 0;
        rj stackOut_45_0 = null;
        Object stackOut_45_1 = null;
        rj stackOut_47_0 = null;
        Object stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        rj stackOut_46_0 = null;
        Object stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_48_0 = 0;
        boolean stackOut_99_0 = false;
        Object stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        Object stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        Object stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (!this.field_W.b((byte) -34)) {
                L2: {
                  if (this.field_N == null) {
                    break L2;
                  } else {
                    if (!this.field_N.b((byte) -34)) {
                      break L2;
                    } else {
                      var5 = this.field_N;
                      break L1;
                    }
                  }
                }
                if (!this.field_V.b((byte) -34)) {
                  if (this.field_Z.b((byte) -34)) {
                    var5 = this.field_Z;
                    break L1;
                  } else {
                    if (this.field_L.b((byte) -34)) {
                      var5 = this.field_L;
                      break L1;
                    } else {
                      if (!this.field_W.field_w) {
                        L3: {
                          if (this.field_N == null) {
                            break L3;
                          } else {
                            if (!this.field_N.field_w) {
                              break L3;
                            } else {
                              var5 = this.field_N;
                              break L1;
                            }
                          }
                        }
                        if (!this.field_V.field_w) {
                          break L1;
                        } else {
                          var5 = this.field_V;
                          break L1;
                        }
                      } else {
                        var5 = this.field_W;
                        break L1;
                      }
                    }
                  }
                } else {
                  var5 = this.field_V;
                  break L1;
                }
              } else {
                var5 = this.field_W;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var6 = param2;
                  if (96 != var6) {
                    break L6;
                  } else {
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-98 != (var6 ^ -1)) {
                    break L7;
                  } else {
                    if (var7 == 0) {
                      if (var5 == this.field_W) {
                        L8: {
                          L9: {
                            if (null == this.field_N) {
                              break L9;
                            } else {
                              discarded$13 = this.field_N.a((ae) (this), false);
                              if (var7 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            stackOut_55_0 = this.field_V;
                            stackOut_55_1 = this;
                            stackIn_57_0 = stackOut_55_0;
                            stackIn_57_1 = stackOut_55_1;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            if (param3) {
                              stackOut_57_0 = (rj) ((Object) stackIn_57_0);
                              stackOut_57_1 = this;
                              stackOut_57_2 = 0;
                              stackIn_58_0 = stackOut_57_0;
                              stackIn_58_1 = stackOut_57_1;
                              stackIn_58_2 = stackOut_57_2;
                              break L10;
                            } else {
                              stackOut_56_0 = (rj) ((Object) stackIn_56_0);
                              stackOut_56_1 = this;
                              stackOut_56_2 = 1;
                              stackIn_58_0 = stackOut_56_0;
                              stackIn_58_1 = stackOut_56_1;
                              stackIn_58_2 = stackOut_56_2;
                              break L10;
                            }
                          }
                          discarded$14 = ((rj) (Object) stackIn_58_0).a((ae) (this), stackIn_58_2 != 0);
                          break L8;
                        }
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (var5 != this.field_N) {
                          if (this.field_Z != var5) {
                            break L4;
                          } else {
                            if (!this.field_L.field_y) {
                              break L4;
                            } else {
                              L11: {
                                stackOut_66_0 = this.field_L;
                                stackOut_66_1 = this;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                stackIn_67_0 = stackOut_66_0;
                                stackIn_67_1 = stackOut_66_1;
                                if (param3) {
                                  stackOut_68_0 = (rj) ((Object) stackIn_68_0);
                                  stackOut_68_1 = this;
                                  stackOut_68_2 = 0;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  stackIn_69_2 = stackOut_68_2;
                                  break L11;
                                } else {
                                  stackOut_67_0 = (rj) ((Object) stackIn_67_0);
                                  stackOut_67_1 = this;
                                  stackOut_67_2 = 1;
                                  stackIn_69_0 = stackOut_67_0;
                                  stackIn_69_1 = stackOut_67_1;
                                  stackIn_69_2 = stackOut_67_2;
                                  break L11;
                                }
                              }
                              discarded$15 = ((rj) (Object) stackIn_69_0).a((ae) (this), stackIn_69_2 != 0);
                              stackOut_69_0 = 1;
                              stackIn_70_0 = stackOut_69_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                        } else {
                          discarded$16 = this.field_V.a((ae) (this), false);
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if (var6 == 98) {
                  if (var5 != this.field_Z) {
                    if (this.field_L == var5) {
                      discarded$17 = this.field_V.a((ae) (this), false);
                      stackOut_76_0 = 1;
                      stackIn_77_0 = stackOut_76_0;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      break L4;
                    }
                  } else {
                    discarded$18 = this.field_W.a((ae) (this), false);
                    stackOut_72_0 = 1;
                    stackIn_73_0 = stackOut_72_0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  if (var6 != 99) {
                    break L4;
                  } else {
                    if (var7 == 0) {
                      L12: {
                        if (var5 == this.field_W) {
                          break L12;
                        } else {
                          if (this.field_N != var5) {
                            if (var5 == this.field_V) {
                              L13: {
                                L14: {
                                  if (!this.field_L.field_y) {
                                    break L14;
                                  } else {
                                    discarded$19 = this.field_L.a((ae) (this), false);
                                    if (var7 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  stackOut_91_0 = this.field_Z;
                                  stackOut_91_1 = this;
                                  stackIn_93_0 = stackOut_91_0;
                                  stackIn_93_1 = stackOut_91_1;
                                  stackIn_92_0 = stackOut_91_0;
                                  stackIn_92_1 = stackOut_91_1;
                                  if (param3) {
                                    stackOut_93_0 = (rj) ((Object) stackIn_93_0);
                                    stackOut_93_1 = this;
                                    stackOut_93_2 = 0;
                                    stackIn_94_0 = stackOut_93_0;
                                    stackIn_94_1 = stackOut_93_1;
                                    stackIn_94_2 = stackOut_93_2;
                                    break L15;
                                  } else {
                                    stackOut_92_0 = (rj) ((Object) stackIn_92_0);
                                    stackOut_92_1 = this;
                                    stackOut_92_2 = 1;
                                    stackIn_94_0 = stackOut_92_0;
                                    stackIn_94_1 = stackOut_92_1;
                                    stackIn_94_2 = stackOut_92_2;
                                    break L15;
                                  }
                                }
                                discarded$20 = ((rj) (Object) stackIn_94_0).a((ae) (this), stackIn_94_2 != 0);
                                break L13;
                              }
                              stackOut_95_0 = 1;
                              stackIn_96_0 = stackOut_95_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L4;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L16: {
                        stackOut_81_0 = this.field_Z;
                        stackOut_81_1 = this;
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_83_1 = stackOut_81_1;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        if (param3) {
                          stackOut_83_0 = (rj) ((Object) stackIn_83_0);
                          stackOut_83_1 = this;
                          stackOut_83_2 = 0;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          stackIn_84_2 = stackOut_83_2;
                          break L16;
                        } else {
                          stackOut_82_0 = (rj) ((Object) stackIn_82_0);
                          stackOut_82_1 = this;
                          stackOut_82_2 = 1;
                          stackIn_84_0 = stackOut_82_0;
                          stackIn_84_1 = stackOut_82_1;
                          stackIn_84_2 = stackOut_82_2;
                          break L16;
                        }
                      }
                      discarded$21 = ((rj) (Object) stackIn_84_0).a((ae) (this), stackIn_84_2 != 0);
                      stackOut_84_0 = 1;
                      stackIn_85_0 = stackOut_84_0;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (var5 == this.field_V) {
                L17: {
                  if (null != this.field_N) {
                    break L17;
                  } else {
                    discarded$22 = this.field_W.a((ae) (this), false);
                    if (var7 == 0) {
                      stackOut_35_0 = 1;
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L17;
                    }
                  }
                }
                discarded$23 = this.field_N.a((ae) (this), false);
                return true;
              } else {
                if (this.field_N == var5) {
                  L18: {
                    stackOut_39_0 = this.field_W;
                    stackOut_39_1 = this;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (param3) {
                      stackOut_41_0 = (rj) ((Object) stackIn_41_0);
                      stackOut_41_1 = this;
                      stackOut_41_2 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L18;
                    } else {
                      stackOut_40_0 = (rj) ((Object) stackIn_40_0);
                      stackOut_40_1 = this;
                      stackOut_40_2 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      break L18;
                    }
                  }
                  discarded$24 = ((rj) (Object) stackIn_42_0).a((ae) (this), stackIn_42_2 != 0);
                  stackOut_42_0 = 1;
                  stackIn_43_0 = stackOut_42_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (this.field_L != var5) {
                    break L4;
                  } else {
                    L19: {
                      stackOut_45_0 = this.field_Z;
                      stackOut_45_1 = this;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      if (param3) {
                        stackOut_47_0 = (rj) ((Object) stackIn_47_0);
                        stackOut_47_1 = this;
                        stackOut_47_2 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        break L19;
                      } else {
                        stackOut_46_0 = (rj) ((Object) stackIn_46_0);
                        stackOut_46_1 = this;
                        stackOut_46_2 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        break L19;
                      }
                    }
                    discarded$25 = ((rj) (Object) stackIn_48_0).a((ae) (this), stackIn_48_2 != 0);
                    stackOut_48_0 = 1;
                    stackIn_49_0 = stackOut_48_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            L20: {
              if (param3) {
                break L20;
              } else {
                this.field_O = false;
                break L20;
              }
            }
            stackOut_99_0 = super.a(param0, param1, param2, true);
            stackIn_100_0 = stackOut_99_0;
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = var5;
            stackOut_101_1 = new StringBuilder().append("at.P(").append(param0).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_103_0 = stackIn_103_0;
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L21;
            } else {
              stackOut_102_0 = stackIn_102_0;
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_36_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_43_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_49_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_60_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_63_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_70_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_73_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_77_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_85_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_96_0 != 0;
                          } else {
                            return stackIn_100_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != this.field_Z) {
                L2: {
                  if (this.field_L != param2) {
                    break L2;
                  } else {
                    this.i(-1);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param2 == this.field_W) {
                    break L3;
                  } else {
                    L4: {
                      if (param2 != this.field_N) {
                        break L4;
                      } else {
                        this.a(20306, param2);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (this.field_ab != null) {
                        if (this.field_ab.field_f) {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L5;
                        } else {
                          stackOut_13_0 = 0;
                          stackIn_16_0 = stackOut_13_0;
                          break L5;
                        }
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_16_0 = stackOut_11_0;
                        break L5;
                      }
                    }
                    L6: {
                      var6_int = stackIn_16_0;
                      if (var6_int != 0) {
                        break L6;
                      } else {
                        if (this.field_V != param2) {
                          break L6;
                        } else {
                          L7: {
                            if (this.field_M) {
                              break L7;
                            } else {
                              this.field_z.c(new gga(this.field_z, gj.field_o), 95);
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (-1 > (wla.field_ub ^ -1)) {
                              break L8;
                            } else {
                              this.field_z.c(new bra(this.field_z), 84);
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          this.a(20306, param2);
                          break L6;
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(20306, param2);
                if (var7 == 0) {
                  break L1;
                } else {
                  this.h(-8266);
                  break L1;
                }
              } else {
                this.h(-8266);
                break L1;
              }
            }
            L9: {
              if (param4 >= 44) {
                break L9;
              } else {
                this.field_S = (rj) null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("at.M(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void h(int param0) {
        rj discarded$0 = null;
        if (!this.field_B) {
            return;
        }
        this.field_B = false;
        if (param0 != -8266) {
            qc var3 = (qc) null;
            discarded$0 = this.a(-99, (hja[]) null, (String) null, (qc) null);
        }
    }

    private final void a(int param0, rj param1) {
        boolean discarded$6 = false;
        rj discarded$7 = null;
        rj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dh var5 = null;
        qc var6 = null;
        rj stackIn_1_0 = null;
        rj stackIn_2_0 = null;
        rj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_0_0 = null;
        rj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        rj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              this.field_S = param1;
              discarded$6 = param1.a((ae) (this), false);
              var3 = this.g(-46);
              stackOut_0_0 = this.field_L;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param1 == var3) {
                stackOut_2_0 = (rj) ((Object) stackIn_2_0);
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (rj) ((Object) stackIn_1_0);
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_y = stackIn_3_1 != 0;
              if (param0 == 20306) {
                break L2;
              } else {
                var6 = (qc) null;
                discarded$7 = this.a(-82, (hja[]) null, (String) null, (qc) null);
                break L2;
              }
            }
            L3: {
              if (param1 == this.field_V) {
                if (var3 == param1) {
                  L4: {
                    if (this.field_ab != null) {
                      L5: {
                        var4 = this.field_ab.i((byte) 126);
                        var5 = this.field_P[var4];
                        if (wba.field_o.field_s != var5.field_a) {
                          break L5;
                        } else {
                          if (wba.field_o.field_p != var5.field_c) {
                            break L5;
                          } else {
                            this.j((byte) -30);
                            break L3;
                          }
                        }
                      }
                      this.field_L.field_y = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.j((byte) -30);
                  break L3;
                } else {
                  this.j((byte) -30);
                  break L3;
                }
              } else {
                this.j((byte) -30);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("at.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static boolean f(int param0) {
        if (param0 != 24316) {
            field_Q = (String) null;
        }
        return ota.a(ica.field_b, (byte) 13, mn.field_n);
    }

    private final rj a(qc param0, String param1, int param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_2_0 = null;
        rj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_3_0 = null;
        rj stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4 = new rj(param1, param0);
            var4.field_r = (isa) ((Object) new td());
            var5 = -46 + this.field_p;
            if (param2 == 30815) {
              var4.a((byte) -31, this.field_m - 30, 30, 15, var5);
              this.a(var4, param2 + -30816);
              stackOut_3_0 = (rj) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (rj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("at.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final rj g(int param0) {
        if (dq.field_f != null) {
            return this.field_V;
        }
        if (param0 != -46) {
            return (rj) null;
        }
        if (null != wba.field_o) {
            if (wba.field_o.field_h) {
                if (!(this.field_N == null)) {
                    return this.field_N;
                }
            }
        }
        return this.field_W;
    }

    private final void i(int param0) {
        rj discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            var4 = (String) null;
            discarded$2 = this.a((qc) null, (String) null, -2);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (this.field_W == this.field_S) {
                break L3;
              } else {
                L4: {
                  if (this.field_S == this.field_N) {
                    break L4;
                  } else {
                    if (this.field_S == this.field_V) {
                      L5: {
                        if (null != this.field_ab) {
                          var2 = this.field_ab.i((byte) 123);
                          if (-1 < (var2 ^ -1)) {
                            break L5;
                          } else {
                            wba.field_o.a(this.field_P[var2].field_a, this.field_P[var2].field_c, -1);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      in.a(-30600, true);
                      this.field_z.c(new op(this.field_z), 89);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      this.field_L.field_y = false;
                      break L1;
                    }
                  }
                }
                og.b(0);
                cva.a(-117);
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            og.b(param0 + 1);
            kla.b(0);
            break L2;
          }
          this.field_L.field_y = false;
          break L1;
        }
    }

    private final void j(byte param0) {
        rj[] var2 = null;
        int var3 = 0;
        rj var4 = null;
        int var5 = 0;
        qc var6 = null;
        rj[] var7 = null;
        rj stackIn_3_0 = null;
        rj stackIn_4_0 = null;
        rj stackIn_5_0 = null;
        rj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        rj stackIn_9_0 = null;
        rj stackOut_2_0 = null;
        rj stackOut_3_0 = null;
        rj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        rj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        rj stackOut_8_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var7 = this.field_U;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (var3 >= var7.length) {
                  break L3;
                } else {
                  var4 = var7[var3];
                  stackOut_2_0 = (rj) (var4);
                  stackIn_9_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      stackOut_3_0 = (rj) ((Object) stackIn_3_0);
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (this.field_S != var4) {
                        stackOut_5_0 = (rj) ((Object) stackIn_5_0);
                        stackOut_5_1 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        break L4;
                      } else {
                        stackOut_4_0 = (rj) ((Object) stackIn_4_0);
                        stackOut_4_1 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        break L4;
                      }
                    }
                    stackIn_6_0.field_w = stackIn_6_1 != 0;
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (param0 == -30) {
                break L1;
              } else {
                var6 = (qc) null;
                stackOut_8_0 = this.a(-33, (hja[]) null, (String) null, (qc) null);
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
            }
            break L1;
          }
          return;
        }
    }

    public static void i(byte param0) {
        field_Q = null;
        field_R = null;
        int var1 = -92 / ((26 - param0) / 46);
    }

    final void a(int param0, int param1, ae param2, int param3) {
        boolean discarded$3 = false;
        rj[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        rj var7 = null;
        int var8 = 0;
        rj[] var9 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_8_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (!qma.field_c) {
                  break L2;
                } else {
                  param2.f((byte) -103);
                  var9 = this.field_U;
                  var5 = var9;
                  var6 = 0;
                  L3: while (true) {
                    if (var9.length <= var6) {
                      break L2;
                    } else {
                      var7 = var9[var6];
                      stackOut_4_0 = var7.field_f;
                      stackIn_9_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (!stackIn_5_0) {
                            break L4;
                          } else {
                            discarded$3 = var7.a((ae) (this), false);
                            break L4;
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = this.field_Y;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
            L5: {
              if (stackIn_9_0) {
                break L5;
              } else {
                if (vpa.a(127)) {
                  break L5;
                } else {
                  this.h(-8266);
                  this.field_z.c(new at(this.field_z), 109);
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_ab == null) {
                break L6;
              } else {
                L7: {
                  if (this.field_ab.j((byte) -125)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L7;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L7;
                  }
                }
                if (stackIn_16_0 == (this.field_O ? 1 : 0)) {
                  this.a(20306, this.field_V);
                  this.field_O = this.field_ab.j((byte) 76);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5_ref);
            stackOut_20_1 = new StringBuilder().append("at.A(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    private final rj a(int param0, hja[] param1, String param2, qc param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        sta var6 = null;
        rj var7 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var5 = new rj(param2, param3);
              var5.field_r = (isa) ((Object) new tka(param1));
              if (param0 < -81) {
                break L1;
              } else {
                this.field_L = (rj) null;
                break L1;
              }
            }
            var6 = this.field_T;
            var7 = var5;
            var6.b(0, var7, var6.field_E);
            this.field_T.c((byte) 124);
            stackOut_2_0 = (rj) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("at.U(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_X = 0;
        field_R = "Pressure pads trigger doors or traps, when activated by the weight of an idol, block, body or skeleton.";
        field_Q = "<%0> failed to finish";
    }
}
