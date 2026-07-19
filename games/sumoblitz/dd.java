/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends hf implements ai {
    private cd[] field_Z;
    private boolean field_S;
    private wp field_O;
    private wp field_Y;
    private wp field_Q;
    private ld field_ab;
    private boolean field_R;
    private wp[] field_V;
    private wp field_X;
    private wp field_T;
    private boolean field_W;
    private nd field_U;
    private wp field_P;

    private final wp g(byte param0) {
        if (null != gk.field_o) {
          return this.field_T;
        } else {
          L0: {
            if (vv.field_b == null) {
              break L0;
            } else {
              if (!vv.field_b.field_g) {
                break L0;
              } else {
                if (null != this.field_Y) {
                  return this.field_Y;
                } else {
                  break L0;
                }
              }
            }
          }
          if (param0 != -2) {
            return (wp) null;
          } else {
            return this.field_X;
          }
        }
    }

    private final void k(int param0) {
        if (param0 < 3) {
            return;
        }
        if (!(this.field_D)) {
            return;
        }
        this.field_D = false;
    }

    dd(dg param0) {
        super(param0, 430, 254);
        int incrementValue$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        cd[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        wp var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        pk var7 = null;
        cd var8 = null;
        int var9 = 0;
        String var10 = null;
        Object stackIn_5_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_11_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_57_0 = null;
        nd stackIn_57_1 = null;
        nd stackIn_57_2 = null;
        int stackIn_57_3 = 0;
        Object stackIn_58_0 = null;
        nd stackIn_58_1 = null;
        nd stackIn_58_2 = null;
        int stackIn_58_3 = 0;
        Object stackIn_59_0 = null;
        nd stackIn_59_1 = null;
        nd stackIn_59_2 = null;
        int stackIn_59_3 = 0;
        Object stackIn_60_0 = null;
        nd stackIn_60_1 = null;
        nd stackIn_60_2 = null;
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
        cd stackOut_5_0 = null;
        cd stackOut_10_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_56_0 = null;
        nd stackOut_56_1 = null;
        nd stackOut_56_2 = null;
        int stackOut_56_3 = 0;
        Object stackOut_57_0 = null;
        nd stackOut_57_1 = null;
        nd stackOut_57_2 = null;
        int stackOut_57_3 = 0;
        Object stackOut_59_0 = null;
        nd stackOut_59_1 = null;
        nd stackOut_59_2 = null;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        Object stackOut_58_0 = null;
        nd stackOut_58_1 = null;
        nd stackOut_58_2 = null;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
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
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Z = ul.a((byte) -110, lt.field_m);
                if (this.field_Z.length <= 0) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    L4: {
                      if (this.field_Z.length <= var2_int) {
                        break L4;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_36_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          stackOut_5_0 = ((dd) (this)).field_Z[var2_int];
                          stackIn_6_0 = stackOut_5_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (stackIn_6_0 != null) {
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
                                  if (this.field_Z.length <= var3) {
                                    break L9;
                                  } else {
                                    stackOut_10_0 = this.field_Z[var3];
                                    stackIn_6_0 = stackOut_10_0;
                                    stackIn_11_0 = stackOut_10_0;
                                    if (var9 != 0) {
                                      continue L5;
                                    } else {
                                      L10: {
                                        L11: {
                                          if (stackIn_11_0 != null) {
                                            break L11;
                                          } else {
                                            if (var9 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        if (this.field_Z[var2_int].field_a != this.field_Z[var3].field_a) {
                                          break L10;
                                        } else {
                                          if (this.field_Z[var2_int].field_g != this.field_Z[var3].field_g) {
                                            break L10;
                                          } else {
                                            this.field_Z[var3] = null;
                                            break L10;
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
                                if (null == vv.field_b) {
                                  break L6;
                                } else {
                                  if (this.field_Z[var2_int] == null) {
                                    break L6;
                                  } else {
                                    if (vv.field_b.a(this.field_Z[var2_int].field_g, (byte) -54, this.field_Z[var2_int].field_a)) {
                                      break L6;
                                    } else {
                                      this.field_Z[var2_int] = null;
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
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var2_int = 0;
                    var3 = 0;
                    L12: while (true) {
                      L13: {
                        if (var3 >= this.field_Z.length) {
                          break L13;
                        } else {
                          if (var9 != 0) {
                            break L2;
                          } else {
                            L14: {
                              if (null == this.field_Z[var3]) {
                                break L14;
                              } else {
                                var2_int++;
                                break L14;
                              }
                            }
                            var3++;
                            if (var9 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var3_ref_cd__ = this.field_Z;
                      this.field_Z = new cd[var2_int];
                      var4 = 0;
                      var5 = 0;
                      L15: while (true) {
                        L16: {
                          if (var5 >= var3_ref_cd__.length) {
                            break L16;
                          } else {
                            if (var9 != 0) {
                              break L2;
                            } else {
                              L17: {
                                if (null == var3_ref_cd__[var5]) {
                                  break L17;
                                } else {
                                  incrementValue$1 = var4;
                                  var4++;
                                  this.field_Z[incrementValue$1] = var3_ref_cd__[var5];
                                  break L17;
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        cb.a(this.field_Z, true);
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_35_0 = this;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            }
            L18: {
              stackOut_36_0 = this;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if ((this.field_Z.length ^ -1) >= -1) {
                stackOut_38_0 = this;
                stackOut_38_1 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L18;
              } else {
                stackOut_37_0 = this;
                stackOut_37_1 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L18;
              }
            }
            L19: {
              ((dd) (this)).field_R = stackIn_39_1 != 0;
              if (!jt.a((byte) -90)) {
                stackOut_41_0 = 0;
                stackIn_42_0 = stackOut_41_0;
                break L19;
              } else {
                stackOut_40_0 = 1;
                stackIn_42_0 = stackOut_40_0;
                break L19;
              }
            }
            L20: {
              var2_int = stackIn_42_0;
              if (var2_int == 0) {
                stackOut_44_0 = 2;
                stackIn_45_0 = stackOut_44_0;
                break L20;
              } else {
                stackOut_43_0 = 3;
                stackIn_45_0 = stackOut_43_0;
                break L20;
              }
            }
            L21: {
              var3 = stackIn_45_0;
              stackOut_45_0 = this;
              stackIn_47_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (vs.b((byte) 9)) {
                stackOut_47_0 = this;
                stackOut_47_1 = 0;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                break L21;
              } else {
                stackOut_46_0 = this;
                stackOut_46_1 = 1;
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                break L21;
              }
            }
            L22: {
              ((dd) (this)).field_W = stackIn_48_1 != 0;
              if (var2_int == 0) {
                if (vv.field_b != null) {
                  if (vv.field_b.f(-1)) {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L22;
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_56_0 = stackOut_53_0;
                    break L22;
                  }
                } else {
                  stackOut_51_0 = 0;
                  stackIn_56_0 = stackOut_51_0;
                  break L22;
                }
              } else {
                stackOut_49_0 = 0;
                stackIn_56_0 = stackOut_49_0;
                break L22;
              }
            }
            L23: {
              L24: {
                var4 = stackIn_56_0;
                stackOut_56_0 = this;
                stackOut_56_1 = null;
                stackOut_56_2 = null;
                stackOut_56_3 = 10;
                stackIn_58_0 = stackOut_56_0;
                stackIn_58_1 = stackOut_56_1;
                stackIn_58_2 = stackOut_56_2;
                stackIn_58_3 = stackOut_56_3;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                stackIn_57_2 = stackOut_56_2;
                stackIn_57_3 = stackOut_56_3;
                if (var2_int != 0) {
                  break L24;
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
                  if (var4 == 0) {
                    stackOut_59_0 = this;
                    stackOut_59_1 = null;
                    stackOut_59_2 = null;
                    stackOut_59_3 = stackIn_59_3;
                    stackOut_59_4 = 75;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    stackIn_60_4 = stackOut_59_4;
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              stackOut_58_0 = this;
              stackOut_58_1 = null;
              stackOut_58_2 = null;
              stackOut_58_3 = stackIn_58_3;
              stackOut_58_4 = 58;
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              stackIn_60_3 = stackOut_58_3;
              stackIn_60_4 = stackOut_58_4;
              break L23;
            }
            L25: {
              ((dd) (this)).field_U = new nd(stackIn_60_3, stackIn_60_4, 410, 105, (mh) null, var3, 1);
              this.field_U.field_K = 83;
              this.field_U.c(-1, 5, 5);
              this.a(this.field_U, 93);
              this.field_X = this.a(sb.field_d, (qm) (this), kp.field_b, (byte) -105);
              if (var2_int == 0) {
                break L25;
              } else {
                this.field_Y = this.a(kn.field_f, (qm) (this), hq.field_c, (byte) 122);
                break L25;
              }
            }
            L26: {
              this.field_T = this.a(sm.field_c, (qm) (this), dj.field_o, (byte) 110);
              stackOut_62_0 = this;
              stackIn_64_0 = stackOut_62_0;
              stackIn_63_0 = stackOut_62_0;
              if (var2_int != 0) {
                stackOut_64_0 = this;
                stackOut_64_1 = 3;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                break L26;
              } else {
                stackOut_63_0 = this;
                stackOut_63_1 = 2;
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                break L26;
              }
            }
            L27: {
              ((dd) (this)).field_V = new wp[stackIn_65_1];
              this.field_V[0] = this.field_X;
              if (var2_int == 0) {
                break L27;
              } else {
                this.field_V[2] = this.field_Y;
                break L27;
              }
            }
            L28: {
              this.field_V[1] = this.field_T;
              if (!this.field_R) {
                break L28;
              } else {
                if (var2_int == 0) {
                  break L28;
                } else {
                  var5_ref_String__ = new String[this.field_Z.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (var7_int >= this.field_Z.length) {
                          break L31;
                        } else {
                          var8 = this.field_Z[var7_int];
                          if (var9 != 0) {
                            break L30;
                          } else {
                            L32: {
                              if (null == gk.field_o) {
                                break L32;
                              } else {
                                if (var8.field_a != vv.field_b.field_s) {
                                  break L32;
                                } else {
                                  if (var8.field_g != vv.field_b.field_c) {
                                    break L32;
                                  } else {
                                    var6_int = var7_int;
                                    break L32;
                                  }
                                }
                              }
                            }
                            var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_g;
                            var7_int++;
                            if (var9 == 0) {
                              continue L29;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      this.field_ab = new ld(var5_ref_String__, var6_int, 150);
                      this.field_ab.a(-103, this.field_T.field_r + this.field_U.field_r, -19 + (this.field_T.field_p + this.field_U.field_v - -this.field_T.field_v), 18, 126);
                      break L30;
                    }
                    this.field_y.a(this.field_ab, -10295);
                    break L28;
                  }
                }
              }
            }
            L33: {
              L34: {
                this.field_P = this.a(-73, (qm) (this), jh.field_A);
                var5 = this.field_P.field_r + this.field_P.field_q / 2;
                this.field_P.field_q = 150;
                this.field_P.field_r = -20 + var5 - this.field_P.field_q;
                this.field_Q = this.a(-128, (qm) (this), dn.field_a);
                this.field_Q.field_x = false;
                this.field_Q.field_q = this.field_P.field_q;
                this.field_Q.field_r = var5 - -20;
                if (var2_int != 0) {
                  break L34;
                } else {
                  if (var4 == 0) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              L35: {
                if (var2_int == 0) {
                  stackOut_83_0 = lw.field_c;
                  stackIn_84_0 = stackOut_83_0;
                  break L35;
                } else {
                  stackOut_82_0 = sl.field_e;
                  stackIn_84_0 = stackOut_82_0;
                  break L35;
                }
              }
              var10 = stackIn_84_0;
              var6_ref = var10;
              var7 = new pk(var10, (qm) null);
              var7.field_r = 0;
              var7.field_q = this.field_q;
              var7.field_p = 80;
              var7.field_v = 163;
              var7.field_w = (mh) ((Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.a(var7, 125);
              break L33;
            }
            L36: {
              this.field_S = false;
              var6 = this.g((byte) -2);
              if (var6 == null) {
                break L36;
              } else {
                var6.field_C = true;
                break L36;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var2 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var2);
            stackOut_88_1 = new StringBuilder().append("dd.<init>(");
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
              break L37;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L37;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ')');
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 710) {
              L1: {
                L2: {
                  if (param2 != this.field_P) {
                    break L2;
                  } else {
                    this.k(124);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (this.field_Q != param2) {
                    break L3;
                  } else {
                    this.h((byte) 103);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param2 == this.field_X) {
                    break L4;
                  } else {
                    L5: {
                      if (param2 == this.field_Y) {
                        break L5;
                      } else {
                        L6: {
                          if (this.field_ab != null) {
                            if (this.field_ab.field_k) {
                              stackOut_15_0 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              break L6;
                            } else {
                              stackOut_14_0 = 0;
                              stackIn_17_0 = stackOut_14_0;
                              break L6;
                            }
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_17_0 = stackOut_12_0;
                            break L6;
                          }
                        }
                        L7: {
                          var6_int = stackIn_17_0;
                          if (var6_int != 0) {
                            break L7;
                          } else {
                            if (param2 != this.field_T) {
                              break L7;
                            } else {
                              L8: {
                                if (!this.field_R) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (ct.field_x > 0) {
                                      break L9;
                                    } else {
                                      this.field_E.a((byte) 115, new kq(this.field_E));
                                      if (var7 == 0) {
                                        break L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  this.a(param2, param1 + -710);
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              this.field_E.a((byte) 98, new u(this.field_E, ku.field_I));
                              break L7;
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.a(param2, 0);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                this.a(param2, 0);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var6);
            stackOut_31_1 = new StringBuilder().append("dd.C(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        lt var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        qv var4 = null;
        lt stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        lt stackOut_3_0 = null;
        ms stackOut_5_0 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (lt) ((Object) em.field_d.b(-75));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    cl.a((byte) -97, var2, param1);
                    stackOut_3_0 = (lt) ((Object) em.field_d.d((byte) 18));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = ak.field_b.b(109);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var4 = (qv) ((Object) stackIn_6_0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      ss.a(param1, 1000, var4);
                      var4 = (qv) ((Object) ak.field_b.d((byte) 18));
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 == 28778) {
                    break L5;
                  } else {
                    dd.a(-77, -57);
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "dd.W(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        wp discarded$14 = null;
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
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_79_0 = 0;
        boolean stackIn_81_0 = false;
        Object stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        Object stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        Object stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        boolean stackOut_80_0 = false;
        Object stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        Object stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        Object stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param2 >= 9) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$14 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
                break L1;
              }
            }
            L2: {
              if (!this.field_X.d(-1)) {
                L3: {
                  if (null == this.field_Y) {
                    break L3;
                  } else {
                    if (this.field_Y.d(-1)) {
                      var5 = this.field_Y;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_T.d(-1)) {
                  if (this.field_P.d(-1)) {
                    var5 = this.field_P;
                    break L2;
                  } else {
                    if (!this.field_Q.d(-1)) {
                      if (!this.field_X.field_C) {
                        L4: {
                          if (null == this.field_Y) {
                            break L4;
                          } else {
                            if (this.field_Y.field_C) {
                              var5 = this.field_Y;
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (!this.field_T.field_C) {
                          break L2;
                        } else {
                          var5 = this.field_T;
                          break L2;
                        }
                      } else {
                        var5 = this.field_X;
                        break L2;
                      }
                    } else {
                      var5 = this.field_Q;
                      break L2;
                    }
                  }
                } else {
                  var5 = this.field_T;
                  break L2;
                }
              } else {
                var5 = this.field_X;
                break L2;
              }
            }
            L5: {
              L6: {
                var6 = param3;
                if (96 == var6) {
                  break L6;
                } else {
                  if (-98 == (var6 ^ -1)) {
                    if (this.field_X == var5) {
                      L7: {
                        L8: {
                          if (this.field_Y != null) {
                            break L8;
                          } else {
                            discarded$15 = this.field_T.a((pk) (this), (byte) 61);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        discarded$16 = this.field_Y.a((pk) (this), (byte) 61);
                        break L7;
                      }
                      stackOut_50_0 = 1;
                      stackIn_51_0 = stackOut_50_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (var5 == this.field_Y) {
                        discarded$17 = this.field_T.a((pk) (this), (byte) 61);
                        stackOut_54_0 = 1;
                        stackIn_55_0 = stackOut_54_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (var5 != this.field_P) {
                          break L5;
                        } else {
                          if (this.field_Q.field_x) {
                            discarded$18 = this.field_Q.a((pk) (this), (byte) 61);
                            stackOut_59_0 = 1;
                            stackIn_60_0 = stackOut_59_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    if (98 == var6) {
                      if (var5 == this.field_P) {
                        discarded$19 = this.field_X.a((pk) (this), (byte) 61);
                        stackOut_63_0 = 1;
                        stackIn_64_0 = stackOut_63_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        if (this.field_Q != var5) {
                          break L5;
                        } else {
                          discarded$20 = this.field_T.a((pk) (this), (byte) 61);
                          stackOut_66_0 = 1;
                          stackIn_67_0 = stackOut_66_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      }
                    } else {
                      if ((var6 ^ -1) != -100) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          L9: {
                            if (var5 == this.field_X) {
                              break L9;
                            } else {
                              if (var5 == this.field_Y) {
                                break L9;
                              } else {
                                if (var5 != this.field_T) {
                                  break L5;
                                } else {
                                  L10: {
                                    L11: {
                                      if (!this.field_Q.field_x) {
                                        break L11;
                                      } else {
                                        discarded$21 = this.field_Q.a((pk) (this), (byte) 61);
                                        if (var7 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    discarded$22 = this.field_P.a((pk) (this), (byte) 61);
                                    break L10;
                                  }
                                  stackOut_78_0 = 1;
                                  stackIn_79_0 = stackOut_78_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                          }
                          discarded$23 = this.field_P.a((pk) (this), (byte) 61);
                          stackOut_71_0 = 1;
                          stackIn_72_0 = stackOut_71_0;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              if (this.field_T == var5) {
                L12: {
                  if (null != this.field_Y) {
                    break L12;
                  } else {
                    discarded$24 = this.field_X.a((pk) (this), (byte) 61);
                    if (var7 == 0) {
                      stackOut_35_0 = 1;
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L12;
                    }
                  }
                }
                discarded$25 = this.field_Y.a((pk) (this), (byte) 61);
                return true;
              } else {
                if (var5 == this.field_Y) {
                  discarded$26 = this.field_X.a((pk) (this), (byte) 61);
                  stackOut_39_0 = 1;
                  stackIn_40_0 = stackOut_39_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (this.field_Q != var5) {
                    break L5;
                  } else {
                    discarded$27 = this.field_P.a((pk) (this), (byte) 61);
                    stackOut_42_0 = 1;
                    stackIn_43_0 = stackOut_42_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            stackOut_80_0 = super.a(param0, param1, (byte) 98, param3);
            stackIn_81_0 = stackOut_80_0;
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_82_0 = var5;
            stackOut_82_1 = new StringBuilder().append("dd.KA(");
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param0 == null) {
              stackOut_84_0 = stackIn_84_0;
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L13;
            } else {
              stackOut_83_0 = stackIn_83_0;
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_36_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_40_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_51_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_60_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_64_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_67_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_72_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_79_0 != 0;
                          } else {
                            return stackIn_81_0;
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

    private final wp a(ne[] param0, qm param1, String param2, byte param3) {
        wp var5 = null;
        RuntimeException var5_ref = null;
        nd var6 = null;
        wp var7 = null;
        int var8 = 0;
        wp stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        wp stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var5 = new wp(param2, param1);
            var5.field_w = (mh) ((Object) new uv(param0));
            var6 = this.field_U;
            var7 = var5;
            var8 = -20 % ((56 - param3) / 42);
            var6.a(var6.field_K, 0, var7);
            this.field_U.c(false);
            stackOut_0_0 = (wp) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("dd.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    private final void e(boolean param0) {
        wp[] var2 = null;
        int var3 = 0;
        wp var4 = null;
        int var5 = 0;
        wp[] var6 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        wp stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        wp stackOut_3_0 = null;
        wp stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var6 = this.field_V;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= var6.length) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    stackOut_3_0 = (wp) (var4);
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != this.field_O) {
                      stackOut_5_0 = (wp) ((Object) stackIn_5_0);
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L3;
                    } else {
                      stackOut_4_0 = (wp) ((Object) stackIn_4_0);
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L3;
                    }
                  }
                  stackIn_6_0.field_C = stackIn_6_1 != 0;
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0) {
              break L1;
            } else {
              this.field_Y = (wp) null;
              break L1;
            }
          }
          return;
        }
    }

    private final void a(wp param0, int param1) {
        boolean discarded$3 = false;
        wp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd var5 = null;
        wp stackIn_3_0 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_2_0 = null;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
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
              if (param1 == 0) {
                break L1;
              } else {
                this.h((byte) 113);
                break L1;
              }
            }
            L2: {
              this.field_O = param0;
              discarded$3 = param0.a((pk) (this), (byte) 61);
              var3 = this.g((byte) -2);
              stackOut_2_0 = this.field_Q;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param0 == var3) {
                stackOut_4_0 = (wp) ((Object) stackIn_4_0);
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = (wp) ((Object) stackIn_3_0);
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              stackIn_5_0.field_x = stackIn_5_1 != 0;
              if (param0 == this.field_T) {
                if (var3 == param0) {
                  if (null != this.field_ab) {
                    L4: {
                      var4 = this.field_ab.g(param1 + -126);
                      var5 = this.field_Z[var4];
                      if (var5.field_a != vv.field_b.field_s) {
                        break L4;
                      } else {
                        if (vv.field_b.field_c != var5.field_g) {
                          break L4;
                        } else {
                          this.e(true);
                          break L3;
                        }
                      }
                    }
                    this.field_Q.field_x = true;
                    this.e(true);
                    break L3;
                  } else {
                    this.e(true);
                    break L3;
                  }
                } else {
                  this.e(true);
                  break L3;
                }
              } else {
                this.e(true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("dd.O(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_O == this.field_X) {
              break L1;
            } else {
              L2: {
                if (this.field_Y != this.field_O) {
                  break L2;
                } else {
                  ib.d(1);
                  ua.f(-5812);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_O != this.field_T) {
                break L0;
              } else {
                L3: {
                  if (null != this.field_ab) {
                    var2 = this.field_ab.g(96);
                    if (0 <= var2) {
                      vv.field_b.b(this.field_Z[var2].field_g, this.field_Z[var2].field_a, 67);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                rj.a(true, false);
                this.field_E.a((byte) 108, new qk(this.field_E));
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ib.d(1);
          um.b(0);
          break L0;
        }
        if (param0 < 65) {
          return;
        } else {
          this.field_Q.field_x = false;
          return;
        }
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
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
        wp stackOut_3_0 = null;
        wp stackOut_1_0 = null;
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
            var4 = new wp(param2, param1);
            if (param0 < -10) {
              var4.field_w = (mh) ((Object) new ue());
              var5 = -46 + this.field_p;
              var4.a(127, 15, var5, 30, this.field_q + -30);
              this.a((pk) (var4), 80);
              stackOut_3_0 = (wp) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (wp) null;
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
            stackOut_5_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        boolean discarded$2 = false;
        wp[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        wp var7 = null;
        int var8 = 0;
        wp[] var9 = null;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, 124, param2, param3);
                if (sl.field_d) {
                  param2.c((byte) 120);
                  var9 = this.field_V;
                  var5 = var9;
                  var6 = 0;
                  L3: while (true) {
                    if (var9.length <= var6) {
                      break L2;
                    } else {
                      var7 = var9[var6];
                      stackOut_5_0 = var7.field_k;
                      stackIn_10_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (!stackIn_6_0) {
                            break L4;
                          } else {
                            discarded$2 = var7.a((pk) (this), (byte) 61);
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
                } else {
                  break L2;
                }
              }
              stackOut_9_0 = 69 % ((-25 - param1) / 45);
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            L5: {
              var5_int = stackIn_10_0;
              if (this.field_W) {
                break L5;
              } else {
                if (!vs.b((byte) 9)) {
                  this.k(84);
                  this.field_E.a((byte) 124, new dd(this.field_E));
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_ab == null) {
                break L6;
              } else {
                if (this.field_ab.i(20) == this.field_S) {
                  break L6;
                } else {
                  this.a(this.field_T, 0);
                  this.field_S = this.field_ab.i(20);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
