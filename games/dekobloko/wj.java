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
        cd var2;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("wj.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        ck var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              de.a(param4, -5540, param5, param0, param2);
              fe.field_b = param3;
              if (param2) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
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
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("wj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        wj.q(92);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = param2.a(75254128, param1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 != (var3.field_c ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ua.a(10L, -128);
                        if (var4 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var3.field_c ^ -1) == -2) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ua.a(100L, -128);
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param1.setVisible(false);
                        param1.dispose();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("wj.N(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        dj var5 = null;
        int var6 = 0;
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
                      var4 = param1.field_f;
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
                        var4 = ab.field_d;
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
                  var4 = of.field_g;
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
              var4 = wf.field_k;
              break L1;
            }
            L5: {
              L6: {
                var5 = new dj((gk) (this), ec.field_p, var4);
                if (!param1.field_n) {
                  break L6;
                } else {
                  if (!param1.field_e) {
                    var5.a(119, fa.field_o, (kg) (this));
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
                    var5.a(115, fa.field_o, (kg) (this));
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
            var4_ref = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var4_ref);

            stackIn_36_1 = new StringBuilder().append("wj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
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
        fd var2;
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
        boolean stackOut_2_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = client.field_A ? 1 : 0;
                    var4 = null;
                    dn.field_l.field_Ob.field_M.c(115);
                    var5 = 0;
                    var6 = 0;
                    var7 = ic.field_c - 1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var7 < 0) {
                        statePc = 23;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var8_ref_hl = pd.field_g[var7];
                    var9 = 0;
                    stackOut_2_0 = wc.field_n;
                    stackIn_24_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var13 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 < kf.field_M) {
                        statePc = 6;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var10_int = rf.a(0, var8_ref_hl.field_m);
                    if (var8_ref_hl.b((byte) 94) < var10_int) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var8_ref_hl.field_j) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!ik.a(var8_ref_hl.field_o, (byte) -118)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8_ref_hl.field_f = null;
                    if (var13 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var8_ref_hl.field_f == null) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (rg.field_c) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null == var8_ref_hl.field_f) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    bg.field_b = bg.field_b + 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var10 = mb.a(106, var8_ref_hl);
                    var11 = var10 + mm.c(var8_ref_hl.field_h);
                    var12 = tc.a(param0 ^ 4651, var8_ref_hl);
                    var8_ref_hl.field_f = new w(0L, fj.field_g, var11);
                    var6 = var6 + param1;
                    var8_ref_hl.field_f.field_J = ff.field_o;
                    var8_ref_hl.field_f.field_fb = var12 - ((16711422 & var12) >> 1796712545) - -((fj.field_g.field_fb & 16711422) >> -1751457759);
                    var8_ref_hl.field_f.field_G = var12;
                    var8_ref_hl.field_f.field_Bb = ((16711423 & fj.field_g.field_Bb) >> 369179521) + -((16711423 & var12) >> -1720740735) + var12;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var5++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var7--;
                    if (var13 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 = 0;
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var8 = stackIn_24_0;
                    if (param0 == 55) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return (hl) null;
                }
                case 26: {
                    if (var8 >= ic.field_c) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var14 = pd.field_g[var8];
                    if (var13 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (null != var14.field_f) {
                        statePc = 30;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 30: {
                    dn.field_l.field_Ob.a(var14.field_f, -16834);
                    var14.field_f.a(var14.field_f.a(true), 0, var7, param1, param3);
                    var7 = var7 + param1;
                    if (var14.field_f.field_ob == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var4 = var14;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var8++;
                    if (var13 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = -var7 + var6 + (dn.field_l.field_Ob.field_F + dn.field_l.field_Ob.field_N);
                    dn.field_l.field_Ob.field_N = dn.field_l.field_Ob.field_N - var8;
                    dn.field_l.field_Ob.field_Ib = dn.field_l.field_Ob.field_Ib + var8;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (rg.field_c) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    dn.field_l.field_Ob.field_N = var7;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (!rg.field_c) {
                        statePc = 48;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    rg.field_c = false;
                    sc.field_m = true;
                    dn.field_l.field_Ob.field_Ib = dn.field_l.field_Rb.field_N + -dn.field_l.field_Ob.field_N;
                    dn.field_l.field_Ob.field_Mb = 0;
                    dn.field_l.field_Ob.field_F = var7 - dn.field_l.field_Ob.field_N;
                    if (!jg.field_i) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (tf.field_gb != null) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    sc.field_m = true;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                    if (!sc.field_m) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    sc.field_m = stackIn_47_0 != 0;
                    return (hl) (var4);
                }
                case 48: {
                    dn.field_l.field_Ob.field_F = var7 - dn.field_l.field_Ob.field_N;
                    if (!jg.field_i) {
                        statePc = 57;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (tf.field_gb != null) {
                        statePc = 56;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                    if (!sc.field_m) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    sc.field_m = stackIn_55_0 != 0;
                    return (hl) (var4);
                }
                case 56: {
                    sc.field_m = true;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                    if (sc.field_m) {
                        statePc = 62;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    sc.field_m = stackIn_61_0 != 0;
                    return (hl) (var4);
                }
                case 62: {
                    dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    sc.field_m = stackIn_65_0 != 0;
                    return (hl) (var4);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ck param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wj.J(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
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
