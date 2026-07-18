/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException var2 = null;
        wp stackIn_4_0 = null;
        wp stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        wp stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
        wp stackOut_14_0 = null;
        wp stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        try {
          L0: {
            if (null != gk.field_o) {
              stackOut_3_0 = ((dd) this).field_T;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (vv.field_b == null) {
                  break L1;
                } else {
                  if (!vv.field_b.field_g) {
                    break L1;
                  } else {
                    if (null != ((dd) this).field_Y) {
                      stackOut_14_0 = ((dd) this).field_Y;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (param0 == -2) {
                stackOut_19_0 = ((dd) this).field_X;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                stackOut_17_0 = null;
                stackIn_18_0 = stackOut_17_0;
                return (wp) (Object) stackIn_18_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "dd.E(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    private final void k(int param0) {
        if (param0 < 3) {
            return;
        }
        if (!(((dd) this).field_D)) {
            return;
        }
        try {
            ((dd) this).field_D = false;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "dd.P(" + param0 + ')');
        }
    }

    dd(dg param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        cd[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        wp var6_ref = null;
        int var7_int = 0;
        pk var7 = null;
        cd var8 = null;
        int var9 = 0;
        Object stackIn_6_0 = null;
        cd stackIn_8_0 = null;
        cd stackIn_13_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_65_0 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_79_0 = 0;
        Object stackIn_80_0 = null;
        nd stackIn_80_1 = null;
        nd stackIn_80_2 = null;
        int stackIn_80_3 = 0;
        Object stackIn_81_0 = null;
        nd stackIn_81_1 = null;
        nd stackIn_81_2 = null;
        int stackIn_81_3 = 0;
        Object stackIn_83_0 = null;
        nd stackIn_83_1 = null;
        nd stackIn_83_2 = null;
        int stackIn_83_3 = 0;
        Object stackIn_84_0 = null;
        nd stackIn_84_1 = null;
        nd stackIn_84_2 = null;
        int stackIn_84_3 = 0;
        Object stackIn_85_0 = null;
        nd stackIn_85_1 = null;
        nd stackIn_85_2 = null;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        Object stackIn_88_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_126_0 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        cd stackOut_6_0 = null;
        cd stackOut_12_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_78_0 = 0;
        Object stackOut_79_0 = null;
        nd stackOut_79_1 = null;
        nd stackOut_79_2 = null;
        int stackOut_79_3 = 0;
        Object stackOut_80_0 = null;
        nd stackOut_80_1 = null;
        nd stackOut_80_2 = null;
        int stackOut_80_3 = 0;
        Object stackOut_84_0 = null;
        nd stackOut_84_1 = null;
        nd stackOut_84_2 = null;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        Object stackOut_81_0 = null;
        nd stackOut_81_1 = null;
        nd stackOut_81_2 = null;
        int stackOut_81_3 = 0;
        Object stackOut_83_0 = null;
        nd stackOut_83_1 = null;
        nd stackOut_83_2 = null;
        int stackOut_83_3 = 0;
        int stackOut_83_4 = 0;
        Object stackOut_87_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        String stackOut_125_0 = null;
        String stackOut_123_0 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ((dd) this).field_Z = ul.a((byte) -110, lt.field_m);
                if (((dd) this).field_Z.length > 0) {
                  var2_int = 0;
                  L3: while (true) {
                    L4: {
                      if (((dd) this).field_Z.length <= var2_int) {
                        break L4;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_57_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          stackOut_6_0 = ((dd) this).field_Z[var2_int];
                          stackIn_8_0 = stackOut_6_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (stackIn_8_0 != null) {
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
                                  if (~((dd) this).field_Z.length >= ~var3) {
                                    break L9;
                                  } else {
                                    stackOut_12_0 = ((dd) this).field_Z[var3];
                                    stackIn_8_0 = stackOut_12_0;
                                    stackIn_13_0 = stackOut_12_0;
                                    if (var9 != 0) {
                                      continue L5;
                                    } else {
                                      L10: {
                                        L11: {
                                          if (stackIn_13_0 != null) {
                                            break L11;
                                          } else {
                                            if (var9 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        if (~((dd) this).field_Z[var2_int].field_a != ~((dd) this).field_Z[var3].field_a) {
                                          break L10;
                                        } else {
                                          if (((dd) this).field_Z[var2_int].field_g != ((dd) this).field_Z[var3].field_g) {
                                            break L10;
                                          } else {
                                            ((dd) this).field_Z[var3] = null;
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
                                  if (((dd) this).field_Z[var2_int] == null) {
                                    break L6;
                                  } else {
                                    if (!vv.field_b.a(((dd) this).field_Z[var2_int].field_g, (byte) -54, ((dd) this).field_Z[var2_int].field_a)) {
                                      ((dd) this).field_Z[var2_int] = null;
                                      break L6;
                                    } else {
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
                        if (~var3 <= ~((dd) this).field_Z.length) {
                          break L13;
                        } else {
                          if (var9 != 0) {
                            break L2;
                          } else {
                            L14: {
                              if (null == ((dd) this).field_Z[var3]) {
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
                      var3_ref_cd__ = ((dd) this).field_Z;
                      ((dd) this).field_Z = new cd[var2_int];
                      var4 = 0;
                      var5 = 0;
                      L15: while (true) {
                        L16: {
                          if (~var5 <= ~var3_ref_cd__.length) {
                            break L16;
                          } else {
                            if (var9 != 0) {
                              break L2;
                            } else {
                              L17: {
                                if (null == var3_ref_cd__[var5]) {
                                  break L17;
                                } else {
                                  int incrementValue$1 = var4;
                                  var4++;
                                  ((dd) this).field_Z[incrementValue$1] = var3_ref_cd__[var5];
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
                        cb.a(((dd) this).field_Z, true);
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_56_0 = this;
              stackIn_57_0 = stackOut_56_0;
              break L1;
            }
            L18: {
              stackOut_57_0 = this;
              stackIn_60_0 = stackOut_57_0;
              stackIn_58_0 = stackOut_57_0;
              if (((dd) this).field_Z.length <= 0) {
                stackOut_60_0 = this;
                stackOut_60_1 = 0;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                break L18;
              } else {
                stackOut_58_0 = this;
                stackOut_58_1 = 1;
                stackIn_61_0 = stackOut_58_0;
                stackIn_61_1 = stackOut_58_1;
                break L18;
              }
            }
            L19: {
              ((dd) this).field_R = stackIn_61_1 != 0;
              var2_int = jt.a((byte) -90) ? 1 : 0;
              if (var2_int == 0) {
                stackOut_64_0 = 2;
                stackIn_65_0 = stackOut_64_0;
                break L19;
              } else {
                stackOut_62_0 = 3;
                stackIn_65_0 = stackOut_62_0;
                break L19;
              }
            }
            L20: {
              var3 = stackIn_65_0;
              stackOut_65_0 = this;
              stackIn_68_0 = stackOut_65_0;
              stackIn_66_0 = stackOut_65_0;
              if (vs.b((byte) 9)) {
                stackOut_68_0 = this;
                stackOut_68_1 = 0;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                break L20;
              } else {
                stackOut_66_0 = this;
                stackOut_66_1 = 1;
                stackIn_69_0 = stackOut_66_0;
                stackIn_69_1 = stackOut_66_1;
                break L20;
              }
            }
            L21: {
              L22: {
                ((dd) this).field_W = stackIn_69_1 != 0;
                if (var2_int != 0) {
                  break L22;
                } else {
                  if (vv.field_b == null) {
                    break L22;
                  } else {
                    if (!vv.field_b.f(-1)) {
                      break L22;
                    } else {
                      stackOut_76_0 = 1;
                      stackIn_79_0 = stackOut_76_0;
                      break L21;
                    }
                  }
                }
              }
              stackOut_78_0 = 0;
              stackIn_79_0 = stackOut_78_0;
              break L21;
            }
            L23: {
              L24: {
                var4 = stackIn_79_0;
                stackOut_79_0 = this;
                stackOut_79_1 = null;
                stackOut_79_2 = null;
                stackOut_79_3 = 10;
                stackIn_83_0 = stackOut_79_0;
                stackIn_83_1 = stackOut_79_1;
                stackIn_83_2 = stackOut_79_2;
                stackIn_83_3 = stackOut_79_3;
                stackIn_80_0 = stackOut_79_0;
                stackIn_80_1 = stackOut_79_1;
                stackIn_80_2 = stackOut_79_2;
                stackIn_80_3 = stackOut_79_3;
                if (var2_int != 0) {
                  break L24;
                } else {
                  stackOut_80_0 = this;
                  stackOut_80_1 = null;
                  stackOut_80_2 = null;
                  stackOut_80_3 = stackIn_80_3;
                  stackIn_84_0 = stackOut_80_0;
                  stackIn_84_1 = stackOut_80_1;
                  stackIn_84_2 = stackOut_80_2;
                  stackIn_84_3 = stackOut_80_3;
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  stackIn_81_2 = stackOut_80_2;
                  stackIn_81_3 = stackOut_80_3;
                  if (var4 == 0) {
                    stackOut_84_0 = this;
                    stackOut_84_1 = null;
                    stackOut_84_2 = null;
                    stackOut_84_3 = stackIn_84_3;
                    stackOut_84_4 = 75;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    stackIn_85_2 = stackOut_84_2;
                    stackIn_85_3 = stackOut_84_3;
                    stackIn_85_4 = stackOut_84_4;
                    break L23;
                  } else {
                    stackOut_81_0 = this;
                    stackOut_81_1 = null;
                    stackOut_81_2 = null;
                    stackOut_81_3 = stackIn_81_3;
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    stackIn_83_2 = stackOut_81_2;
                    stackIn_83_3 = stackOut_81_3;
                    break L24;
                  }
                }
              }
              stackOut_83_0 = this;
              stackOut_83_1 = null;
              stackOut_83_2 = null;
              stackOut_83_3 = stackIn_83_3;
              stackOut_83_4 = 58;
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              stackIn_85_3 = stackOut_83_3;
              stackIn_85_4 = stackOut_83_4;
              break L23;
            }
            L25: {
              ((dd) this).field_U = new nd(stackIn_85_3, stackIn_85_4, 410, 105, (mh) null, var3, 1);
              ((dd) this).field_U.field_K = 83;
              ((dd) this).field_U.c(-1, 5, 5);
              ((dd) this).a((pk) (Object) ((dd) this).field_U, 93);
              ((dd) this).field_X = this.a(sb.field_d, (qm) this, kp.field_b, (byte) -105);
              if (var2_int == 0) {
                break L25;
              } else {
                ((dd) this).field_Y = this.a(kn.field_f, (qm) this, hq.field_c, (byte) 122);
                break L25;
              }
            }
            L26: {
              ((dd) this).field_T = this.a(sm.field_c, (qm) this, dj.field_o, (byte) 110);
              stackOut_87_0 = this;
              stackIn_90_0 = stackOut_87_0;
              stackIn_88_0 = stackOut_87_0;
              if (var2_int != 0) {
                stackOut_90_0 = this;
                stackOut_90_1 = 3;
                stackIn_91_0 = stackOut_90_0;
                stackIn_91_1 = stackOut_90_1;
                break L26;
              } else {
                stackOut_88_0 = this;
                stackOut_88_1 = 2;
                stackIn_91_0 = stackOut_88_0;
                stackIn_91_1 = stackOut_88_1;
                break L26;
              }
            }
            L27: {
              ((dd) this).field_V = new wp[stackIn_91_1];
              ((dd) this).field_V[0] = ((dd) this).field_X;
              if (var2_int == 0) {
                break L27;
              } else {
                ((dd) this).field_V[2] = ((dd) this).field_Y;
                break L27;
              }
            }
            L28: {
              ((dd) this).field_V[1] = ((dd) this).field_T;
              if (!((dd) this).field_R) {
                break L28;
              } else {
                if (var2_int == 0) {
                  break L28;
                } else {
                  var5_ref_String__ = new String[((dd) this).field_Z.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (~var7_int <= ~((dd) this).field_Z.length) {
                          break L31;
                        } else {
                          var8 = ((dd) this).field_Z[var7_int];
                          if (var9 != 0) {
                            break L30;
                          } else {
                            L32: {
                              if (null == gk.field_o) {
                                break L32;
                              } else {
                                if (~var8.field_a != ~vv.field_b.field_s) {
                                  break L32;
                                } else {
                                  if (~var8.field_g == ~vv.field_b.field_c) {
                                    var6_int = var7_int;
                                    break L32;
                                  } else {
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
                      ((dd) this).field_ab = new ld((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((dd) this).field_ab.a(-103, ((dd) this).field_T.field_r + ((dd) this).field_U.field_r, -19 + (((dd) this).field_T.field_p + ((dd) this).field_U.field_v - -((dd) this).field_T.field_v), 18, 126);
                      break L30;
                    }
                    ((dd) this).field_y.a((ms) (Object) ((dd) this).field_ab, -10295);
                    break L28;
                  }
                }
              }
            }
            L33: {
              L34: {
                ((dd) this).field_P = this.a(-73, (qm) this, jh.field_A);
                var5 = ((dd) this).field_P.field_r + ((dd) this).field_P.field_q / 2;
                ((dd) this).field_P.field_q = 150;
                ((dd) this).field_P.field_r = -20 + var5 - ((dd) this).field_P.field_q;
                ((dd) this).field_Q = this.a(-128, (qm) this, dn.field_a);
                ((dd) this).field_Q.field_x = false;
                ((dd) this).field_Q.field_q = ((dd) this).field_P.field_q;
                ((dd) this).field_Q.field_r = var5 - -20;
                if (var2_int != 0) {
                  break L34;
                } else {
                  if (var4 != 0) {
                    break L34;
                  } else {
                    break L33;
                  }
                }
              }
              L35: {
                if (var2_int == 0) {
                  stackOut_125_0 = lw.field_c;
                  stackIn_126_0 = stackOut_125_0;
                  break L35;
                } else {
                  stackOut_123_0 = sl.field_e;
                  stackIn_126_0 = stackOut_123_0;
                  break L35;
                }
              }
              var6 = stackIn_126_0;
              var7 = new pk(var6, (qm) null);
              var7.field_r = 0;
              var7.field_q = ((dd) this).field_q;
              var7.field_p = 80;
              var7.field_v = 163;
              var7.field_w = (mh) (Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((dd) this).a(var7, 125);
              break L33;
            }
            L36: {
              ((dd) this).field_S = false;
              var6_ref = this.g((byte) -2);
              if (var6_ref != null) {
                var6_ref.field_C = true;
                break L36;
              } else {
                break L36;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var2 = decompiledCaughtException;
            stackOut_132_0 = (RuntimeException) var2;
            stackOut_132_1 = new StringBuilder().append("dd.<init>(");
            stackIn_135_0 = stackOut_132_0;
            stackIn_135_1 = stackOut_132_1;
            stackIn_133_0 = stackOut_132_0;
            stackIn_133_1 = stackOut_132_1;
            if (param0 == null) {
              stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
              stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
              stackOut_135_2 = "null";
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L37;
            } else {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "{...}";
              stackIn_136_0 = stackOut_133_0;
              stackIn_136_1 = stackOut_133_1;
              stackIn_136_2 = stackOut_133_2;
              break L37;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_136_0, stackIn_136_2 + ')');
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 710) {
              L1: {
                L2: {
                  if (param2 != ((dd) this).field_P) {
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
                  if (((dd) this).field_Q != param2) {
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
                  if (param2 == ((dd) this).field_X) {
                    break L4;
                  } else {
                    L5: {
                      if (param2 == ((dd) this).field_Y) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            if (((dd) this).field_ab == null) {
                              break L7;
                            } else {
                              if (!((dd) this).field_ab.field_k) {
                                break L7;
                              } else {
                                stackOut_25_0 = 1;
                                stackIn_28_0 = stackOut_25_0;
                                break L6;
                              }
                            }
                          }
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          break L6;
                        }
                        L8: {
                          var6_int = stackIn_28_0;
                          if (var6_int != 0) {
                            break L8;
                          } else {
                            if (param2 != ((dd) this).field_T) {
                              break L8;
                            } else {
                              L9: {
                                if (!((dd) this).field_R) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (ct.field_x > 0) {
                                      break L10;
                                    } else {
                                      ((dd) this).field_E.a((byte) 115, (pk) (Object) new kq(((dd) this).field_E));
                                      if (var7 == 0) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  this.a(param2, param1 + -710);
                                  if (var7 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((dd) this).field_E.a((byte) 98, (pk) (Object) new u(((dd) this).field_E, ku.field_I));
                              break L8;
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var6;
            stackOut_53_1 = new StringBuilder().append("dd.C(").append(param0).append(',').append(param1).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param2 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L11;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        lt var2 = null;
        qv var2_ref = null;
        int var3 = 0;
        lt stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        lt stackOut_3_0 = null;
        ms stackOut_5_0 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (lt) (Object) em.field_d.b(-75);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    cl.a((byte) -97, var2, param1);
                    stackOut_3_0 = (lt) (Object) em.field_d.d((byte) 18);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
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
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var2_ref = (qv) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_ref == null) {
                      break L6;
                    } else {
                      ss.a(param1, 1000, var2_ref);
                      var2_ref = (qv) (Object) ak.field_b.d((byte) 18);
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
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "dd.W(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_116_0 = 0;
        boolean stackIn_118_0 = false;
        Object stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        Object stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        Object stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_75_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_117_0 = false;
        Object stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        Object stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        Object stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param2 >= 9) {
                break L1;
              } else {
                wp discarded$14 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
                break L1;
              }
            }
            L2: {
              if (!((dd) this).field_X.d(-1)) {
                L3: {
                  if (null == ((dd) this).field_Y) {
                    break L3;
                  } else {
                    if (((dd) this).field_Y.d(-1)) {
                      var5 = (Object) (Object) ((dd) this).field_Y;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((dd) this).field_T.d(-1)) {
                  if (((dd) this).field_P.d(-1)) {
                    var5 = (Object) (Object) ((dd) this).field_P;
                    break L2;
                  } else {
                    if (!((dd) this).field_Q.d(-1)) {
                      if (!((dd) this).field_X.field_C) {
                        L4: {
                          if (null == ((dd) this).field_Y) {
                            break L4;
                          } else {
                            if (((dd) this).field_Y.field_C) {
                              var5 = (Object) (Object) ((dd) this).field_Y;
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (!((dd) this).field_T.field_C) {
                          break L2;
                        } else {
                          var5 = (Object) (Object) ((dd) this).field_T;
                          break L2;
                        }
                      } else {
                        var5 = (Object) (Object) ((dd) this).field_X;
                        break L2;
                      }
                    } else {
                      var5 = (Object) (Object) ((dd) this).field_Q;
                      break L2;
                    }
                  }
                } else {
                  var5 = (Object) (Object) ((dd) this).field_T;
                  break L2;
                }
              } else {
                var5 = (Object) (Object) ((dd) this).field_X;
                break L2;
              }
            }
            L5: {
              L6: {
                var6 = param3;
                if (96 == var6) {
                  break L6;
                } else {
                  if (var6 == 97) {
                    if ((Object) (Object) ((dd) this).field_X == var5) {
                      L7: {
                        L8: {
                          if (((dd) this).field_Y != null) {
                            break L8;
                          } else {
                            boolean discarded$15 = ((dd) this).field_T.a((pk) this, (byte) 61);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        boolean discarded$16 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                        break L7;
                      }
                      stackOut_75_0 = 1;
                      stackIn_76_0 = stackOut_75_0;
                      return stackIn_76_0 != 0;
                    } else {
                      if (var5 == (Object) (Object) ((dd) this).field_Y) {
                        boolean discarded$17 = ((dd) this).field_T.a((pk) this, (byte) 61);
                        stackOut_80_0 = 1;
                        stackIn_81_0 = stackOut_80_0;
                        return stackIn_81_0 != 0;
                      } else {
                        if (var5 != (Object) (Object) ((dd) this).field_P) {
                          break L5;
                        } else {
                          if (((dd) this).field_Q.field_x) {
                            boolean discarded$18 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                            stackOut_88_0 = 1;
                            stackIn_89_0 = stackOut_88_0;
                            return stackIn_89_0 != 0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    if (98 == var6) {
                      if (var5 == (Object) (Object) ((dd) this).field_P) {
                        boolean discarded$19 = ((dd) this).field_X.a((pk) this, (byte) 61);
                        stackOut_93_0 = 1;
                        stackIn_94_0 = stackOut_93_0;
                        return stackIn_94_0 != 0;
                      } else {
                        if ((Object) (Object) ((dd) this).field_Q != var5) {
                          break L5;
                        } else {
                          boolean discarded$20 = ((dd) this).field_T.a((pk) this, (byte) 61);
                          stackOut_96_0 = 1;
                          stackIn_97_0 = stackOut_96_0;
                          return stackIn_97_0 != 0;
                        }
                      }
                    } else {
                      if (var6 != 99) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          L9: {
                            if (var5 == (Object) (Object) ((dd) this).field_X) {
                              break L9;
                            } else {
                              if (var5 == (Object) (Object) ((dd) this).field_Y) {
                                break L9;
                              } else {
                                if (var5 != (Object) (Object) ((dd) this).field_T) {
                                  break L5;
                                } else {
                                  L10: {
                                    L11: {
                                      if (!((dd) this).field_Q.field_x) {
                                        break L11;
                                      } else {
                                        boolean discarded$21 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                                        if (var7 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    boolean discarded$22 = ((dd) this).field_P.a((pk) this, (byte) 61);
                                    break L10;
                                  }
                                  stackOut_115_0 = 1;
                                  stackIn_116_0 = stackOut_115_0;
                                  return stackIn_116_0 != 0;
                                }
                              }
                            }
                          }
                          boolean discarded$23 = ((dd) this).field_P.a((pk) this, (byte) 61);
                          stackOut_104_0 = 1;
                          stackIn_105_0 = stackOut_104_0;
                          return stackIn_105_0 != 0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              if ((Object) (Object) ((dd) this).field_T == var5) {
                L12: {
                  L13: {
                    if (null != ((dd) this).field_Y) {
                      break L13;
                    } else {
                      boolean discarded$24 = ((dd) this).field_X.a((pk) this, (byte) 61);
                      if (var7 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  boolean discarded$25 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                  break L12;
                }
                stackOut_56_0 = 1;
                stackIn_57_0 = stackOut_56_0;
                return stackIn_57_0 != 0;
              } else {
                if (var5 == (Object) (Object) ((dd) this).field_Y) {
                  boolean discarded$26 = ((dd) this).field_X.a((pk) this, (byte) 61);
                  stackOut_61_0 = 1;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0 != 0;
                } else {
                  if ((Object) (Object) ((dd) this).field_Q != var5) {
                    break L5;
                  } else {
                    boolean discarded$27 = ((dd) this).field_P.a((pk) this, (byte) 61);
                    stackOut_64_0 = 1;
                    stackIn_65_0 = stackOut_64_0;
                    return stackIn_65_0 != 0;
                  }
                }
              }
            }
            stackOut_117_0 = super.a(param0, param1, (byte) 98, param3);
            stackIn_118_0 = stackOut_117_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_119_0 = var5;
            stackOut_119_1 = new StringBuilder().append("dd.KA(");
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param0 == null) {
              stackOut_122_0 = stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L14;
            } else {
              stackOut_120_0 = stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L14;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_118_0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5 = new wp(param2, param1);
            var5.field_w = (mh) (Object) new uv(param0);
            var6 = ((dd) this).field_U;
            var7 = var5;
            var8 = -20 % ((56 - param3) / 42);
            var6.a(var6.field_K, 0, (pk) (Object) var7);
            ((dd) this).field_U.c(false);
            stackOut_0_0 = (wp) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("dd.D(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    private final void e(boolean param0) {
        RuntimeException runtimeException = null;
        wp[] var2 = null;
        int var3 = 0;
        wp var4 = null;
        int var5 = 0;
        wp stackIn_5_0 = null;
        wp stackIn_7_0 = null;
        wp stackIn_9_0 = null;
        wp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_4_0 = null;
        wp stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wp stackOut_5_0 = null;
        wp stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = ((dd) this).field_V;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3 <= ~var2.length) {
                    break L3;
                  } else {
                    var4 = var2[var3];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_4_0 = (wp) var4;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var4 != ((dd) this).field_O) {
                          stackOut_9_0 = (wp) (Object) stackIn_9_0;
                          stackOut_9_1 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L4;
                        } else {
                          stackOut_5_0 = (wp) (Object) stackIn_5_0;
                          stackIn_7_0 = stackOut_5_0;
                          stackOut_7_0 = (wp) (Object) stackIn_7_0;
                          stackOut_7_1 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          break L4;
                        }
                      }
                      stackIn_10_0.field_C = stackIn_10_1 != 0;
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0) {
                  break L2;
                } else {
                  ((dd) this).field_Y = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "dd.V(" + param0 + ')');
        }
    }

    private final void a(wp param0, int param1) {
        wp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd var5 = null;
        wp stackIn_4_0 = null;
        wp stackIn_6_0 = null;
        wp stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
        wp stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              ((dd) this).field_O = param0;
              boolean discarded$2 = param0.a((pk) this, (byte) 61);
              var3 = this.g((byte) -2);
              stackOut_3_0 = ((dd) this).field_Q;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param0 == var3) {
                stackOut_6_0 = (wp) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = (wp) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_x = stackIn_7_1 != 0;
              if (param0 != ((dd) this).field_T) {
                break L3;
              } else {
                if (var3 != param0) {
                  break L3;
                } else {
                  if (null == ((dd) this).field_ab) {
                    break L3;
                  } else {
                    L4: {
                      var4 = ((dd) this).field_ab.g(param1 + -126);
                      var5 = ((dd) this).field_Z[var4];
                      if (~var5.field_a != ~vv.field_b.field_s) {
                        break L4;
                      } else {
                        if (vv.field_b.field_c == var5.field_g) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((dd) this).field_Q.field_x = true;
                    break L3;
                  }
                }
              }
            }
            this.e(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("dd.O(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((dd) this).field_O == ((dd) this).field_X) {
                  break L2;
                } else {
                  L3: {
                    if (((dd) this).field_Y != ((dd) this).field_O) {
                      break L3;
                    } else {
                      ib.d(1);
                      ua.f(-5812);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (((dd) this).field_O != ((dd) this).field_T) {
                    break L1;
                  } else {
                    L4: {
                      if (null != ((dd) this).field_ab) {
                        var2_int = ((dd) this).field_ab.g(96);
                        if (0 <= var2_int) {
                          vv.field_b.b(((dd) this).field_Z[var2_int].field_g, ((dd) this).field_Z[var2_int].field_a, 67);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    rj.a(true, false);
                    ((dd) this).field_E.a((byte) 108, (pk) (Object) new qk(((dd) this).field_E));
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ib.d(1);
              um.b(0);
              break L1;
            }
            if (param0 >= 65) {
              ((dd) this).field_Q.field_x = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "dd.CA(" + param0 + ')');
        }
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4 = new wp(param2, param1);
            if (param0 < -10) {
              var4.field_w = (mh) (Object) new ue();
              var5 = -46 + ((dd) this).field_p;
              var4.a(127, 15, var5, 30, ((dd) this).field_q + -30);
              ((dd) this).a((pk) (Object) var4, 80);
              stackOut_3_0 = (wp) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wp) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException var5 = null;
        wp[] var5_array = null;
        int var5_int = 0;
        int var6 = 0;
        wp var7 = null;
        int var8 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, 124, param2, param3);
                if (sl.field_d) {
                  param2.c((byte) 120);
                  var5_array = ((dd) this).field_V;
                  var6 = 0;
                  L3: while (true) {
                    if (~var5_array.length >= ~var6) {
                      break L2;
                    } else {
                      var7 = var5_array[var6];
                      stackOut_6_0 = var7.field_k;
                      stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            boolean discarded$1 = var7.a((pk) this, (byte) 61);
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
              stackOut_13_0 = 69 % ((-25 - param1) / 45);
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            L5: {
              var5_int = stackIn_14_0;
              if (((dd) this).field_W) {
                break L5;
              } else {
                if (!vs.b((byte) 9)) {
                  this.k(84);
                  ((dd) this).field_E.a((byte) 124, (pk) (Object) new dd(((dd) this).field_E));
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (((dd) this).field_ab == null) {
                break L6;
              } else {
                if (((dd) this).field_ab.i(20) == ((dd) this).field_S) {
                  break L6;
                } else {
                  this.a(((dd) this).field_T, 0);
                  ((dd) this).field_S = ((dd) this).field_ab.i(20);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
