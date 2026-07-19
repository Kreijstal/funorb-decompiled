/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc extends ml {
    private go field_o;
    static String field_p;
    private go field_q;
    static int field_n;

    cc(go param0, go param1, go param2) {
        super(param0);
        try {
            this.field_o = param2;
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_o.field_s.toLowerCase();
              if (param0) {
                break L1;
              } else {
                cc.a(80, -33, 98, true);
                break L1;
              }
            }
            L2: {
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L2;
              } else {
                if ((var4.length() ^ -1) >= -1) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 >= var3.length() + -1) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (var4.indexOf(var6) < 0) {
                        if (-1 >= (var4.indexOf(var7) ^ -1)) {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("cc.Q(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        qr var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        nf var9 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ed.field_f > pg.field_J) {
                pg.field_J = pg.field_J + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (pc.field_m == so.field_q.field_d) {
                break L2;
              } else {
                fl.field_f = fl.field_f + (so.field_q.field_d + -pc.field_m);
                pc.field_m = so.field_q.field_d;
                break L2;
              }
            }
            if (-1 <= (pg.field_J ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                bq.a(127);
                tg.field_c.a(param3, -20429);
                if (null == wi.field_c) {
                  break L3;
                } else {
                  if (bg.field_g) {
                    discarded$1 = wi.field_c.a(tg.field_c.field_B, param3, tg.field_c.field_N, (byte) 0);
                    break L3;
                  } else {
                    wi.field_c = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (5 <= var4_int) {
                  L5: {
                    if (-1 != (pr.field_c.field_rb ^ -1)) {
                      tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = sh.a(false, param2, tg.field_a, cr.field_c);
                    if (var9 == null) {
                      break L6;
                    } else {
                      ks.a(var9, 0);
                      break L6;
                    }
                  }
                  L7: {
                    if (param0 < -99) {
                      break L7;
                    } else {
                      cc.d(34);
                      break L7;
                    }
                  }
                  var8 = bk.b(-127);
                  if (var8 != null) {
                    dn.field_k = var8;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L8: {
                    var5 = oq.field_b[var4_int];
                    if (var5 != null) {
                      L9: {
                        if (var5.field_rb != 0) {
                          cj.a(var4_int, -127, var5);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var6 = id.a(-7019, var4_int);
                      mr.field_d[var4_int].field_pb = bh.field_m[var6];
                      n.field_n[var4_int].field_z = jf.field_d[var6];
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "cc.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            p var8 = null;
            bc stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            bc stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  if (param3 == 12000) {
                    break L1;
                  } else {
                    field_p = (String) null;
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (null == dh.field_a.field_k) {
                    break L2;
                  } else {
                    oq.field_g = new ej(dh.field_a.field_k, 5200, 0);
                    dh.field_a.field_k = null;
                    var6 = new ua(255, oq.field_g, new ej(dh.field_a.field_n, 12000, 0), 2097152);
                    break L2;
                  }
                }
                L3: {
                  if (oq.field_g != null) {
                    L4: {
                      if (tr.field_Eb != null) {
                        break L4;
                      } else {
                        tr.field_Eb = new ej[dh.field_a.field_p.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (tr.field_Eb[param2] != null) {
                        break L5;
                      } else {
                        tr.field_Eb[param2] = new ej(dh.field_a.field_p[param2], 12000, 0);
                        dh.field_a.field_p[param2] = null;
                        break L5;
                      }
                    }
                    var7 = new ua(param2, oq.field_g, tr.field_Eb[param2], 2097152);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var8 = lg.field_c.a(false, param2, (ua) (var6), (ua) (var7), param1);
                  if (param5) {
                    var8.c(255);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_14_0 = new bc(var8, param4, param0);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final u b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        u stackIn_2_0 = null;
        u stackIn_6_0 = null;
        u stackIn_10_0 = null;
        u stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        u stackOut_5_0 = null;
        u stackOut_9_0 = null;
        u stackOut_13_0 = null;
        u stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 == -11196) {
              var3 = this.field_q.field_s.toLowerCase();
              var4 = param1.toLowerCase();
              if (var4.length() == 0) {
                stackOut_5_0 = tj.field_b;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!gi.a(var4, -12076, var3)) {
                  stackOut_9_0 = tj.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (this.b(true, param1)) {
                    stackOut_13_0 = tj.field_b;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return p.field_g;
                  }
                }
              }
            } else {
              stackOut_1_0 = (u) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("cc.N(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != 255) {
            field_p = (String) null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var1 = im.field_c;
        synchronized (var1) {
          L0: {
            if (tc.field_B == fe.field_J) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              oq.field_j = ng.field_a[tc.field_B];
              ho.field_h = fb.field_yb[tc.field_B];
              tc.field_B = 1 + tc.field_B & 127;
              if (param0 == 55) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        }
        return stackIn_9_0 != 0;
    }

    final static void f(byte param0) {
        int var1 = 0;
        if (224 <= tf.field_p) {
            js.a(256, 197126152);
        } else {
            var1 = tf.field_p % 32;
            js.a(-var1 + 32 + tf.field_p, 197126152);
        }
        var1 = -41 % ((param0 - 29) / 57);
    }

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_22_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_35_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_21_0 = null;
        String stackOut_36_0 = null;
        String stackOut_26_0 = null;
        String stackOut_30_0 = null;
        String stackOut_34_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            var6 = this.field_q.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              var5 = var4;
              if (cg.a(-76, var5)) {
                stackOut_5_0 = ab.field_b;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (hb.a(var5, -31654)) {
                  stackOut_9_0 = ol.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (!pf.a(var5, (byte) 24)) {
                    L1: {
                      if (!param0) {
                        break L1;
                      } else {
                        this.field_q = (go) null;
                        break L1;
                      }
                    }
                    L2: {
                      stackOut_16_0 = this;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (param0) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L2;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L2;
                      }
                    }
                    if (this.b(stackIn_19_1 != 0, param1)) {
                      stackOut_21_0 = hq.field_d;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (-1 <= (var6.length() ^ -1)) {
                        stackOut_36_0 = bc.field_l;
                        stackIn_37_0 = stackOut_36_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (va.a(var6, -1, var5)) {
                          stackOut_26_0 = po.field_e;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ms.a(var5, (byte) -53, var6)) {
                            stackOut_30_0 = qg.field_k;
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (na.a(var5, 127, var6)) {
                              stackOut_34_0 = po.field_e;
                              stackIn_35_0 = stackOut_34_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              return ab.field_b;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_12_0 = no.field_d;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("cc.P(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L3;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0;
                    } else {
                      return stackIn_37_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_p = "Unpacking graphics";
        field_n = 56;
    }
}
