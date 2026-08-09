/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends r {
    static String field_p;
    private tl field_n;
    static int field_o;
    private boolean field_r;
    private String field_s;
    static String field_q;

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_n.a(160, param1) != ml.field_K) {
              var3_int = 21 % ((param0 - 24) / 46);
              if (this.a(160, param1) != ml.field_K) {
                stackIn_7_0 = ha.field_j;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = aj.field_r;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_n.a((byte) -27, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ck.A(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 != 2) {
            ck.c((byte) 106);
        }
    }

    ck(c param0, c param1) {
        super(param0);
        this.field_r = false;
        this.field_s = "";
        try {
            this.field_n = new tl(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wd a(int param0, String param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_n.a((int) (char)param0, param1) != ml.field_K) {
              L1: {
                if (!param1.equals(this.field_s)) {
                  var3 = aj.a(param1, -1);
                  if (var3.a(param0 + -282)) {
                    this.field_s = param1;
                    this.field_r = var3.b(param0 ^ 28033);
                    break L1;
                  } else {
                    stackIn_7_0 = w.field_e;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_r) {
                  stackIn_12_0 = hm.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = ml.field_K;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = ml.field_K;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ck.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            RuntimeException var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_11_0 = null;
            Object stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            StringBuilder stackIn_22_1 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref2 = null;
            var7 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (eb.a("getcookies", param2, -250));
                      var4 = m.a(';', 121, var3);
                      if (param0 == -5174) {
                        break L2;
                      } else {
                        ck.c((byte) 90);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var4.length) {
                          break L4;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          if (var7 == 0) {
                            L5: {
                              if (0 > var6) {
                                break L5;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(param1)) {
                                  stackIn_11_0 = var4[var5].substring(1 + var6).trim();
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_16_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var3_ref);

                stackIn_19_1 = new StringBuilder().append("ck.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              L8: {


                stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

                if (param2 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L8;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L8;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_16_0);
            } else {
              return stackIn_11_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_q = "Email: ";
        field_p = "Accept";
    }
}
