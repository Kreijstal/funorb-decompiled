/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends gk implements vn {
    static ia field_Ob;
    static w field_Mb;
    static sm field_Qb;
    private boolean field_Pb;
    private tf field_Nb;
    static String field_Kb;
    private boolean field_Rb;
    static sk field_Jb;
    static int field_Lb;

    final boolean h(byte param0) {
        cd var2 = null;
        if (param0 > 15) {
          if (this.field_S) {
            if (!this.field_Pb) {
              var2 = je.a(13);
              if (var2 != null) {
                this.a(false, var2, false);
                return super.h((byte) 117);
              } else {
                return super.h((byte) 117);
              }
            } else {
              return super.h((byte) 117);
            }
          } else {
            return super.h((byte) 117);
          }
        } else {
          this.field_Nb = (tf) null;
          if (this.field_S) {
            if (!this.field_Pb) {
              var2 = je.a(13);
              if (var2 != null) {
                this.a(false, var2, false);
                return super.h((byte) 117);
              } else {
                return super.h((byte) 117);
              }
            } else {
              return super.h((byte) 117);
            }
          } else {
            return super.h((byte) 117);
          }
        }
    }

    final static void q(int param0) {
        mg.field_Nb = false;
        int var1 = -22 % ((-14 - param0) / 35);
        vb.field_Z = false;
        hm.a(-1, (byte) -122);
        ka.field_P = uc.field_c;
        sh.field_d = uc.field_c;
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!this.field_Rb) {
              L1: {
                in.c((byte) -51);
                this.n(-128);
                if (param0 == 67) {
                  break L1;
                } else {
                  field_Jb = (sk) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              dd.a(false, true, (byte) 66);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("wj.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, String param5) {
        RuntimeException var6 = null;
        ck var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              de.a(param4, -5540, param5, param0, param2);
              fe.field_b = param3;
              if (param2) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              im.field_f = stackIn_3_0 != 0;
              if (param1 < -70) {
                break L2;
              } else {
                var7 = (ck) null;
                wj.a((ck) null, 81);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("wj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Frame param1, fd param2) {
        RuntimeException runtimeException = null;
        mh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                wj.q(92);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param2.a(75254128, param1);
              L3: while (true) {
                L4: {
                  L5: {
                    if (-1 != (var3.field_c ^ -1)) {
                      break L5;
                    } else {
                      ua.a(10L, -128);
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if ((var3.field_c ^ -1) == -2) {
                      break L6;
                    } else {
                      ua.a(100L, -128);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  param1.setVisible(false);
                  param1.dispose();
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("wj.N(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          L8: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static void c(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (qc.field_s == null) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (ph.field_xb != wf.field_u) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (we.field_b.field_n != 0) {
                    break L2;
                  } else {
                    if (ik.a(4) > 10000L + el.field_J) {
                      we.field_b.f(param1, -4);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == 4792) {
                    break L3;
                  } else {
                    field_Kb = (String) null;
                    break L3;
                  }
                }
                if (-1 > (we.field_b.field_n ^ -1)) {
                  try {
                    L4: {
                      qc.field_s.a(0, we.field_b.field_n, 1, we.field_b.field_r);
                      el.field_J = ik.a(param0 ^ 4796);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      iOException = (IOException) (Object) decompiledCaughtException;
                      si.a(100);
                      break L5;
                    }
                  }
                  we.field_b.field_n = 0;
                  return;
                } else {
                  return;
                }
              }
            }
            we.field_b.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    wj(ka param0, tf param1) {
        super(param0, ec.field_p, cm.field_i, false, false);
        try {
            this.field_Nb = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, cd param1, boolean param2) {
        ek discarded$2 = null;
        ek discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        dj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Pb = true;
                if (param1.field_n) {
                  break L2;
                } else {
                  L3: {
                    if (null != param1.field_d) {
                      break L3;
                    } else {
                      var4_ref = param1.field_f;
                      if (param1.field_h == 248) {
                        L4: {
                          if (param0) {
                            break L4;
                          } else {
                            k.a((byte) -36);
                            break L4;
                          }
                        }
                        this.field_Rb = true;
                        var4_ref = ab.field_d;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  var4_ref = of.field_g;
                  if (this.field_Nb != null) {
                    this.field_Nb.a(25);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var4_ref = wf.field_k;
              break L1;
            }
            L5: {
              L6: {
                var5 = new dj((gk) (this), ec.field_p, var4_ref);
                if (!param1.field_n) {
                  break L6;
                } else {
                  if (!param1.field_e) {
                    discarded$2 = var5.a(119, fa.field_o, (kg) (this));
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    this.c(new md((wj) (this)), (byte) 79);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L7: {
                L8: {
                  if (!this.field_Rb) {
                    break L8;
                  } else {
                    discarded$3 = var5.a(115, fa.field_o, (kg) (this));
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (-6 == (param1.field_h ^ -1)) {
                  var5.a(pb.field_e, 11, 14);
                  var5.a(ig.field_Tb, 17, 14);
                  break L7;
                } else {
                  var5.a(bl.field_X, -1, 14);
                  if (var6 == 0) {
                    break L7;
                  } else {
                    var5.a(pb.field_e, 11, 14);
                    var5.a(ig.field_Tb, 17, 14);
                    break L7;
                  }
                }
              }
              if (-4 == (param1.field_h ^ -1)) {
                var5.a(ce.field_z, 7, 14);
                break L5;
              } else {
                if (-7 != (param1.field_h ^ -1)) {
                  break L5;
                } else {
                  var5.a(vb.field_Y, 9, 14);
                  if (var6 == 0) {
                    break L5;
                  } else {
                    var5.a(ce.field_z, 7, 14);
                    break L5;
                  }
                }
              }
            }
            L9: {
              this.c(var5, (byte) 68);
              if (!param2) {
                break L9;
              } else {
                field_Lb = 4;
                break L9;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var4);
            stackOut_34_1 = new StringBuilder().append("wj.M(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        this.a(param0, un.a(248, ab.field_d, -12), false);
    }

    public static void s(int param0) {
        fd var2 = null;
        field_Ob = null;
        field_Qb = null;
        field_Mb = null;
        field_Kb = null;
        if (param0 != 0) {
          var2 = (fd) null;
          wj.a(true, (java.awt.Frame) null, (fd) null);
          field_Jb = null;
          return;
        } else {
          field_Jb = null;
          return;
        }
    }

    final static boolean r(int param0) {
        if (param0 <= 17) {
            return true;
        }
        if (li.field_b == null) {
            return false;
        }
        if (!li.field_b.b(0)) {
            return false;
        }
        return true;
    }

    final static hl a(byte param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hl var8_ref_hl = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        hl var14 = null;
        boolean stackIn_3_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        var13 = client.field_A ? 1 : 0;
        var4 = null;
        dn.field_l.field_Ob.field_M.c(115);
        var5 = 0;
        var6 = 0;
        var7 = ic.field_c - 1;
        L0: while (true) {
          L1: {
            L2: {
              if (var7 < 0) {
                break L2;
              } else {
                var8_ref_hl = pd.field_g[var7];
                var9 = 0;
                stackOut_2_0 = wc.field_n;
                stackIn_24_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      break L3;
                    } else {
                      if (var5 < kf.field_M) {
                        var10_int = rf.a(0, var8_ref_hl.field_m);
                        if (var8_ref_hl.b((byte) 94) < var10_int) {
                          break L3;
                        } else {
                          L4: {
                            if (var8_ref_hl.field_j) {
                              break L4;
                            } else {
                              if (!ik.a(var8_ref_hl.field_o, (byte) -118)) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var9 = 1;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var9 != 0) {
                        break L6;
                      } else {
                        var8_ref_hl.field_f = null;
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var8_ref_hl.field_f == null) {
                          break L8;
                        } else {
                          if (rg.field_c) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (null == var8_ref_hl.field_f) {
                          bg.field_b = bg.field_b + 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var10 = mb.a(106, var8_ref_hl);
                      var11 = var10 + mm.c(var8_ref_hl.field_h);
                      var12 = tc.a(param0 ^ 4651, var8_ref_hl);
                      var8_ref_hl.field_f = new w(0L, fj.field_g, var11);
                      var6 = var6 + param1;
                      var8_ref_hl.field_f.field_J = ff.field_o;
                      var8_ref_hl.field_f.field_fb = var12 - ((16711422 & var12) >> 1796712545) - -((fj.field_g.field_fb & 16711422) >> -1751457759);
                      var8_ref_hl.field_f.field_G = var12;
                      var8_ref_hl.field_f.field_Bb = ((16711423 & fj.field_g.field_Bb) >> 369179521) + -((16711423 & var12) >> -1720740735) + var12;
                      break L7;
                    }
                    var5++;
                    break L5;
                  }
                  var7--;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var7 = 0;
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L1;
          }
          var8 = stackIn_24_0;
          if (param0 == 55) {
            L10: while (true) {
              L11: {
                L12: {
                  if (var8 >= ic.field_c) {
                    break L12;
                  } else {
                    var14 = pd.field_g[var8];
                    if (var13 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if (null != var14.field_f) {
                          dn.field_l.field_Ob.a(var14.field_f, -16834);
                          var14.field_f.a(var14.field_f.a(true), 0, var7, param1, param3);
                          var7 = var7 + param1;
                          if (var14.field_f.field_ob == 0) {
                            break L13;
                          } else {
                            var4 = var14;
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                      var8++;
                      if (var13 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                var8 = -var7 + var6 + (dn.field_l.field_Ob.field_F + dn.field_l.field_Ob.field_N);
                dn.field_l.field_Ob.field_N = dn.field_l.field_Ob.field_N - var8;
                dn.field_l.field_Ob.field_Ib = dn.field_l.field_Ob.field_Ib + var8;
                break L11;
              }
              L14: {
                if (rg.field_c) {
                  dn.field_l.field_Ob.field_N = var7;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (!rg.field_c) {
                L15: {
                  dn.field_l.field_Ob.field_F = var7 - dn.field_l.field_Ob.field_N;
                  if (!jg.field_i) {
                    break L15;
                  } else {
                    if (tf.field_gb != null) {
                      sc.field_m = true;
                      break L15;
                    } else {
                      L16: {
                        var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                        if (!sc.field_m) {
                          break L16;
                        } else {
                          dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                          break L16;
                        }
                      }
                      L17: {
                        dn.field_l.a(2 * param1 * param2, true, true, param1);
                        if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                          stackOut_54_0 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          break L17;
                        } else {
                          stackOut_53_0 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          break L17;
                        }
                      }
                      sc.field_m = stackIn_55_0 != 0;
                      return (hl) (var4);
                    }
                  }
                }
                var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                if (sc.field_m) {
                  L18: {
                    dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L18;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L18;
                    }
                  }
                  sc.field_m = stackIn_65_0 != 0;
                  return (hl) (var4);
                } else {
                  L19: {
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                      stackOut_60_0 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      break L19;
                    } else {
                      stackOut_59_0 = 1;
                      stackIn_61_0 = stackOut_59_0;
                      break L19;
                    }
                  }
                  sc.field_m = stackIn_61_0 != 0;
                  return (hl) (var4);
                }
              } else {
                L20: {
                  rg.field_c = false;
                  sc.field_m = true;
                  dn.field_l.field_Ob.field_Ib = dn.field_l.field_Rb.field_N + -dn.field_l.field_Ob.field_N;
                  dn.field_l.field_Ob.field_Mb = 0;
                  dn.field_l.field_Ob.field_F = var7 - dn.field_l.field_Ob.field_N;
                  if (!jg.field_i) {
                    break L20;
                  } else {
                    if (tf.field_gb != null) {
                      sc.field_m = true;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                  if (!sc.field_m) {
                    break L21;
                  } else {
                    dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                    break L21;
                  }
                }
                L22: {
                  dn.field_l.a(2 * param1 * param2, true, true, param1);
                  if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                    stackOut_46_0 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    break L22;
                  } else {
                    stackOut_45_0 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    break L22;
                  }
                }
                sc.field_m = stackIn_47_0 != 0;
                return (hl) (var4);
              }
            }
          } else {
            return (hl) null;
          }
        }
    }

    final static void a(ck param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              pe.field_d = param0;
              if (param1 == 369179521) {
                break L1;
              } else {
                field_Lb = -2;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wj.J(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_Kb = "Accept unrated rematch";
        field_Jb = new sk(1);
    }
}
