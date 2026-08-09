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
        if (!(null == gk.field_o)) {
            return this.field_T;
        }
        if (vv.field_b != null && vv.field_b.field_g) {
            if (!(null == this.field_Y)) {
                return this.field_Y;
            }
        }
        if (param0 != -2) {
            return (wp) null;
        }
        return this.field_X;
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
        int incrementValue$0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        nd stackIn_50_1;
        nd stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        Object stackIn_52_0 = null;
        nd stackIn_52_1 = null;
        nd stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        String var10 = null;
        try {
          L0: {
            L1: {
              this.field_Z = ul.a((byte) -110, lt.field_m);
              if (this.field_Z.length <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (this.field_Z.length <= var2_int) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= this.field_Z.length) {
                        var3_ref_cd__ = this.field_Z;
                        this.field_Z = new cd[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_cd__.length) {
                            cb.a(this.field_Z, true);
                            break L1;
                          } else {
                            L5: {
                              if (null == var3_ref_cd__[var5]) {
                                break L5;
                              } else {
                                incrementValue$0 = var4;
                                var4++;
                                this.field_Z[incrementValue$0] = var3_ref_cd__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (null == this.field_Z[var3]) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (this.field_Z[var2_int] == null) {
                        break L7;
                      } else {
                        var3 = var2_int - -1;
                        L8: while (true) {
                          if (this.field_Z.length <= var3) {
                            if (null == vv.field_b) {
                              break L7;
                            } else {
                              if (this.field_Z[var2_int] == null) {
                                break L7;
                              } else {
                                if (vv.field_b.a(this.field_Z[var2_int].field_g, (byte) -54, this.field_Z[var2_int].field_a)) {
                                  break L7;
                                } else {
                                  this.field_Z[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (this.field_Z[var3] == null) {
                                break L9;
                              } else {
                                if (this.field_Z[var2_int].field_a != this.field_Z[var3].field_a) {
                                  break L9;
                                } else {
                                  if (this.field_Z[var2_int].field_g != this.field_Z[var3].field_g) {
                                    break L9;
                                  } else {
                                    this.field_Z[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackIn_30_0 = this;

              if ((this.field_Z.length ^ -1) >= -1) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L10;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L10;
              }
            }
            L11: {
              ((dd) (this)).field_R = stackIn_31_1 != 0;
              if (!jt.a((byte) -90)) {
                stackIn_34_0 = 0;
                break L11;
              } else {
                stackIn_34_0 = 1;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              if (var2_int == 0) {
                stackIn_37_0 = 2;
                break L12;
              } else {
                stackIn_37_0 = 3;
                break L12;
              }
            }
            L13: {
              var3 = stackIn_37_0;
              stackIn_39_0 = this;

              if (vs.b((byte) 9)) {
                stackIn_40_0 = this;
                stackIn_40_1 = 0;
                break L13;
              } else {
                stackIn_40_0 = this;
                stackIn_40_1 = 1;
                break L13;
              }
            }
            L14: {
              ((dd) (this)).field_W = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (vv.field_b != null) {
                  if (vv.field_b.f(-1)) {
                    stackIn_48_0 = 1;
                    break L14;
                  } else {
                    stackIn_48_0 = 0;
                    break L14;
                  }
                } else {
                  stackIn_48_0 = 0;
                  break L14;
                }
              } else {
                stackIn_48_0 = 0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackIn_50_0 = this;

                stackIn_50_1 = null;

                stackIn_50_2 = null;

                stackIn_50_3 = 10;

                if (var2_int != 0) {
                  break L16;
                } else {
                  stackIn_51_0 = this;
                  stackIn_50_0 = stackIn_51_0;

                  if (var4 == 0) {
                    stackIn_52_0 = this;
                    stackIn_52_1 = null;
                    stackIn_52_2 = null;
                    stackIn_52_3 = stackIn_50_3;
                    stackIn_52_4 = 75;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackIn_52_0 = this;
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_3 = stackIn_50_3;
              stackIn_52_4 = 58;
              break L15;
            }
            L17: {
              ((dd) (this)).field_U = new nd(stackIn_52_3, stackIn_52_4, 410, 105, (mh) null, var3, 1);
              this.field_U.field_K = 83;
              this.field_U.c(-1, 5, 5);
              this.a(this.field_U, 93);
              this.field_X = this.a(sb.field_d, (qm) (this), kp.field_b, (byte) -105);
              if (var2_int == 0) {
                break L17;
              } else {
                this.field_Y = this.a(kn.field_f, (qm) (this), hq.field_c, (byte) 122);
                break L17;
              }
            }
            L18: {
              this.field_T = this.a(sm.field_c, (qm) (this), dj.field_o, (byte) 110);
              stackIn_56_0 = this;

              if (var2_int != 0) {
                stackIn_57_0 = this;
                stackIn_57_1 = 3;
                break L18;
              } else {
                stackIn_57_0 = this;
                stackIn_57_1 = 2;
                break L18;
              }
            }
            L19: {
              ((dd) (this)).field_V = new wp[stackIn_57_1];
              this.field_V[0] = this.field_X;
              if (var2_int == 0) {
                break L19;
              } else {
                this.field_V[2] = this.field_Y;
                break L19;
              }
            }
            L20: {
              this.field_V[1] = this.field_T;
              if (!this.field_R) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[this.field_Z.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= this.field_Z.length) {
                      this.field_ab = new ld(var5_ref_String__, var6_int, 150);
                      this.field_ab.a(-103, this.field_T.field_r + this.field_U.field_r, -19 + (this.field_T.field_p + this.field_U.field_v - -this.field_T.field_v), 18, 126);
                      this.field_y.a(this.field_ab, -10295);
                      break L20;
                    } else {
                      L22: {
                        var8 = this.field_Z[var7_int];
                        if (null == gk.field_o) {
                          break L22;
                        } else {
                          if (var8.field_a != vv.field_b.field_s) {
                            break L22;
                          } else {
                            if (var8.field_g != vv.field_b.field_c) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_g;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                this.field_P = this.a(-73, (qm) (this), jh.field_A);
                var5 = this.field_P.field_r + this.field_P.field_q / 2;
                this.field_P.field_q = 150;
                this.field_P.field_r = -20 + var5 - this.field_P.field_q;
                this.field_Q = this.a(-128, (qm) (this), dn.field_a);
                this.field_Q.field_x = false;
                this.field_Q.field_q = this.field_P.field_q;
                this.field_Q.field_r = var5 - -20;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int == 0) {
                  stackIn_74_0 = lw.field_c;
                  break L25;
                } else {
                  stackIn_74_0 = sl.field_e;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6 = var10;
              var7 = new pk(var10, (qm) null);
              var7.field_r = 0;
              var7.field_q = this.field_q;
              var7.field_p = 80;
              var7.field_v = 163;
              var7.field_w = (mh) ((Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.a(var7, 125);
              break L23;
            }
            L26: {
              this.field_S = false;
              var6_ref = this.g((byte) -2);
              if (var6_ref == null) {
                break L26;
              } else {
                var6_ref.field_C = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var2);

            stackIn_80_1 = new StringBuilder().append("dd.<init>(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 710) {
              L1: {
                if (param2 != this.field_P) {
                  if (this.field_Q != param2) {
                    if (param2 == this.field_X) {
                      this.a(param2, 0);
                      break L1;
                    } else {
                      if (param2 == this.field_Y) {
                        this.a(param2, 0);
                        break L1;
                      } else {
                        L2: {
                          if (this.field_ab != null) {
                            if (this.field_ab.field_k) {
                              stackIn_15_0 = 1;
                              break L2;
                            } else {
                              stackIn_15_0 = 0;
                              break L2;
                            }
                          } else {
                            stackIn_15_0 = 0;
                            break L2;
                          }
                        }
                        L3: {
                          var6_int = stackIn_15_0;
                          if (var6_int != 0) {
                            break L3;
                          } else {
                            if (param2 != this.field_T) {
                              break L3;
                            } else {
                              if (!this.field_R) {
                                this.field_E.a((byte) 98, new u(this.field_E, ku.field_I));
                                break L1;
                              } else {
                                if (ct.field_x > 0) {
                                  this.a(param2, param1 + -710);
                                  break L1;
                                } else {
                                  this.field_E.a((byte) 115, new kq(this.field_E));
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        break L1;
                      }
                    }
                  } else {
                    this.h((byte) 103);
                    break L1;
                  }
                } else {
                  this.k(124);
                  break L1;
                }
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
          L4: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("dd.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        lt var4 = null;
        qv var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (lt) ((Object) em.field_d.b(-75));
            L1: while (true) {
              if (var4 == null) {
                var5 = (qv) ((Object) ak.field_b.b(109));
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param0 == 28778) {
                        break L3;
                      } else {
                        dd.a(-77, -57);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    ss.a(param1, 1000, var5);
                    var5 = (qv) ((Object) ak.field_b.d((byte) 18));
                    continue L2;
                  }
                }
              } else {
                cl.a((byte) -97, var4, param1);
                var4 = (lt) ((Object) em.field_d.d((byte) 18));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "dd.W(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        wp discarded$0 = null;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        boolean stackIn_76_0 = false;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param2 >= 9) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$0 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
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
              var6 = param3;
              if (96 == var6) {
                if (this.field_T == var5) {
                  if (null != this.field_Y) {
                    this.field_Y.a((pk) (this), (byte) 61);
                    stackIn_33_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    this.field_X.a((pk) (this), (byte) 61);
                    return true;
                  }
                } else {
                  if (var5 == this.field_Y) {
                    this.field_X.a((pk) (this), (byte) 61);
                    stackIn_37_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (this.field_Q != var5) {
                      break L5;
                    } else {
                      this.field_P.a((pk) (this), (byte) 61);
                      stackIn_40_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                if (-98 == (var6 ^ -1)) {
                  if (this.field_X == var5) {
                    L6: {
                      if (this.field_Y != null) {
                        this.field_Y.a((pk) (this), (byte) 61);
                        break L6;
                      } else {
                        this.field_T.a((pk) (this), (byte) 61);
                        break L6;
                      }
                    }
                    stackIn_47_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var5 == this.field_Y) {
                      this.field_T.a((pk) (this), (byte) 61);
                      stackIn_51_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var5 != this.field_P) {
                        break L5;
                      } else {
                        if (this.field_Q.field_x) {
                          this.field_Q.a((pk) (this), (byte) 61);
                          stackIn_56_0 = 1;
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
                      this.field_X.a((pk) (this), (byte) 61);
                      stackIn_60_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (this.field_Q != var5) {
                        break L5;
                      } else {
                        this.field_T.a((pk) (this), (byte) 61);
                        stackIn_63_0 = 1;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    }
                  } else {
                    if ((var6 ^ -1) != -100) {
                      break L5;
                    } else {
                      L7: {
                        if (var5 == this.field_X) {
                          break L7;
                        } else {
                          if (var5 == this.field_Y) {
                            break L7;
                          } else {
                            if (var5 != this.field_T) {
                              break L5;
                            } else {
                              L8: {
                                if (!this.field_Q.field_x) {
                                  this.field_P.a((pk) (this), (byte) 61);
                                  break L8;
                                } else {
                                  this.field_Q.a((pk) (this), (byte) 61);
                                  break L8;
                                }
                              }
                              stackIn_74_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          }
                        }
                      }
                      this.field_P.a((pk) (this), (byte) 61);
                      stackIn_68_0 = 1;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_76_0 = super.a(param0, param1, (byte) 98, param3);
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = var5;

            stackIn_79_1 = new StringBuilder().append("dd.KA(");

            if (param0 == null) {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L9;
            } else {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_33_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_37_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_47_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_51_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_56_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_60_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_63_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_68_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_74_0 != 0;
                          } else {
                            return stackIn_76_0;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new wp(param2, param1);
            var5.field_w = (mh) ((Object) new uv(param0));
            var6 = this.field_U;
            var7 = var5;
            var8 = -20 % ((56 - param3) / 42);
            var6.a(var6.field_K, 0, var7);
            this.field_U.c(false);
            stackIn_1_0 = (wp) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("dd.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    private final void e(boolean param0) {
        int var3 = 0;
        wp var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        wp[] var6 = this.field_V;
        wp[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_C = var4 == this.field_O ? true : false;
        }
        if (!param0) {
            this.field_Y = (wp) null;
        }
    }

    private final void a(wp param0, int param1) {
        wp var3 = null;
        int var4 = 0;
        cd var5 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
              param0.a((pk) (this), (byte) 61);
              var3 = this.g((byte) -2);
              stackIn_4_0 = this.field_Q;

              if (param0 == var3) {
                stackIn_5_0 = (wp) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = (wp) ((Object) stackIn_4_0);
                stackIn_5_1 = 1;
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
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("dd.O(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        int var3;
        int var2;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (this.field_O == this.field_X) {
            ib.d(1);
            um.b(0);
            break L0;
          } else {
            if (this.field_Y != this.field_O) {
              if (this.field_O != this.field_T) {
                break L0;
              } else {
                if (null != this.field_ab) {
                  var2 = this.field_ab.g(96);
                  if (0 <= var2) {
                    vv.field_b.b(this.field_Z[var2].field_g, this.field_Z[var2].field_a, 67);
                    rj.a(true, false);
                    this.field_E.a((byte) 108, new qk(this.field_E));
                    break L0;
                  } else {
                    rj.a(true, false);
                    this.field_E.a((byte) 108, new qk(this.field_E));
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            } else {
              ib.d(1);
              ua.f(-5812);
              break L0;
            }
          }
        }
        if (param0 >= 65) {
          this.field_Q.field_x = false;
          return;
        } else {
          return;
        }
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new wp(param2, param1);
            if (param0 < -10) {
              var4.field_w = (mh) ((Object) new ue());
              var5 = -46 + this.field_p;
              var4.a(127, 15, var5, 30, this.field_q + -30);
              this.a((pk) (var4), 80);
              stackIn_4_0 = (wp) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        wp[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        wp var7 = null;
        int var8 = 0;
        wp[] var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, 124, param2, param3);
              if (sl.field_d) {
                param2.c((byte) 120);
                var9 = this.field_V;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_k) {
                        break L3;
                      } else {
                        var7.a((pk) (this), (byte) 61);
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              var5_int = 69 % ((-25 - param1) / 45);
              if (this.field_W) {
                break L4;
              } else {
                if (!vs.b((byte) 9)) {
                  this.k(84);
                  this.field_E.a((byte) 124, new dd(this.field_E));
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (this.field_ab == null) {
                  break L6;
                } else {
                  if (this.field_ab.i(20) == this.field_S) {
                    break L6;
                  } else {
                    this.a(this.field_T, 0);
                    this.field_S = this.field_ab.i(20);
                    break L5;
                  }
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5_ref);

            stackIn_18_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
