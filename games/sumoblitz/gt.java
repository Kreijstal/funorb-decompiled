/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class gt extends ur implements ai {
    static jh field_gb;
    static int field_ab;
    private boolean field_cb;
    static da field_db;
    static String field_hb;
    static boolean field_bb;
    private pq field_ib;
    private boolean field_kb;
    private boolean field_fb;
    private vn field_jb;
    private boolean field_eb;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 != -1540) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                gt.a(-115, (java.applet.Applet) null);
            }
            ie.a(-118, "", param1);
            of.a(param0 + 9732, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gt.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void n(int param0) {
        if (param0 == -7) {
          if (this.field_D) {
            this.field_D = false;
            if (!this.field_cb) {
              if (!this.field_fb) {
                return;
              } else {
                bv.a(-363927231);
                return;
              }
            } else {
              ag.a(0);
              if (Sumoblitz.field_L) {
                L0: {
                  if (this.field_fb) {
                    bv.a(-363927231);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_kb = true;
          if (this.field_D) {
            this.field_D = false;
            if (this.field_cb) {
              ag.a(0);
              if (!Sumoblitz.field_L) {
                return;
              } else {
                L1: {
                  if (this.field_fb) {
                    bv.a(-363927231);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (this.field_fb) {
                  bv.a(-363927231);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_db = null;
        int var1 = 57 / ((param0 - 70) / 48);
        field_gb = null;
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 <= -2) {
              if (!param2) {
                stackOut_6_0 = qq.field_R.a(param1);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = ns.field_a.a(param1);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -68;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("gt.W(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
              var3 = ji.a(param1, (byte) 66);
              if (param2 >= 46) {
                break L1;
              } else {
                field_hb = (String) null;
                break L1;
              }
            }
            if (0 != (param0.indexOf(param1) ^ -1)) {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.indexOf(var3) == -1) {
                L2: {
                  L3: {
                    if (param0.startsWith(param1)) {
                      break L3;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param0.endsWith(param1)) {
                          break L3;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("gt.LA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final void e(boolean param0) {
        lc var2 = null;
        lc stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        lc stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        this.field_ib.b(2121792, 4210752, 55);
        if (param0) {
          return;
        } else {
          var2 = new lc((gt) (this), this.field_jb, fh.field_j);
          stackOut_1_0 = (lc) (var2);
          stackOut_1_1 = id.field_m;
          stackOut_1_2 = 15;
          stackOut_1_3 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          stackIn_3_2 = stackOut_1_2;
          stackIn_3_3 = stackOut_1_3;
          ((lc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
          this.b((byte) -121, var2);
          return;
        }
    }

    public void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                field_db = (da) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_eb) {
                break L2;
              } else {
                rd.a(3, -82);
                this.n(-7);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            cn.a("tochangedisplayname.ws", ra.c(param1 + -708), (byte) -103);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("gt.C(").append(param0).append(',').append(param1).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
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
            if (13 == param3) {
              this.n(-7);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 >= 9) {
                  break L1;
                } else {
                  var6 = (String) null;
                  discarded$2 = gt.a((byte) 20, (String) null, false);
                  break L1;
                }
              }
              stackOut_6_0 = super.a(param0, param1, (byte) 51, param3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("gt.KA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (qk.field_O == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (ga.field_j != kw.field_c) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (-1 != (as.field_v.field_p ^ -1)) {
                    break L2;
                  } else {
                    if ((rj.field_a - -10000L ^ -1L) <= (wq.a(param0 + -14) ^ -1L)) {
                      break L2;
                    } else {
                      as.field_v.g(param1, 8);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (as.field_v.field_p <= param0) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        qk.field_O.a(0, -2, as.field_v.field_n, as.field_v.field_p);
                        rj.field_a = wq.a(-21);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        kk.a((byte) -115);
                        break L5;
                      }
                    }
                    as.field_v.field_p = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            as.field_v.field_p = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void m(int param0) {
        ib.d(1);
        if (qn.field_f == null) {
          rq.a(false);
          jm.b(28679);
          if (param0 != 0) {
            L0: {
              field_gb = (jh) null;
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L0;
              } else {
                break L0;
              }
            }
            kk.a((byte) -127);
            return;
          } else {
            L1: {
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L1;
              } else {
                break L1;
              }
            }
            kk.a((byte) -127);
            return;
          }
        } else {
          wr.a(true, qn.field_f);
          rq.a(false);
          jm.b(28679);
          if (param0 == 0) {
            L2: {
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L2;
              } else {
                break L2;
              }
            }
            kk.a((byte) -127);
            return;
          } else {
            L3: {
              field_gb = (jh) null;
              fu.a(-1);
              if (pe.a((byte) -98)) {
                as.field_v.g(1, 8);
                gt.a(0, 0);
                break L3;
              } else {
                break L3;
              }
            }
            kk.a((byte) -127);
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        wp discarded$2 = null;
        wp discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lc stackIn_16_0 = null;
        lc stackIn_17_0 = null;
        lc stackIn_18_0 = null;
        String stackIn_18_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        lc stackOut_15_0 = null;
        lc stackOut_17_0 = null;
        String stackOut_17_1 = null;
        lc stackOut_16_0 = null;
        String stackOut_16_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_kb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_kb = true;
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param1 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((gt) (this)).field_eb = stackIn_7_1 != 0;
              if (param2 == 21089) {
                L2: {
                  L3: {
                    this.field_ib.b(8405024, 4210752, param2 ^ 20995);
                    var6 = new lc((gt) (this), this.field_jb, param0);
                    if (5 != param1) {
                      break L3;
                    } else {
                      var6.a(vf.field_e, 11, true);
                      var6.a(of.field_k, 17, true);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1 != 256) {
                      break L4;
                    } else {
                      discarded$2 = var6.a(ii.field_b, (byte) -123, (qm) (this));
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    stackOut_15_0 = (lc) (var6);
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (this.field_cb) {
                      stackOut_17_0 = (lc) ((Object) stackIn_17_0);
                      stackOut_17_1 = ii.field_b;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L5;
                    } else {
                      stackOut_16_0 = (lc) ((Object) stackIn_16_0);
                      stackOut_16_1 = cq.field_c;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      break L5;
                    }
                  }
                  ((lc) (Object) stackIn_18_0).a(stackIn_18_1, -1, true);
                  break L2;
                }
                L6: {
                  L7: {
                    if ((param1 ^ -1) == -4) {
                      break L7;
                    } else {
                      L8: {
                        if ((param1 ^ -1) != -5) {
                          break L8;
                        } else {
                          var6.a(ch.field_e, 8, true);
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (-7 != (param1 ^ -1)) {
                          break L9;
                        } else {
                          var6.a(eq.field_w, 9, true);
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if ((param1 ^ -1) == -10) {
                        discarded$3 = var6.a(pl.field_s, (byte) -123, (qm) (this));
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        this.b((byte) -97, var6);
                        return;
                      }
                    }
                  }
                  var6.a(lq.field_c, 7, true);
                  break L6;
                }
                this.b((byte) -97, var6);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("gt.BB(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    gt(dg param0, vn param1, String param2, boolean param3, boolean param4) {
        super(param0, new lc((gt) null, param1, param2), 77, 10, 10);
        try {
            this.field_fb = param4 ? true : false;
            this.field_eb = false;
            this.field_jb = param1;
            this.field_cb = param3 ? true : false;
            this.field_kb = false;
            this.field_ib = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ib.field_J = true;
            this.a(this.field_ib, 78);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_ab = 0;
        field_hb = "Loading music";
    }
}
