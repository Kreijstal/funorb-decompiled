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
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            java.applet.Applet var8 = null;
            int stackIn_3_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
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
                              jn.a(100, (java.applet.Applet) null);
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
                                stackIn_11_0 = 1;
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
                        stackIn_20_0 = 0;
                        break L6;
                      } else {
                        stackIn_20_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref);

                stackIn_23_1 = new StringBuilder().append("jn.BB(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L7;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L7;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_11_0 != 0;
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
        wn var2;
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
        if (this.field_nb) {
            bl.a(false, true, (byte) -121);
            return;
        }
        try {
            oh.a(-87);
            this.q(-96);
            if (param3 <= 64) {
                field_rb = (r) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, wn param1, byte param2) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        qp var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.field_pb = true;
              if (!param1.field_g) {
                if (param1.field_f != null) {
                  var4 = se.field_B;
                  if (null != this.field_mb) {
                    this.field_mb.a(-1);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4 = param1.field_d;
                  if ((param1.field_e ^ -1) == -249) {
                    if (param0) {
                      var4 = nb.field_g;
                      this.field_nb = true;
                      break L1;
                    } else {
                      pc.a(536870912);
                      var4 = nb.field_g;
                      this.field_nb = true;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                var4 = cb.field_e;
                break L1;
              }
            }
            if (param2 == -71) {
              L2: {
                var5 = new qp((wv) (this), fj.field_b, var4);
                if (param1.field_g) {
                  if (param1.field_c) {
                    this.a((byte) -126, (fd) (new ai((jn) (this))));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5.a(es.field_g, (jv) (this), (byte) 79);
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
                      var5.a(es.field_g, (jv) (this), (byte) 79);
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
            var4_ref = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var4_ref);

            stackIn_35_1 = new StringBuilder().append("jn.AB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L4;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
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
