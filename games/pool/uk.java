/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk implements Iterable {
    static dd[] field_b;
    ma[] field_k;
    static boolean field_c;
    int field_h;
    static nm field_d;
    private static int field_f;
    static dd field_g;
    static int field_a;
    static int field_l;
    static int field_m;
    static dd[] field_i;
    private ma field_e;
    static int field_j;

    final static void a(int[] param0, int param1, eg param2) {
        try {
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            StringBuilder stackIn_32_1 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            RuntimeException decompiledCaughtException = null;
            int var3_int = 0;
            RuntimeException var3 = null;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            var7 = Pool.field_O;
            try {
              L0: {
                d.a(param2, -23109);
                var4 = param2.field_D + param2.field_w >> 599720545;
                var5 = param2.field_y + param2.field_S >> 1888914401;
                var6 = param2.field_V + param2.field_x >> -771558527;
                var3_int = 0;
                L1: while (true) {
                  if (param2.field_g.length <= var3_int) {
                    var3_int = 0;
                    L2: while (true) {
                      if (var3_int >= param2.field_Y.length) {
                        var3_int = 0;
                        L3: while (true) {
                          if (var3_int >= param2.field_q.length) {
                            L4: {
                              if (param1 < -121) {
                                break L4;
                              } else {
                                field_i = (dd[]) null;
                                break L4;
                              }
                            }
                            L5: {
                              L6: {
                                if (-13 != (param0.length ^ -1)) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (65536 != param0[3]) {
                                      break L7;
                                    } else {
                                      if (param0[4] != 0) {
                                        break L7;
                                      } else {
                                        if (0 != param0[5]) {
                                          break L7;
                                        } else {
                                          if (0 != param0[6]) {
                                            break L7;
                                          } else {
                                            if (-65537 != (param0[7] ^ -1)) {
                                              break L7;
                                            } else {
                                              if (param0[8] != 0) {
                                                break L7;
                                              } else {
                                                if (param0[9] != 0) {
                                                  break L7;
                                                } else {
                                                  if (-1 != (param0[10] ^ -1)) {
                                                    break L7;
                                                  } else {
                                                    if ((param0[11] ^ -1) != -65537) {
                                                      break L7;
                                                    } else {
                                                      break L6;
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
                                  System.out.println("Recentring with transformation");
                                  new Throwable().printStackTrace();
                                  param0[1] = param0[1] + (var4 * param0[6] + (var5 * param0[7] - -(param0[8] * var6)) >> 2046504688);
                                  param0[2] = param0[2] + (param0[11] * var6 + param0[9] * var4 - -(var5 * param0[10]) >> -193119408);
                                  param0[0] = param0[0] + (param0[4] * var5 + var4 * param0[3] - -(var6 * param0[5]) >> 253897776);
                                  break L5;
                                }
                              }
                              param0[1] = param0[1] + var5;
                              param0[2] = param0[2] + var6;
                              param0[0] = param0[0] + var4;
                              break L5;
                            }
                            param2.a();
                            break L0;
                          } else {
                            param2.field_q[var3_int] = param2.field_q[var3_int] - var6;
                            var3_int++;
                            continue L3;
                          }
                        }
                      } else {
                        param2.field_Y[var3_int] = param2.field_Y[var3_int] - var5;
                        var3_int++;
                        continue L2;
                      }
                    }
                  } else {
                    param2.field_g[var3_int] = param2.field_g[var3_int] - var4;
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = decompiledCaughtException;
                stackIn_29_0 = (RuntimeException) (var3);

                stackIn_29_1 = new StringBuilder().append("uk.F(");

                if (param0 == null) {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "null";
                  break L8;
                } else {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "{...}";
                  break L8;
                }
              }
              L9: {


                stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
                  stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                  stackIn_33_2 = "null";
                  break L9;
                } else {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
                  stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                  stackIn_33_2 = "{...}";
                  break L9;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, dd[] param11, int param12, lr param13, int param14, int param15, int param16, int param17, dd[] param18, dd[] param19, lr param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        java.applet.Applet var22 = null;
        try {
          L0: {
            L1: {
              if (param12 == -23994) {
                break L1;
              } else {
                var22 = (java.applet.Applet) null;
                uk.a(-48, (java.applet.Applet) null);
                break L1;
              }
            }
            wk.a(param9, param5, param13, param8, param20, param4, param15, new nm(param11), param3, param17, new nm(param19), param10, param0, param2, param1, param7, 255, param6, new nm(param18), param16, param14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param20 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ')');
        }
    }

    final void a(ma param0, boolean param1, long param2) {
        ma var5 = null;
        eg var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (param0.field_k == null) {
                break L1;
              } else {
                param0.a((byte) -117);
                break L1;
              }
            }
            L2: {
              var5 = this.field_k[(int)((long)(this.field_h + -1) & param2)];
              param0.field_d = var5;
              param0.field_k = var5.field_k;
              param0.field_k.field_d = param0;
              param0.field_c = param2;
              param0.field_d.field_k = param0;
              if (param1) {
                break L2;
              } else {
                var6 = (eg) null;
                uk.a((int[]) null, 89, (eg) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("uk.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hb((uk) (this)));
    }

    final static pn a(int param0, byte param1, int param2, int param3) {
        int stackIn_43_0 = 0;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pn var8_ref_pn;
        int var9;
        pn var9_ref_pn;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        var13 = Pool.field_O;
        qd.field_b.field_Rb.field_T.d((byte) 90);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = aa.field_e - 1;
        L0: while (true) {
          if (-1 < (var7 ^ -1)) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (aa.field_e <= var8) {
                L2: {
                  var8 = qd.field_b.field_Rb.field_Db + qd.field_b.field_Rb.field_Cb + (-var7 - -var6);
                  qd.field_b.field_Rb.field_Db = qd.field_b.field_Rb.field_Db - var8;
                  qd.field_b.field_Rb.field_eb = qd.field_b.field_Rb.field_eb + var8;
                  if (lf.field_c) {
                    qd.field_b.field_Rb.field_Db = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!lf.field_c) {
                    break L3;
                  } else {
                    lf.field_c = false;
                    qd.field_b.field_Rb.field_E = 0;
                    gd.field_b = true;
                    qd.field_b.field_Rb.field_eb = -qd.field_b.field_Rb.field_Db + qd.field_b.field_Sb.field_Db;
                    break L3;
                  }
                }
                L4: {
                  if (param1 <= -58) {
                    break L4;
                  } else {
                    field_a = 102;
                    break L4;
                  }
                }
                L5: {
                  qd.field_b.field_Rb.field_Cb = -qd.field_b.field_Rb.field_Db + var7;
                  if (!rg.field_p) {
                    break L5;
                  } else {
                    if (null != uq.field_D) {
                      gd.field_b = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = -qd.field_b.field_Rb.field_Cb - (qd.field_b.field_Rb.field_Db - qd.field_b.field_Sb.field_Db);
                  if (gd.field_b) {
                    qd.field_b.field_Rb.field_E = -qd.field_b.field_Rb.field_eb + var9;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  qd.field_b.a(-1207, param0 * (2 * param2), param2, true);
                  if (qd.field_b.field_Rb.field_eb - -qd.field_b.field_Rb.field_E != var9) {
                    stackIn_43_0 = 0;
                    break L7;
                  } else {
                    stackIn_43_0 = 1;
                    break L7;
                  }
                }
                gd.field_b = stackIn_43_0 != 0;
                return (pn) (var4);
              } else {
                var9_ref_pn = wb.field_e[var8];
                if (var9_ref_pn.field_u != null) {
                  L8: {
                    qd.field_b.field_Rb.a(-104, var9_ref_pn.field_u);
                    var9_ref_pn.field_u.b(var7, 2147483647, param3, var9_ref_pn.field_u.b(true), param2);
                    if (var9_ref_pn.field_u.field_R == 0) {
                      break L8;
                    } else {
                      var4 = var9_ref_pn;
                      break L8;
                    }
                  }
                  var7 = var7 + param2;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L9: {
              var8_ref_pn = wb.field_e[var7];
              var9 = 0;
              if (ea.field_z) {
                break L9;
              } else {
                if (var5 < ap.field_E) {
                  var10_int = f.a(5, var8_ref_pn.field_p);
                  if (var8_ref_pn.b(14842) < var10_int) {
                    break L9;
                  } else {
                    L10: {
                      if (var8_ref_pn.field_g) {
                        break L10;
                      } else {
                        if (!ia.a(var8_ref_pn.field_q, 24552)) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9 = 1;
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
            }
            if (var9 != 0) {
              L11: {
                var5++;
                if (null == var8_ref_pn.field_u) {
                  break L11;
                } else {
                  if (lf.field_c) {
                    break L11;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L12: {
                if (null != var8_ref_pn.field_u) {
                  break L12;
                } else {
                  ib.field_r = ib.field_r + 1;
                  break L12;
                }
              }
              var10 = ge.a((byte) -24, var8_ref_pn);
              var11 = var10 + lr.a(var8_ref_pn.field_f);
              var12 = fn.a(var8_ref_pn, -55);
              var8_ref_pn.field_u = new vh(0L, kb.field_h, var11);
              var8_ref_pn.field_u.field_P = -(var12 >> 558370049 & 8355711) + (var12 + ((16711423 & kb.field_h.field_P) >> 801192257));
              var8_ref_pn.field_u.field_I = m.field_c;
              var8_ref_pn.field_u.field_N = var12;
              var8_ref_pn.field_u.field_K = var12 + -(var12 >> -1369816927 & 8355711) + ((kb.field_h.field_K & 16711423) >> -424587231);
              var6 = var6 + param2;
              var7--;
              continue L0;
            } else {
              var8_ref_pn.field_u = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 >= -37) {
            field_g = (dd) null;
        }
        field_b = null;
        field_i = null;
        field_d = null;
    }

    final ma a(int param0, long param1) {
        ma var5 = null;
        int var6 = Pool.field_O;
        if (param0 != -28010) {
            return (ma) null;
        }
        ma var4 = this.field_k[(int)(param1 & (long)(-1 + this.field_h))];
        this.field_e = var4.field_d;
        while (this.field_e != var4) {
            if (!((param1 ^ -1L) != (this.field_e.field_c ^ -1L))) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_d;
                return var5;
            }
            this.field_e = this.field_e.field_d;
        }
        this.field_e = null;
        return null;
    }

    uk(int param0) {
        int var2 = 0;
        ma dupTemp$0 = null;
        ma var3 = null;
        this.field_h = param0;
        this.field_k = new ma[param0];
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new ma();
            var3 = dupTemp$0;
            this.field_k[var2] = dupTemp$0;
            var3.field_k = var3;
            var3.field_d = var3;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = p.a((byte) -100, var4, param1).getFile();
                      mo.a("updatelinks", new Object[]{"home", var3 + "home.ws"}, 98, param1);
                      mo.a("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 70, param1);
                      mo.a("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 116, param1);
                      mo.a("updatelinks", new Object[]{"options", var3 + "options.ws"}, param0 ^ 558370174, param1);
                      mo.a("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param0 ^ 558370117, param1);
                      if (param0 == 558370049) {
                        break L2;
                      } else {
                        field_b = (dd[]) null;
                        break L2;
                      }
                    }
                    mo.a("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, 125, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("uk.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        field_m = 0;
        field_a = 1 << field_f;
        field_j = -1;
        field_c = false;
    }
}
