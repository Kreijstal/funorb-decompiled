/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterator {
    private le field_e;
    static String field_f;
    static cg field_d;
    private wm field_a;
    private le field_c;
    static String field_h;
    static cg field_g;
    private int field_i;
    static String[] field_b;

    public final void remove() {
        if (this.field_c == null) {
            throw new IllegalStateException();
        }
        this.field_c.b(-27598);
        this.field_c = null;
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        le var1;
        int var2;
        var2 = ZombieDawn.field_J;
        if (this.field_a.field_c[-1 + this.field_i] == this.field_e) {
          L0: while (true) {
            if (this.field_i < this.field_a.field_f) {
              fieldTemp$1 = this.field_i;
              this.field_i = this.field_i + 1;
              var1 = this.field_a.field_c[fieldTemp$1].field_b;
              if (this.field_a.field_c[-1 + this.field_i] != var1) {
                this.field_e = var1.field_b;
                this.field_c = var1;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_e;
          this.field_e = var1.field_b;
          this.field_c = var1;
          return var1;
        }
    }

    private final void a(int param0) {
        this.field_c = null;
        if (param0 != 11936) {
          return;
        } else {
          this.field_e = this.field_a.field_c[0].field_b;
          this.field_i = 1;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                L0: {
                  L1: {
                    var4 = param0.getCodeBase();
                    var3 = rc.a(-1, param0, var4).getFile();
                    qe.a(new Object[]{"home", var3 + "home.ws"}, "updatelinks", 29674, param0);
                    qe.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", param1 ^ 29675, param0);
                    qe.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", 29674, param0);
                    qe.a(new Object[]{"options", var3 + "options.ws"}, "updatelinks", 29674, param0);
                    if (param1 == 1) {
                      break L1;
                    } else {
                      field_h = (String) null;
                      break L1;
                    }
                  }
                  qe.a(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", 29674, param0);
                  qe.a(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", 29674, param0);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("hl.D(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = ZombieDawn.field_J;
            try {
              L0: {
                if (!nm.field_a) {
                  try {
                    L1: {
                      L2: {
                        var2 = "tuhstatbut";
                        var3 = (String) (qe.a(param1, "getcookies", -109));
                        if (param0 < -111) {
                          break L2;
                        } else {
                          field_g = (cg) null;
                          break L2;
                        }
                      }
                      var4 = de.a(';', var3, -125);
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
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
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("hl.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = ZombieDawn.field_J;
        if (this.field_e == this.field_a.field_c[this.field_i - 1]) {
          L0: while (true) {
            if (this.field_a.field_f > this.field_i) {
              fieldTemp$1 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_a.field_c[fieldTemp$1].field_b == this.field_a.field_c[-1 + this.field_i]) {
                this.field_e = this.field_a.field_c[this.field_i + -1];
                continue L0;
              } else {
                this.field_e = this.field_a.field_c[-1 + this.field_i].field_b;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_h = null;
        if (param0 <= 105) {
            return;
        }
        field_b = null;
    }

    hl(wm param0) {
        this.field_c = null;
        try {
            this.field_a = param0;
            this.a(11936);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Names cannot contain consecutive spaces";
        field_h = "Just play";
        field_d = new cg(1, 2, 2, 0);
        field_g = new cg(4, 1, 1, 1);
    }
}
