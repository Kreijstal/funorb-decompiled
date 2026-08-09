/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj implements Iterable {
    static ae field_d;
    gb field_e;
    static int field_b;
    static int field_a;
    static volatile long field_c;
    static String field_f;

    final gb a(int param0) {
        gb var2;
        if (param0 == 65) {
          var2 = this.field_e.field_k;
          if (this.field_e == var2) {
            return null;
          } else {
            var2.e(param0 + -65);
            return var2;
          }
        } else {
          this.iterator();
          var2 = this.field_e.field_k;
          if (this.field_e == var2) {
            return null;
          } else {
            var2.e(param0 + -65);
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param1 < -52) {
                      var4 = param0.getCodeBase();
                      var3 = of.a(param0, var4, false).getFile();
                      sj.a(param0, new Object[]{"home", var3 + "home.ws"}, 7648, "updatelinks");
                      sj.a(param0, new Object[]{"gamelist", var3 + "togamelist.ws"}, 7648, "updatelinks");
                      sj.a(param0, new Object[]{"serverlist", var3 + "toserverlist.ws"}, 7648, "updatelinks");
                      sj.a(param0, new Object[]{"options", var3 + "options.ws"}, 7648, "updatelinks");
                      sj.a(param0, new Object[]{"terms", var3 + "terms.ws"}, 7648, "updatelinks");
                      sj.a(param0, new Object[]{"privacy", var3 + "privacy.ws"}, 7648, "updatelinks");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
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
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("rj.D(");

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
              throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rj() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hh((rj) (this)));
    }

    final void a(gb param0, int param1) {
        try {
            if (null != param0.field_j) {
                param0.e(0);
            }
            param0.field_j = this.field_e.field_j;
            param0.field_k = this.field_e;
            param0.field_j.field_k = param0;
            if (param1 != 8466) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                rj.a((java.applet.Applet) null, (byte) -6);
            }
            param0.field_k.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "rj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 59) {
            field_a = -62;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static boolean a(char param0, int param1) {
        if (param1 == 122) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          rj.a((byte) -18);
          if (param0 >= 65) {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        field_c = 0L;
        field_a = 0;
        field_f = "Unpacking levels";
    }
}
