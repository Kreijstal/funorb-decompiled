/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wc var4_ref_wc = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        ca var8 = null;
        pk var9 = null;
        byte[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 26146) {
              L1: {
                var9 = eh.field_d;
                var2 = var9.c((byte) 34);
                if (var2 == 0) {
                  var8 = (ca) ((Object) qa.field_e.g(0));
                  if (var8 != null) {
                    L2: {
                      var4 = var9.c((byte) 34);
                      if (0 != var4) {
                        var13 = new byte[var4];
                        var9.b(29915, var4, var13, 0);
                        break L2;
                      } else {
                        var5 = null;
                        break L2;
                      }
                    }
                    var9.field_f = var9.field_f + 4;
                    if (var9.h((byte) 20)) {
                      var8.a(false);
                      break L1;
                    } else {
                      jl.a((byte) -121);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    jl.a((byte) -124);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  if (1 == var2) {
                    var3 = var9.a((byte) -101);
                    var4_ref_wc = (wc) ((Object) l.field_g.g(0));
                    L3: while (true) {
                      L4: {
                        if (var4_ref_wc == null) {
                          break L4;
                        } else {
                          if (var3 == var4_ref_wc.field_h) {
                            break L4;
                          } else {
                            var4_ref_wc = (wc) ((Object) l.field_g.d(1));
                            continue L3;
                          }
                        }
                      }
                      if (var4_ref_wc != null) {
                        var4_ref_wc.a(false);
                        break L1;
                      } else {
                        jl.a((byte) -124);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                    jl.a((byte) -120);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "al.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var2 = qi.b(3, param0 ^ 9667);
        if (param0 == 9666) {
          L0: {
            var3 = param1;
            if ((var3 ^ -1) != -5) {
              if (var3 == 3) {
                td.a(-348, fl.field_c[var2 + 13]);
                break L0;
              } else {
                if (-2 != (var3 ^ -1)) {
                  if (-1 != (var3 ^ -1)) {
                    if (var3 == 6) {
                      td.a(-348, fl.field_c[var2 + 4]);
                      break L0;
                    } else {
                      if (5 == var3) {
                        td.a(-348, fl.field_c[16 + var2]);
                        break L0;
                      } else {
                        if (var3 == 2) {
                          td.a(-348, fl.field_c[var2 + 19]);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    td.a(-348, fl.field_c[var2 + 1]);
                    break L0;
                  }
                } else {
                  td.a(-348, fl.field_c[7 - -var2]);
                  break L0;
                }
              }
            } else {
              td.a(-348, fl.field_c[10 + var2]);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var7 = Geoblox.field_C;
            try {
              L0: {
                if (td.field_H) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (wk.a((byte) -6, param1, "getcookies"));
                      var4 = uj.a(';', true, var3);
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          L3: {
                            if (param0 == -109) {
                              break L3;
                            } else {
                              al.a(114, -32);
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackOut_9_0 = 1;
                                stackIn_10_0 = stackOut_9_0;
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
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L6;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var2_ref);
                stackOut_20_1 = new StringBuilder().append("al.A(").append(param0).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(int param0) {
        String discarded$0 = null;
        if (!(tf.field_d != kd.field_b)) {
            return oc.field_a;
        }
        if (tf.field_d == si.field_g) {
            return cg.field_k;
        }
        if (param0 != 0) {
            discarded$0 = al.b(66);
        }
        if (!ih.field_c.a(-91)) {
            return cg.field_k;
        }
        return b.field_a;
    }

    static {
    }
}
