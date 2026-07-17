/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc extends mf {
    private String field_o;
    static String[] field_k;
    private boolean field_h;
    static boolean field_n;
    static e field_l;
    private lf field_j;
    static String field_m;
    static String field_i;

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 == 2) {
          var4 = 0;
          if (!param3) {
            if (param0) {
              L0: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return hl.field_h[var4];
            } else {
              L1: {
                if (param1) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return hl.field_h[var4];
            }
          } else {
            var4 += 4;
            if (param0) {
              L2: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return hl.field_h[var4];
            } else {
              L3: {
                if (param1) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return hl.field_h[var4];
            }
          }
        } else {
          field_n = false;
          var4 = 0;
          if (param3) {
            var4 += 4;
            if (!param0) {
              L4: {
                if (param1) {
                  var4++;
                  break L4;
                } else {
                  break L4;
                }
              }
              return hl.field_h[var4];
            } else {
              L5: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L5;
                } else {
                  break L5;
                }
              }
              return hl.field_h[var4];
            }
          } else {
            if (param0) {
              L6: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L6;
                } else {
                  break L6;
                }
              }
              return hl.field_h[var4];
            } else {
              L7: {
                if (param1) {
                  var4++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return hl.field_h[var4];
            }
          }
        }
    }

    qc(ul param0, ul param1) {
        super(param0);
        ((qc) this).field_h = false;
        ((qc) this).field_o = "";
        try {
            ((qc) this).field_j = new lf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((qc) this).field_j.a((byte) -60, param0) != fb.field_e) {
              if (((qc) this).a((byte) -95, param0) == fb.field_e) {
                stackOut_5_0 = te.field_d;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    String discarded$2 = qc.a(false, true, -100, true);
                    break L1;
                  }
                }
                stackOut_9_0 = si.field_d;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = ((qc) this).field_j.a(param0, true);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qc.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final fi a(byte param0, String param1) {
        vj var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        fi stackIn_5_0 = null;
        fi stackIn_10_0 = null;
        fi stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_9_0 = null;
        fi stackOut_14_0 = null;
        fi stackOut_13_0 = null;
        fi stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param0 <= -44) {
              if (((qc) this).field_j.a((byte) -112, param1) != fb.field_e) {
                L1: {
                  if (param1.equals((Object) (Object) ((qc) this).field_o)) {
                    break L1;
                  } else {
                    var3 = uc.a(-112, param1);
                    if (!var3.c(17237)) {
                      stackOut_9_0 = qh.field_x;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      ((qc) this).field_o = param1;
                      ((qc) this).field_h = var3.b(8909);
                      break L1;
                    }
                  }
                }
                L2: {
                  if (((qc) this).field_h) {
                    stackOut_14_0 = nn.field_q;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_13_0 = fb.field_e;
                    stackIn_15_0 = stackOut_13_0;
                    break L2;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = fb.field_e;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("qc.C(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    public static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        field_k = null;
        field_i = null;
        field_m = null;
        field_l = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                wm.field_jb = param0;
                try {
                    var6 = param1.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param1.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (param0.length() != 0) {
                        var5 = var7 + "; Expires=" + ha.a(ri.a(-3) + 94608000000L, 13) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    kf.a(param1, true, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                am.a(72, param1);
            } catch (RuntimeException runtimeException) {
                throw sd.a((Throwable) (Object) runtimeException, "qc.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + -1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_n = false;
        field_l = new e(0, 2, 2, 1);
        field_i = "Return to Pause Menu";
    }
}
