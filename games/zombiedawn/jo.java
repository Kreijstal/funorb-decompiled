/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo extends qk {
    static int field_Qb;
    static char[] field_Nb;
    private int field_Rb;
    private boolean field_Sb;
    static vf field_Ob;
    private int field_Pb;
    static vn[][] field_Tb;

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        kk var3_ref_kk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qh var10 = null;
        L0: {
          var9 = ZombieDawn.field_J;
          if (-24 == (this.field_F ^ -1)) {
            this.field_F = 0;
            break L0;
          } else {
            break L0;
          }
        }
        super.l(param0);
        if (this.field_Ab >= 0) {
          if (0 == this.field_F) {
            if (!this.field_Sb) {
              if (0 == (this.field_Rb ^ -1)) {
                var2 = this.l(param0 + -178) & 127;
                if (-61 >= (var2 ^ -1)) {
                  var3 = var2 - 60;
                  var4 = this.a(true);
                  var5 = this.f(237239984);
                  var6 = 0;
                  var7 = 0;
                  var8 = var3;
                  if (var8 != 0) {
                    if (-3 != (var8 ^ -1)) {
                      if (-2 != (var8 ^ -1)) {
                        if ((var8 ^ -1) != -4) {
                          L1: while (true) {
                            var4 = var4 + var6;
                            var5 = var5 + var7;
                            if (this.b(0, var4, var5) < 60) {
                              continue L1;
                            } else {
                              this.field_Pb = var5;
                              this.field_Rb = var4;
                              this.e(23, -6904);
                              return;
                            }
                          }
                        } else {
                          var6 = -24;
                          L2: while (true) {
                            var4 = var4 + var6;
                            var5 = var5 + var7;
                            if (this.b(0, var4, var5) < 60) {
                              continue L2;
                            } else {
                              this.field_Pb = var5;
                              this.field_Rb = var4;
                              this.e(23, -6904);
                              return;
                            }
                          }
                        }
                      } else {
                        var6 = 24;
                        L3: while (true) {
                          var4 = var4 + var6;
                          var5 = var5 + var7;
                          if (this.b(0, var4, var5) < 60) {
                            continue L3;
                          } else {
                            this.field_Pb = var5;
                            this.field_Rb = var4;
                            this.e(23, -6904);
                            return;
                          }
                        }
                      }
                    } else {
                      var7 = 24;
                      L4: while (true) {
                        var4 = var4 + var6;
                        var5 = var5 + var7;
                        if (this.b(0, var4, var5) < 60) {
                          continue L4;
                        } else {
                          this.field_Pb = var5;
                          this.field_Rb = var4;
                          this.e(23, -6904);
                          return;
                        }
                      }
                    }
                  } else {
                    var7 = -24;
                    L5: while (true) {
                      var4 = var4 + var6;
                      var5 = var5 + var7;
                      if (this.b(0, var4, var5) < 60) {
                        continue L5;
                      } else {
                        this.field_Pb = var5;
                        this.field_Rb = var4;
                        this.e(23, -6904);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.e(23, -6904);
                return;
              }
            } else {
              L6: {
                this.field_F = 23;
                if (-1 == this.field_Rb) {
                  break L6;
                } else {
                  var10 = dj.field_e.field_H.a(true, this.a(true), this.field_Pb, this.field_Rb, this.f(237239984));
                  if (var10 == null) {
                    break L6;
                  } else {
                    var3_ref_kk = (kk) ((Object) var10.b((byte) 26));
                    this.field_Pb = var3_ref_kk.field_h;
                    this.field_Rb = var3_ref_kk.field_l;
                    break L6;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void x(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == -2) {
          if (null == ng.field_b) {
            return;
          } else {
            var1 = ng.field_b;
            synchronized (var1) {
              L0: {
                ng.field_b = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void o(byte param0) {
        field_Nb = null;
        if (param0 > -59) {
          jo.o((byte) -101);
          field_Tb = (vn[][]) null;
          field_Ob = null;
          return;
        } else {
          field_Tb = (vn[][]) null;
          field_Ob = null;
          return;
        }
    }

    jo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Rb = -1;
        this.field_Pb = -1;
        this.field_pb = this.field_Eb;
    }

    final void g(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((this.field_F ^ -1) != -24) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((jo) (this)).field_Sb = stackIn_3_1 != 0;
          if (this.field_Sb) {
            this.field_X = this.field_Pb;
            this.field_Y = this.field_Rb;
            this.c(0, this.field_D / 2);
            break L1;
          } else {
            break L1;
          }
        }
        super.g(106);
        if (!this.field_Sb) {
          if (param0 <= 95) {
            jo.o((byte) -102);
            return;
          } else {
            return;
          }
        } else {
          if (1 != this.field_F) {
            if (0 != this.field_F) {
              if (param0 <= 95) {
                jo.o((byte) -102);
                return;
              } else {
                return;
              }
            } else {
              if (this.a(true) != this.field_Rb) {
                this.field_F = 23;
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                if (this.f(237239984) == this.field_Pb) {
                  this.field_Pb = -1;
                  this.field_Rb = -1;
                  this.field_Sb = false;
                  this.e(0, -6904);
                  this.l((byte) 52);
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_F = 23;
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (this.a(true) != this.field_Rb) {
              this.field_F = 23;
              if (param0 > 95) {
                return;
              } else {
                jo.o((byte) -102);
                return;
              }
            } else {
              if (this.f(237239984) == this.field_Pb) {
                this.field_Pb = -1;
                this.field_Rb = -1;
                this.field_Sb = false;
                this.e(0, -6904);
                this.l((byte) 52);
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_F = 23;
                if (param0 > 95) {
                  return;
                } else {
                  jo.o((byte) -102);
                  return;
                }
              }
            }
          }
        }
    }

    final static int w(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            de var2_ref_de = null;
            int var2 = 0;
            int stackIn_14_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if ((tf.field_c.field_h ^ -1) > -5) {
              try {
                L0: {
                  L1: {
                    var1_int = -73 / ((param0 - 36) / 39);
                    if (jd.field_a == 0) {
                      hi.field_O = lc.field_a.a(2, gd.field_u, bd.field_j);
                      jd.field_a = jd.field_a + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if ((jd.field_a ^ -1) != -2) {
                      break L2;
                    } else {
                      if (-3 == (hi.field_O.field_f ^ -1)) {
                        stackOut_13_0 = k.a(-1, 50);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if ((hi.field_O.field_f ^ -1) == -2) {
                          jd.field_a = jd.field_a + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (-3 != (jd.field_a ^ -1)) {
                      break L3;
                    } else {
                      sb.field_a = new gm((java.net.Socket) (hi.field_O.field_d), lc.field_a);
                      var2_ref_de = new de(13);
                      uj.a(ha.field_a, uj.field_d, (byte) -114, var2_ref_de, nd.field_a);
                      var2_ref_de.i(15, -101);
                      var2_ref_de.h(-116, wh.field_b);
                      sb.field_a.a(13, true, 0, var2_ref_de.field_h);
                      jd.field_a = jd.field_a + 1;
                      ul.field_e = 30000L + pd.a(-22826);
                      break L3;
                    }
                  }
                  L4: {
                    if ((jd.field_a ^ -1) != -4) {
                      break L4;
                    } else {
                      if (sb.field_a.b((byte) -80) <= 0) {
                        if ((pd.a(-22826) ^ -1L) < (ul.field_e ^ -1L)) {
                          stackOut_29_0 = k.a(-2, 50);
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        var2 = sb.field_a.a(false);
                        if (var2 != 0) {
                          stackOut_24_0 = k.a(var2, 50);
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          jd.field_a = jd.field_a + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != jd.field_a) {
                    stackOut_34_0 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    tf.field_c.a(bo.field_n, sb.field_a, 120);
                    sb.field_a = null;
                    jd.field_a = 0;
                    hi.field_O = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return k.a(-3, 50);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_25_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_33_0;
                    } else {
                      return stackIn_35_0;
                    }
                  }
                }
              }
            } else {
              if ((tf.field_c.field_e ^ -1) != 0) {
                if ((tf.field_c.field_e ^ -1) == 1) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(wk param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == 5060) {
              L1: {
                var3_int = param0.a(this.a(true), (byte) -107);
                var4 = param0.a(this.f(237239984), 0);
                bi.d(var3_int, var4, this.field_Eb, 65535);
                if ((this.field_Rb ^ -1) == 0) {
                  break L1;
                } else {
                  bi.e(var3_int, var4, param0.a(this.field_Rb, (byte) -74), param0.a(this.field_Pb, 0), 16711680);
                  break L1;
                }
              }
              L2: {
                if (this.field_yb != null) {
                  var5_int = param0.a(this.field_yb.a(true), (byte) -59);
                  var6 = param0.a(this.field_yb.f(237239984), 0);
                  bi.e(var3_int, 10 + var4 - 48, var5_int, -48 + (var6 - -10), 16776960);
                  bj.field_q.c(Integer.toString(this.field_yb.field_F), var5_int, -48 + var6, 16777215, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = Integer.toString(this.field_F);
              var5 = Integer.toString(this.l(-111) & 127);
              var10 = 0;
              var6 = var10;
              L3: while (true) {
                if (this.field_ub <= var10) {
                  bi.g(var3_int, var4, 3, 16776960);
                  bj.field_q.c(var5, var3_int, -48 + var4, 16777215, 0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = param0.a(this.field_jb[var10], (byte) -62);
                  var8 = param0.a(this.field_gb[var10], 0);
                  bi.b(-1 + var7, var8 - 1, 3, 3, 0);
                  bi.a(var7, var8, 65280);
                  var10++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("jo.L(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_Qb = 5;
        field_Nb = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_Tb = new vn[2][];
    }
}
