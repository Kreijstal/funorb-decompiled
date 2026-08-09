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
        this.field_j.d(param0 ^ 323);
        if (param0 == 331) {
            return;
        }
        field_c = (String) null;
    }

    final static void a(int param0, fia param1, java.awt.Frame param2) {
        naa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param2, 18885);
              L2: while (true) {
                if (0 != var3.field_b) {
                  if (1 != var3.field_b) {
                    vja.a(0, 100L);
                    continue L1;
                  } else {
                    param2.setVisible(false);
                    param2.dispose();
                    if (param0 == 31637) {
                      break L0;
                    } else {
                      field_f = 114;
                      return;
                    }
                  }
                } else {
                  vja.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("vf.G(").append(param0).append(',');

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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0) {
        Object var2;
        oea var2_ref;
        int var3;
        var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var2_ref = (oea) ((Object) this.field_j.f(-80));
          L0: while (true) {
            if (var2_ref != null) {
              var2_ref.field_h.f(param0 ^ -4365);
              var2_ref = (oea) ((Object) this.field_j.e(param0 + 111));
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_e = (String) null;
          var2_ref = (oea) ((Object) this.field_j.f(-80));
          L1: while (true) {
            if (var2_ref != null) {
              var2_ref.field_h.f(param0 ^ -4365);
              var2_ref = (oea) ((Object) this.field_j.e(param0 + 111));
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(iq param0, int param1) {
        oea var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              var3 = (oea) ((Object) this.field_j.f(-80));
              L1: while (true) {
                if (var3 == null) {
                  decompiledRegionSelector0 = 1;
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
                  var3 = (oea) ((Object) this.field_j.e(param1 ^ 124));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("vf.B(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(fo param0, byte param1) {
        try {
            this.a((byte) 64, param0);
            int var3_int = -113 % ((36 - param1) / 59);
            this.field_j.b((byte) -128, new oea(param0));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, fo param1) {
        oea var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (oea) ((Object) this.field_j.f(-80));
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
                var3 = (oea) ((Object) this.field_j.e(param0 + 43));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("vf.A(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(boolean param0, iq param1) {
        ev var3 = null;
        oea var4 = null;
        fo var5 = null;
        int var6 = 0;
        iq var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = this.field_i.a((byte) 59);
              var4 = (oea) ((Object) this.field_j.f(-80));
              if (!param0) {
                break L1;
              } else {
                var7 = (iq) null;
                this.a(false, (iq) null);
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
                var4 = (oea) ((Object) this.field_j.e(124));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("vf.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -53) {
            return;
        }
        field_g = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    vf(uw param0) {
        this.field_j = new vna();
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Updates will sent to the email address you've given";
        field_a = "To Customer Support";
        field_f = -1;
        field_c = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_g = new java.util.zip.CRC32();
        field_h = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_b = new int[1];
    }
}
