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
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_kb = true;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -2) {
              if (!param2) {
                stackIn_7_0 = qq.field_R.a(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ns.field_a.a(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -68;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("gt.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
              stackIn_6_0 = 1;
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
                            stackIn_14_0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 1;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("gt.LA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final void e(boolean param0) {
        lc var2;
        lc stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        this.field_ib.b(2121792, 4210752, 55);
        if (param0) {
          return;
        } else {
          var2 = new lc((gt) (this), this.field_jb, fh.field_j);
          stackIn_3_0 = (lc) (var2);
          stackIn_3_1 = id.field_m;
          stackIn_3_2 = 15;
          stackIn_3_3 = 1;
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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 710) {
              break L0;
            } else {
              field_db = (da) null;
              break L0;
            }
          }
          if (!this.field_eb) {
            cn.a("tochangedisplayname.ws", ra.c(param1 + -708), (byte) -103);
            return;
          } else {
            rd.a(3, -82);
            this.n(-7);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("gt.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 == param3) {
              this.n(-7);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 >= 9) {
                  break L1;
                } else {
                  var6 = (String) null;
                  gt.a((byte) 20, (String) null, false);
                  break L1;
                }
              }
              stackIn_7_0 = super.a(param0, param1, (byte) 51, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("gt.KA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lc stackIn_15_0 = null;
        lc stackIn_16_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_kb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_kb = true;
                stackIn_6_0 = this;

                if (param1 != 256) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              ((gt) (this)).field_eb = stackIn_7_1 != 0;
              if (param2 == 21089) {
                L2: {
                  this.field_ib.b(8405024, 4210752, param2 ^ 20995);
                  var6 = new lc((gt) (this), this.field_jb, param0);
                  if (5 != param1) {
                    if (param1 != 256) {
                      L3: {
                        stackIn_15_0 = (lc) (var6);

                        if (this.field_cb) {
                          stackIn_16_0 = (lc) ((Object) stackIn_15_0);
                          stackIn_16_1 = ii.field_b;
                          break L3;
                        } else {
                          stackIn_16_0 = (lc) ((Object) stackIn_15_0);
                          stackIn_16_1 = cq.field_c;
                          break L3;
                        }
                      }
                      ((lc) (Object) stackIn_16_0).a(stackIn_16_1, -1, true);
                      break L2;
                    } else {
                      var6.a(ii.field_b, (byte) -123, (qm) (this));
                      break L2;
                    }
                  } else {
                    var6.a(vf.field_e, 11, true);
                    var6.a(of.field_k, 17, true);
                    break L2;
                  }
                }
                L4: {
                  if ((param1 ^ -1) == -4) {
                    var6.a(lq.field_c, 7, true);
                    break L4;
                  } else {
                    if ((param1 ^ -1) != -5) {
                      if (-7 != (param1 ^ -1)) {
                        if ((param1 ^ -1) == -10) {
                          var6.a(pl.field_s, (byte) -123, (qm) (this));
                          break L4;
                        } else {
                          this.b((byte) -97, var6);
                          return;
                        }
                      } else {
                        var6.a(eq.field_w, 9, true);
                        break L4;
                      }
                    } else {
                      var6.a(ch.field_e, 8, true);
                      break L4;
                    }
                  }
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("gt.BB(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
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
