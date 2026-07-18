/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd {
    static String field_d;
    static String field_a;
    private String field_f;
    static String field_g;
    static String field_e;
    static ci field_b;
    static String field_h;
    static int[] field_i;
    static rk[] field_c;

    final void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              vm.a(((jd) this).field_f, 11440, param1, 31536000L, "jagex-last-login-method");
              if (param0 == 25799) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jd.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_c = null;
        field_i = null;
    }

    final static void a(byte param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Chess.field_G;
            try {
              L0: {
                L1: {
                  if (qh.field_c != null) {
                    qh.field_c.a((byte) -103);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != ba.field_O) {
                    ba.field_O.a(3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (kj.field_a == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        kj.field_a.a((byte) -87);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null == hj.field_n) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (hj.field_n.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (hj.field_n[var1_int] != null) {
                            {
                              L9: {
                                hj.field_n[var1_int].a((byte) -87);
                                var1_int++;
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            var1_int++;
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw fk.a((Throwable) (Object) var1_ref, "jd.A(" + -91 + ')');
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

    final static String b(boolean param0) {
        if (il.field_a >= 2) {
          if (qa.field_c != null) {
            if (!qa.field_c.c((byte) 122)) {
              return uk.field_a;
            } else {
              return e.field_T;
            }
          } else {
            if (fl.field_m.c((byte) 121)) {
              if (fl.field_m.b("commonui", 100)) {
                if (Chess.field_B.c((byte) 119)) {
                  if (Chess.field_B.b("commonui", 100)) {
                    if (bi.field_a.c((byte) 120)) {
                      if (!bi.field_a.b((byte) -40)) {
                        return wn.field_g + " - " + bi.field_a.a((byte) -91) + "%";
                      } else {
                        return null;
                      }
                    } else {
                      return ld.field_a;
                    }
                  } else {
                    return nc.field_P + " - " + Chess.field_B.c("commonui", 0) + "%";
                  }
                } else {
                  return sn.field_d;
                }
              } else {
                return k.field_V + " - " + fl.field_m.c("commonui", 0) + "%";
              }
            } else {
              return gb.field_o;
            }
          }
        } else {
          return ob.field_z;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                var2 = param1.getDocumentBase().getFile();
                L0: {
                  var3 = var2.indexOf('?');
                  var4 = "reload.ws";
                  if (var3 >= 0) {
                    var4 = var4 + var2.substring(var3);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(rh.a(var5, param1, (byte) -87), "_self");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var2_ref2;
                stackOut_9_1 = new StringBuilder().append("jd.B(").append(-117).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L1;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L1;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 42) {
              stackOut_3_0 = ((jd) this).field_f.equals((Object) (Object) param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jd.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    jd(String param0) {
        try {
            ((jd) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "jd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(byte param0) {
        return kn.a(ec.field_f, re.field_p, 29712);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is <%0>'s RuneScape clan if they have one.";
        field_g = "Just play";
        field_h = "Unrated game";
        field_a = "Suggest muting this player";
        field_i = new int[8192];
    }
}
