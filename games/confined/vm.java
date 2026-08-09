/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vm extends hf {
    static bi field_cb;
    static String field_ab;
    private int field_db;
    private static long[] field_fb;
    private oi field_eb;
    static String field_bb;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        try {
            if (param2 >= -5) {
                field_ab = (String) null;
            }
            this.a(89, qe.field_O[(15 & this.field_db) >> 1857108482], param1, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vm.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(nf param0, int param1) {
        try {
            mk.b(128);
            if (param1 != -8409) {
                vm.a(72, false);
            }
            fn.a(param0.field_z, param0.field_t, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vm.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        if (param0 != 26402) {
            oi var3 = (oi) null;
            this.a((mn) null, -0.40409225463452153, 117, (vg) null, (oi) null);
        }
        this.a((byte) -120, jg.field_e, 3.0);
    }

    final void a(int param0, int param1) {
        this.field_db = this.field_db + 1;
        super.a(param0, param1);
        if (this.field_A.field_x.field_r[this.field_A.field_x.field_a + -1] <= this.field_D) {
            this.field_z = true;
            this.field_s = 2;
        }
    }

    final void a(mn param0, byte param1) {
        try {
            int var3_int = 68 % ((-2 - param1) / 62);
            this.field_eb.field_p = this.field_D;
            this.field_eb.field_u = 0.5;
            this.field_eb.field_t = this.field_E;
            this.field_eb.field_o = this.field_t;
            param0.a((rk) (this.field_eb), (byte) -93);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h(byte param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (om.field_s == null) {
                    break L1;
                  } else {
                    om.field_s.d(-121);
                    break L1;
                  }
                }
                L2: {
                  if (null != oc.field_l) {
                    oc.field_l.a((byte) -104);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == gd.field_q) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        gd.field_q.c(-102);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (vh.field_e == null) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (vh.field_e.length <= var1_int) {
                        break L6;
                      } else {
                        if (vh.field_e[var1_int] != null) {
                          try {
                            L8: {
                              vh.field_e[var1_int].c(-96);
                              break L8;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L9: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L9;
                            }
                          }
                          var1_int++;
                          continue L7;
                        } else {
                          var1_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (param0 == 37) {
                    break L10;
                  } else {
                    field_cb = (bi) null;
                    break L10;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) ((Object) var1), "vm.K(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vm(hn param0, ee param1, double[] param2, double param3, double param4, double param5, double param6, boolean param7) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.1, 0.01, param1, 4.0, 0.004);
        double[] var42 = null;
        double[] var40 = null;
        double[] var39 = null;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double[] var45 = null;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        this.field_db = 0;
        this.field_eb = new oi((pm) (this));
        try {
            this.field_t = this.field_t + (param5 * param2[10] + (param4 * param2[7] + param3 * param2[4]));
            this.field_D = this.field_D + (param2[11] * param5 + (param3 * param2[5] + param2[8] * param4));
            this.field_E = this.field_E + (param5 * param2[9] + (param4 * param2[6] + param3 * param2[3]));
            var42 = param0.field_B.e(3008);
            var40 = var42;
            var39 = var40;
            double[] var13 = var39;
            var14 = -this.field_E + var42[0];
            var16 = var42[1] - this.field_t;
            var18 = var42[2] - this.field_D;
            var20 = var42[3];
            var22 = var42[4];
            var24 = var42[5];
            var45 = new double[12];
            param0.field_B.field_jb.a((byte) 55, var45);
            var27 = var45[9] * var20 + var22 * var45[10] + var24 * var45[11];
            var22 = var22 - var45[10] * var27;
            var24 = var24 - var45[11] * var27;
            var20 = var20 - var45[9] * var27;
            var20 = var20 * param6;
            var24 = var24 * param6;
            var22 = var22 * param6;
            var20 = var20 + var27 * var45[9];
            var24 = var24 + var45[11] * var27;
            var22 = var22 + var45[10] * var27;
            var29 = -0.05 + (var24 * var24 + (var22 * var22 + var20 * var20));
            var31 = var18 * var24 + (var20 * var14 + var22 * var16);
            var33 = var18 * var18 + (var14 * var14 + var16 * var16);
            var35 = -(var33 * var29) + var31 * var31;
            if (0.0 > var35) {
                var35 = 0.0;
            } else {
                var35 = Math.sqrt(var35);
            }
            var37 = (-var31 - var35) / var29;
            if (0.0 > var37) {
                var37 = (-var31 + var35) / var29;
            }
            this.field_Y = 0.004;
            this.field_G = var22 + var16 / var37;
            if (param7) {
                this.field_W = (pm) ((Object) param0.field_B);
            }
            this.field_L = var24 + var18 / var37;
            this.field_K = var14 / var37 + var20;
            kj.a(ih.field_e, 96, param1);
            new gk((pm) (this), kh.field_fb).field_w = 0.1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static oc a(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        lb var9 = null;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          var8 = e.field_c;
          var3 = var8.c(32);
          if ((128 & var3) == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          im.field_c = stackIn_3_0 != 0;
          cc.field_m = var3 & 127;
          ve.field_h = var8.c(32);
          rl.field_x = var8.h((byte) -68);
          if (cc.field_m == 2) {
            ha.field_e = var8.a((byte) 25);
            qd.field_d = var8.f(-112);
            break L1;
          } else {
            qd.field_d = 0;
            ha.field_e = 0;
            break L1;
          }
        }
        L2: {
          if (param0 != var8.c(32)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          hb.field_v = var8.d(true);
          if (var4 != 0) {
            ej.field_d = var8.d(true);
            break L3;
          } else {
            ej.field_d = hb.field_v;
            break L3;
          }
        }
        L4: {
          L5: {
            if (cc.field_m == 1) {
              break L5;
            } else {
              if (4 == cc.field_m) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          var8.a((byte) 25);
          var8.d(true);
          break L4;
        }
        L6: {
          if (param1) {
            var5 = var8.a((byte) 25);
            try {
              L7: {
                L8: {
                  var9 = wc.field_Ub.b(1, var5);
                  q.field_j = var9.e((byte) -114);
                  if (!ej.field_d.equals(qc.field_m)) {
                    stackIn_22_0 = var9.field_s;
                    break L8;
                  } else {
                    stackIn_22_0 = null;
                    break L8;
                  }
                }
                lk.field_b = stackIn_22_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                mb.a("CC1", true, (Throwable) ((Object) var6));
                q.field_j = null;
                lk.field_b = null;
                break L9;
              }
            }
            break L6;
          } else {
            q.field_j = tb.a(80, var8, param0 + -119);
            lk.field_b = null;
            break L6;
          }
        }
        return new oc(param1);
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_ab = (String) null;
        }
        field_bb = null;
        field_fb = null;
        field_cb = null;
        field_ab = null;
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_ab = "Shield upgrade";
            field_fb = new long[256];
            field_bb = "Passwords must be between 5 and 20 characters long";
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_fb[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0 ^ -1L) == -2L) {
                      var0 = var0 >>> -5284927 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
