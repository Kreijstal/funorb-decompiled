/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends kj {
    private int field_f;
    private eaa field_g;
    static String field_h;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = BachelorFridge.field_y;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    if (param0 == 11713) {
                      var3 = var9 + "settings";
                      var4 = (String) (ac.a(param1, "getcookies", (byte) 64));
                      var5 = fda.a(-1, ';', var4);
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var5[var6].substring(var7 - -1).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (null != nb.field_q) {
                      stackIn_16_0 = nb.field_q;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      return param1.getParameter("settings");
                    }
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("pi.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_1 = 0;
        rea stackIn_15_0;
        rea stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        rea stackIn_16_0;
        rea stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_16_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rea var9;
        int var10;
        var10 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_f - 2;
        this.field_f = this.field_f - 2;
        if (-1 == (fieldTemp$0 ^ -1)) {
          return true;
        } else {
          L0: {
            L1: {
              L2: {
                if (this.field_f > 126) {
                  break L2;
                } else {
                  if (-51 <= (this.field_f ^ -1)) {
                    break L2;
                  } else {
                    var2 = this.field_f;
                    var2 += 16;
                    var3 = 0;
                    L3: while (true) {
                      if ((var3 ^ -1) <= -73) {
                        break L2;
                      } else {
                        var4 = kla.a(this.field_f, this.field_e.field_h.field_w, -2147483648) + -(this.field_f >> 1643832321);
                        stackIn_10_0 = (this.field_f >> 913837122) - Math.abs(var4) / 2;

                        stackIn_10_1 = 0;

                        L4: {


                          if (stackIn_10_1 < kla.a(2, this.field_e.field_h.field_w, -2147483648)) {

                            stackIn_13_1 = 1;
                            break L4;
                          } else {

                            stackIn_13_1 = -1;
                            break L4;
                          }
                        }
                        L5: {
                          var5 = stackIn_10_0 * stackIn_13_1;
                          kla.a(50, this.field_e.field_h.field_w, -2147483648);
                          var6 = 64 + var4;
                          var7 = var5 + 32;
                          var8 = (int)(Math.sin(300.0 * (double)var2) * 100.0) * 0;
                          stackIn_15_0 = null;

                          stackIn_15_1 = null;

                          stackIn_15_2 = var6;

                          stackIn_15_3 = var8;

                          stackIn_15_4 = var7;

                          if (-6 >= (kla.a(20, this.field_e.field_h.field_w, -2147483648) ^ -1)) {
                            stackIn_16_0 = null;
                            stackIn_16_1 = null;
                            stackIn_16_2 = stackIn_15_2;
                            stackIn_16_3 = stackIn_15_3;
                            stackIn_16_4 = stackIn_15_4;
                            stackIn_16_5 = aha.field_A[this.field_e.field_h.field_E][0];
                            break L5;
                          } else {
                            stackIn_16_0 = null;
                            stackIn_16_1 = null;
                            stackIn_16_2 = stackIn_15_2;
                            stackIn_16_3 = stackIn_15_3;
                            stackIn_16_4 = stackIn_15_4;
                            stackIn_16_5 = aha.field_A[this.field_e.field_h.field_E][1];
                            break L5;
                          }
                        }
                        var9 = new rea(stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5);
                        kla.a(3, this.field_e.field_h.field_w, -2147483648);
                        kla.a(5000, this.field_e.field_h.field_w, -2147483648);
                        var9.field_o = (double)(-kla.a(2, this.field_e.field_h.field_w, -2147483648));
                        var9.field_n = -kla.a(10, this.field_e.field_h.field_w, -2147483648) + 25;
                        var9.field_h = -1;
                        this.field_g.a(var9, true);
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              if (param0 >= 21) {
                break L0;
              } else {
                break L1;
              }
            }
            this.field_g = (eaa) null;
            break L0;
          }
          r.a(-126, this.field_f, this.field_e.field_h.field_w, this.field_g);
          return false;
        }
    }

    final static kv[] a(vr param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -8845) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            var4_int = param0.a(param2, false);
            var5 = param0.a((byte) 6, var4_int, param3);
            stackIn_3_0 = uka.a(var5, param1 ^ -8947, param0, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pi.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.b(57);
        }
    }

    pi(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_f = 136;
            this.field_g = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return;
        }
        fv.a(param0, 65280, 10, this.field_g, param2, (byte) -115);
    }

    public static void a(boolean param0) {
        if (param0) {
            field_h = (String) null;
        }
        field_h = null;
    }

    static {
        field_h = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
