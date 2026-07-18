/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf {
    static String field_a;
    static String field_e;
    private uw field_i;
    static int field_f;
    static java.util.zip.CRC32 field_g;
    static String field_c;
    private vna field_j;
    static int field_d;
    static int[] field_b;
    static String field_h;

    final void b(int param0) {
        ((vf) this).field_j.d(param0 ^ 323);
        if (param0 == 331) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, fia param1, java.awt.Frame param2) {
        naa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: while (true) {
            var3 = param1.a(param2, 18885);
            L1: while (true) {
              if (0 != var3.field_b) {
                if (1 != var3.field_b) {
                  vja.a(0, 100L);
                  continue L0;
                } else {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                }
              } else {
                vja.a(0, 10L);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vf.G(").append(31637).append(',');
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(int param0) {
        Object var2 = null;
        oea var2_ref = null;
        int var3 = 0;
        var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var2_ref = (oea) (Object) ((vf) this).field_j.f(-80);
          L0: while (true) {
            if (var2_ref != null) {
              var2_ref.field_h.f(param0 ^ -4365);
              var2_ref = (oea) (Object) ((vf) this).field_j.e(param0 + 111);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_e = null;
          var2_ref = (oea) (Object) ((vf) this).field_j.f(-80);
          L1: while (true) {
            if (var2_ref != null) {
              var2_ref.field_h.f(param0 ^ -4365);
              var2_ref = (oea) (Object) ((vf) this).field_j.e(param0 + 111);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(iq param0, int param1) {
        oea var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              var3 = (oea) (Object) ((vf) this).field_j.f(-80);
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L2: {
                    if (!var3.field_h.d((byte) 48)) {
                      break L2;
                    } else {
                      var3.p(92);
                      break L2;
                    }
                  }
                  var3 = (oea) (Object) ((vf) this).field_j.e(param1 ^ 124);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vf.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(fo param0, byte param1) {
        try {
            ((vf) this).a((byte) 64, param0);
            int var3_int = -113 % ((36 - param1) / 59);
            ((vf) this).field_j.b((byte) -128, (vg) (Object) new oea(param0));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, fo param1) {
        oea var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (oea) (Object) ((vf) this).field_j.f(-80);
            L1: while (true) {
              if (var3 == null) {
                if (param0 == 64) {
                  break L0;
                } else {
                  field_f = 27;
                  return;
                }
              } else {
                L2: {
                  if (var3.field_h != param1) {
                    break L2;
                  } else {
                    var3.p(28);
                    break L2;
                  }
                }
                var3 = (oea) (Object) ((vf) this).field_j.e(param0 + 43);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vf.A(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void a(boolean param0, iq param1) {
        ev var3 = null;
        RuntimeException var3_ref = null;
        oea var4 = null;
        fo var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = ((vf) this).field_i.a((byte) 59);
              var4 = (oea) (Object) ((vf) this).field_j.f(-80);
              if (!param0) {
                break L1;
              } else {
                var7 = null;
                ((vf) this).a(false, (iq) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L3: {
                  var5 = var4.field_h;
                  if (var3 != null) {
                    var3.a(0, var5, param1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var5.a(125, param1);
                  if (var3 != null) {
                    var3.a(false, var5, param1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4 = (oea) (Object) ((vf) this).field_j.e(124);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("vf.F(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public static void c() {
        field_g = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    vf(uw param0) {
        ((vf) this).field_j = new vna();
        try {
            ((vf) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Updates will sent to the email address you've given";
        field_a = "To Customer Support";
        field_f = -1;
        field_c = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_g = new java.util.zip.CRC32();
        field_h = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_b = new int[1];
    }
}
