/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private ah field_d;
    private hl field_a;
    static String[] field_b;
    static long field_c;

    final hl a(hl param0, byte param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_d.field_e.field_h;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != this.field_d.field_e) {
              L2: {
                this.field_a = var3.field_h;
                if (param1 < -100) {
                  break L2;
                } else {
                  this.field_a = (hl) null;
                  break L2;
                }
              }
              stackIn_9_0 = (hl) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("tm.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            try {
              L0: {
                L1: {
                  if (param0 == -32312) {
                    break L1;
                  } else {
                    tm.b((byte) 13);
                    break L1;
                  }
                }
                il.field_a = param1;
                try {
                  L2: {
                    L3: {
                      var6 = param2.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (param1.length() != 0) {
                        var5 = var7 + "; Expires=" + cd.a(param0 + 32381, bb.b(-1) - -94608000000L) + "; Max-Age=" + 94608000L;
                        break L3;
                      } else {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    eo.a(param2, -31645, "document.cookie=\"" + var5 + "\"");
                    break L2;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                bb.a(param2, (byte) 49);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("tm.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hl a(int param0) {
        hl var2;
        var2 = this.field_d.field_e.field_a;
        if (param0 == 8115) {
          if (var2 == this.field_d.field_e) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_a;
            return var2;
          }
        } else {
          return (hl) null;
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return !fj.field_o.a(250) ? true : false;
    }

    final hl a(int param0, hl param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -10279) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = this.field_d.field_e.field_a;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (var3 != this.field_d.field_e) {
              this.field_a = var3.field_a;
              stackIn_9_0 = (hl) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("tm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    public static void b(byte param0) {
        int var1 = 15 / ((param0 - 73) / 50);
        field_b = null;
    }

    final hl a(boolean param0) {
        hl var2;
        var2 = this.field_a;
        if (var2 == this.field_d.field_e) {
          this.field_a = null;
          return null;
        } else {
          if (param0) {
            return (hl) null;
          } else {
            this.field_a = var2.field_a;
            return var2;
          }
        }
    }

    final hl a(byte param0) {
        hl var2;
        hl var3;
        if (param0 == -104) {
          var2 = this.field_a;
          if (this.field_d.field_e == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_h;
            return var2;
          }
        } else {
          var3 = (hl) null;
          this.a(-43, (hl) null);
          var2 = this.field_a;
          if (this.field_d.field_e == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_h;
            return var2;
          }
        }
    }

    tm(ah param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final hl c(byte param0) {
        hl var2;
        int var3;
        var3 = -72 % ((param0 - -65) / 49);
        var2 = this.field_d.field_e.field_h;
        if (var2 == this.field_d.field_e) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_h;
          return var2;
        }
    }

    static {
        field_c = 20000000L;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
