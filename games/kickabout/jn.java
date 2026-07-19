/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends wv implements vh {
    static hd field_lb;
    static ut field_qb;
    private boolean field_nb;
    private boolean field_pb;
    static int field_ob;
    static r field_rb;
    static int field_kb;
    private ae field_mb;

    public static void s(int param0) {
        field_lb = null;
        field_rb = null;
        if (param0 != 248) {
            jn.s(-37);
            field_qb = null;
            return;
        }
        field_qb = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            boolean discarded$2 = false;
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            java.applet.Applet var8 = null;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            var7 = Kickabout.field_G;
            try {
              L0: {
                if (!lb.field_F) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (mm.a(30858, "getcookies", param1));
                      var4 = wr.a(var3, 2, ';');
                      var5 = 0;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          L3: {
                            if (param0 == 17) {
                              break L3;
                            } else {
                              var8 = (java.applet.Applet) null;
                              discarded$2 = jn.a(100, (java.applet.Applet) null);
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackOut_8_0 = 1;
                                stackIn_9_0 = stackOut_8_0;
                                decompiledRegionSelector0 = 0;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    L6: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L6;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) (var2_ref);
                stackOut_19_1 = new StringBuilder().append("jn.BB(").append(param0).append(',');
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L7;
                } else {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L7;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_9_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jn(se param0, ae param1) {
        super(param0, fj.field_b, kk.field_L, false, false);
        try {
            this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void t(int param0) {
        this.a(true, wb.a(param0 ^ -105, nb.field_g, 248), (byte) -71);
        if (param0 != 17) {
            field_qb = (ut) null;
        }
    }

    final boolean k(int param0) {
        wn var2 = null;
        if (param0 == -1) {
          if (this.field_C) {
            if (!this.field_pb) {
              var2 = uf.a(param0 + -1459);
              if (var2 != null) {
                this.a(false, var2, (byte) -71);
                return super.k(-1);
              } else {
                return super.k(-1);
              }
            } else {
              return super.k(-1);
            }
          } else {
            return super.k(-1);
          }
        } else {
          jn.s(-114);
          if (this.field_C) {
            if (!this.field_pb) {
              var2 = uf.a(param0 + -1459);
              if (var2 != null) {
                this.a(false, var2, (byte) -71);
                return super.k(-1);
              } else {
                return super.k(-1);
              }
            } else {
              return super.k(-1);
            }
          } else {
            return super.k(-1);
          }
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
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
            if (!this.field_nb) {
              L1: {
                oh.a(-87);
                this.q(-96);
                if (param3 > 64) {
                  break L1;
                } else {
                  field_rb = (r) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              bl.a(false, true, (byte) -121);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("jn.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, wn param1, byte param2) {
        wi discarded$2 = null;
        wi discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        qp var5 = null;
        int var6 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.field_pb = true;
              if (!param1.field_g) {
                if (param1.field_f != null) {
                  var4_ref = se.field_B;
                  if (null != this.field_mb) {
                    this.field_mb.a(-1);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param1.field_d;
                  if ((param1.field_e ^ -1) == -249) {
                    if (param0) {
                      var4_ref = nb.field_g;
                      this.field_nb = true;
                      break L1;
                    } else {
                      pc.a(536870912);
                      var4_ref = nb.field_g;
                      this.field_nb = true;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                var4_ref = cb.field_e;
                break L1;
              }
            }
            if (param2 == -71) {
              L2: {
                var5 = new qp((wv) (this), fj.field_b, var4_ref);
                if (param1.field_g) {
                  if (param1.field_c) {
                    this.a((byte) -126, (fd) (new ai((jn) (this))));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    discarded$2 = var5.a(es.field_g, (jv) (this), (byte) 79);
                    break L2;
                  }
                } else {
                  L3: {
                    if (!this.field_nb) {
                      if (param1.field_e != 5) {
                        var5.a((byte) 55, -1, is.field_f);
                        break L3;
                      } else {
                        var5.a((byte) 75, 11, ql.field_d);
                        var5.a((byte) 66, 17, bv.field_o);
                        break L3;
                      }
                    } else {
                      discarded$3 = var5.a(es.field_g, (jv) (this), (byte) 79);
                      break L3;
                    }
                  }
                  if (param1.field_e != 3) {
                    if ((param1.field_e ^ -1) == -7) {
                      var5.a((byte) 114, 9, bv.field_p);
                      break L2;
                    } else {
                      this.a((byte) -122, (fd) (var5));
                      return;
                    }
                  } else {
                    var5.a((byte) 94, 7, ha.field_J);
                    break L2;
                  }
                }
              }
              this.a((byte) -122, (fd) (var5));
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var4);
            stackOut_33_1 = new StringBuilder().append("jn.AB(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L4;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
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

    static {
        field_rb = new r();
    }
}
