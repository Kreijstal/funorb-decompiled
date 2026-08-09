/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    int field_a;
    int field_h;
    int field_c;
    static uf field_e;
    int field_d;
    int field_b;
    int field_j;
    static volatile boolean field_i;
    static String field_g;
    static String field_f;

    final static void a(int param0) {
        if (param0 < 21) {
            return;
        }
        uh.a((byte) -99);
        jc.a((byte) 100, 4);
    }

    abstract void a(int param0, int param1);

    final static uf a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        uf[] var3 = null;
        int var4 = 0;
        uf var5 = null;
        int var6 = 0;
        uf stackIn_4_0 = null;
        uf stackIn_12_0 = null;
        uf stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var2 = sg.a("jagex-last-login-method", param0, 0);
            if (var2 == null) {
              stackIn_4_0 = ra.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 48) {
                  break L1;
                } else {
                  field_i = true;
                  break L1;
                }
              }
              var3 = p.l((byte) 100);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackIn_15_0 = ra.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.b(var2, 126)) {
                    stackIn_12_0 = (uf) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("jf.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(byte param0, java.applet.Applet param1) {
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
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      if (param0 > 5) {
                        break L2;
                      } else {
                        field_g = (String) null;
                        break L2;
                      }
                    }
                    var3 = jl.a(-101, var4, param1).getFile();
                    cl.a(new Object[]{"home", var3 + "home.ws"}, "updatelinks", 30383, param1);
                    cl.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", 30383, param1);
                    cl.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", 30383, param1);
                    cl.a(new Object[]{"options", var3 + "options.ws"}, "updatelinks", 30383, param1);
                    cl.a(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", 30383, param1);
                    cl.a(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", 30383, param1);
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
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("jf.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            jf.a(-100);
        }
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                kl.a(0, (java.awt.Component) ((Object) param1));
                gj.a((java.awt.Component) ((Object) param1), 98);
                if (vc.field_K == null) {
                  break L1;
                } else {
                  vc.field_K.b((java.awt.Component) ((Object) param1), -1);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("jf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_i = false;
        field_e = new uf("usename");
        field_g = "Waiting for instruments";
    }
}
