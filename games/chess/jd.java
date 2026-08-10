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
        try {
            vm.a(this.field_f, 11440, param1, 31536000L, "jagex-last-login-method");
            if (param0 != 25799) {
                field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "jd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0) {
          field_i = (int[]) null;
          field_g = null;
          field_e = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static void a(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            int var1_int = 0;
            RuntimeException var1_ref = null;
            IOException var2 = null;
            int var3 = 0;
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
                  if (param0 == -91) {
                    break L3;
                  } else {
                    field_e = (String) null;
                    break L3;
                  }
                }
                L4: {
                  if (kj.field_a == null) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        kj.field_a.a((byte) -87);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (null == hj.field_n) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (hj.field_n.length <= var1_int) {
                        break L7;
                      } else {
                        L9: {
                          if (hj.field_n[var1_int] != null) {
                            try {
                              L10: {
                                hj.field_n[var1_int].a((byte) -87);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw fk.a((Throwable) ((Object) var1_ref), "jd.A(" + param0 + ')');
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
                      if (bi.field_a.b((byte) -40)) {
                        if (param0) {
                          return (String) null;
                        } else {
                          return m.field_c;
                        }
                      } else {
                        return wn.field_g + " - " + bi.field_a.a((byte) -91) + "%";
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
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getDocumentBase().getFile();
                    if (param0 == -117) {
                      L2: {
                        var3 = var2.indexOf('?');
                        var4 = "reload.ws";
                        if (var3 >= 0) {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(rh.a(var5, param1, (byte) -87), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("jd.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 42) {
              stackIn_4_0 = this.field_f.equals(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    jd(String param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 75) {
          field_a = (String) null;
          return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
        } else {
          return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
        }
    }

    static {
        field_e = "This is <%0>'s RuneScape clan if they have one.";
        field_g = "Just play";
        field_h = "Unrated game";
        field_a = "Suggest muting this player";
        field_i = new int[8192];
    }
}
