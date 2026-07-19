/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends jl {
    static String field_r;
    private int field_v;
    static String field_s;
    private String[] field_u;
    private int field_q;
    private String[] field_t;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = sh.a((byte) 104, param1, var4).getFile();
                      discarded$6 = sd.a((byte) 119, param1, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
                      discarded$7 = sd.a((byte) 107, param1, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
                      if (param0 == 15) {
                        break L2;
                      } else {
                        gl.b(true);
                        break L2;
                      }
                    }
                    discarded$8 = sd.a((byte) 112, param1, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
                    discarded$9 = sd.a((byte) 110, param1, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
                    discarded$10 = sd.a((byte) 104, param1, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
                    discarded$11 = sd.a((byte) 123, param1, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        if (param0) {
            return;
        }
        field_r = null;
    }

    gl(String param0, String[] param1, String[] param2) {
        super(param0, param1);
        try {
            this.field_u = param1;
            this.field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 15 % ((param0 - -92) / 33);
        int var3 = 640;
        int var4 = this.a(this.field_u, 0);
        int var5 = this.a(this.field_t, 0);
        this.field_o = var4 + var5;
        this.field_d = (-this.field_o + var3) / 2 + var4;
    }

    final static k c(boolean param0) {
        if (!param0) {
            return (k) null;
        }
        if (!(null != vg.field_U)) {
            vg.field_U = new k(ke.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, ke.field_c.field_r, -1, 2147483647, true);
        }
        return vg.field_U;
    }

    final void a(int param0, int param1, int param2, byte param3, ih param4) {
        super.a(0, param4, param2, -101);
        if (param3 != -92) {
            return;
        }
        try {
            this.field_v = param0;
            this.field_q = param1;
            this.d((byte) 38);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String[] param3, int param4) {
        String[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String[] var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_h != null) {
              if (param3 != null) {
                if (0 != param3.length) {
                  L1: {
                    if (param0 == -1) {
                      break L1;
                    } else {
                      gl.b(true);
                      break L1;
                    }
                  }
                  var10 = param3;
                  var6 = var10;
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var10.length) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        var8 = var10[var7];
                        if (var8 == null) {
                          break L3;
                        } else {
                          if ((var8.length() ^ -1) >= -1) {
                            break L3;
                          } else {
                            L4: {
                              if (0 <= param2) {
                                break L4;
                              } else {
                                this.field_h.a(var8, this.field_d, param1, param4, -1);
                                break L4;
                              }
                            }
                            if (0 >= param2) {
                              break L3;
                            } else {
                              this.field_h.b(var8, this.field_d, param1, param4, -1);
                              break L3;
                            }
                          }
                        }
                      }
                      param1 = param1 + this.field_f;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6_ref);
            stackOut_19_1 = new StringBuilder().append("gl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
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
              return;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (!(null != this.field_h)) {
            return;
        }
        if (param1 != 3) {
            gl.b(false);
        }
        int var3 = this.field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + this.b(param0, param1 + 13944);
        this.a(-1, param0, 1, this.field_u, this.field_q);
        this.a(-1, param0, -1, this.field_t, this.field_v);
    }

    static {
        field_r = "Destroy all the alien infrastructure";
        field_s = "Retribution objectives";
    }
}
