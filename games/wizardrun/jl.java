/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jl extends ll {
    static kl field_u;
    static int field_r;
    static int field_s;
    private o[] field_x;
    static o field_w;
    private int field_p;
    private int field_t;
    private int field_q;
    static String field_v;

    final static void b(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            java.applet.Applet var4 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    var4 = (java.applet.Applet) null;
                    jl.a(74, (java.net.URL) null, (java.applet.Applet) null);
                    break L1;
                  }
                }
                L2: {
                  if (null != ii.field_f) {
                    ii.field_f.a((byte) -96);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == ig.field_q) {
                    break L3;
                  } else {
                    ig.field_q.a((byte) 79);
                    break L3;
                  }
                }
                L4: {
                  if (null != ld.field_e) {
                    try {
                      L5: {
                        ld.field_e.a(-1);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (sl.field_o != null) {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= sl.field_o.length) {
                        break L7;
                      } else {
                        if (null != sl.field_o[var1_int]) {
                          try {
                            L9: {
                              sl.field_o[var1_int].a(-1);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw bd.a((Throwable) ((Object) var1), "jl.V(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == pa.field_f) {
                break L1;
              } else {
                if (!pa.field_f.equals(param2.getParameter("settings"))) {
                  var3 = pa.field_f;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == nk.field_M) {
                break L2;
              } else {
                if (!nk.field_M.equals(param2.getParameter("session"))) {
                  var4 = nk.field_M;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 <= -60) {
                break L3;
              } else {
                jl.d(-41);
                break L3;
              }
            }
            stackIn_11_0 = da.a(121, -1, (String) (var4), param1, (String) (var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("jl.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1, int param2, qj param3, qj param4, int param5) {
        try {
            og.field_N = param4;
            if (param0 > -104) {
                java.applet.Applet var7 = (java.applet.Applet) null;
                jl.a(4, (java.net.URL) null, (java.applet.Applet) null);
            }
            e.field_d = param2;
            na.field_e = param1;
            vl.field_h = param5;
            og.field_S = param3;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "jl.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.applet.Applet var9 = null;
        try {
          L0: {
            L1: {
              if (!param2.field_v) {
                if (param2.d((byte) 53)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param3) {
                break L2;
              } else {
                var9 = (java.applet.Applet) null;
                jl.a(83, (java.net.URL) null, (java.applet.Applet) null);
                break L2;
              }
            }
            L3: {
              if (!(param2 instanceof pl)) {
                break L3;
              } else {
                param4 = param4 & ((pl) ((Object) param2)).field_B;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                stackIn_15_0 = this.field_t;
                break L4;
              } else {
                if (var6_int == 0) {
                  stackIn_15_0 = this.field_p;
                  break L4;
                } else {
                  stackIn_15_0 = this.field_q;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (param4) {
                stackIn_18_0 = 16777215;
                break L5;
              } else {
                stackIn_18_0 = 7105644;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            e.a(this.field_x, (param2.field_n + -this.field_x[0].field_s >> 1646345857) + (param2.field_l + param1), var7, (byte) 118, param0 + param2.field_o, param2.field_r);
            this.field_k.a(param2.field_k, param0 + param2.field_o, -2 + param2.field_l + param1, param2.field_r, param2.field_n, var8, -1, 1, 1, this.field_k.field_M);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("jl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static od c(int param0) {
        if (s.field_b == null) {
            s.field_b = new od();
            s.field_b.a(gh.field_b, -120);
            s.field_b.field_e = 7697781;
            s.field_b.field_g = e.field_b;
            s.field_b.field_h = 4;
            s.field_b.field_t = 14;
            s.field_b.field_p = 2763306;
            s.field_b.field_l = 6;
            s.field_b.field_i = 5;
            s.field_b.field_r = 0;
        }
        if (param0 != 4) {
            field_w = (o) null;
        }
        return s.field_b;
    }

    public static void d(int param0) {
        if (param0 != 2763306) {
            field_w = (o) null;
        }
        field_w = null;
        field_u = null;
        field_v = null;
    }

    private jl(int param0, int param1, int param2) {
        this.field_k = va.field_i;
        this.field_t = param2;
        this.field_p = param0;
        this.field_q = param1;
        this.field_x = vf.field_j;
    }

    public jl() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_r = 20;
        field_v = "Account created successfully!";
    }
}
