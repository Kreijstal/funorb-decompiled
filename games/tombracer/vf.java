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
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
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
                if (param0 == 31637) {
                  return;
                } else {
                  field_f = 114;
                  return;
                }
              }
            } else {
              vja.a(0, 10L);
              continue L1;
            }
          }
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
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == 1) {
          var3 = (oea) (Object) ((vf) this).field_j.f(-80);
          L0: while (true) {
            if (var3 != null) {
              L1: {
                if (!var3.field_h.d((byte) 48)) {
                  break L1;
                } else {
                  var3.p(92);
                  break L1;
                }
              }
              var3 = (oea) (Object) ((vf) this).field_j.e(param1 ^ 124);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(fo param0, byte param1) {
        ((vf) this).a((byte) 64, param0);
        int var3 = -113 % ((36 - param1) / 59);
        ((vf) this).field_j.b((byte) -128, (vg) (Object) new oea(param0));
    }

    final void a(byte param0, fo param1) {
        oea var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (oea) (Object) ((vf) this).field_j.f(-80);
        L0: while (true) {
          if (var3 == null) {
            if (param0 != 64) {
              field_f = 27;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (var3.field_h != param1) {
                break L1;
              } else {
                var3.p(28);
                break L1;
              }
            }
            var3 = (oea) (Object) ((vf) this).field_j.e(param0 + 43);
            continue L0;
          }
        }
    }

    final void a(boolean param0, iq param1) {
        ev var3 = null;
        oea var4 = null;
        int var6 = 0;
        Object var7 = null;
        fo var8 = null;
        fo var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = ((vf) this).field_i.a((byte) 59);
        var4 = (oea) (Object) ((vf) this).field_j.f(-80);
        if (param0) {
          var7 = null;
          ((vf) this).a(false, (iq) null);
          L0: while (true) {
            if (var4 != null) {
              L1: {
                var9 = var4.field_h;
                if (var3 != null) {
                  var3.a(0, var9, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9.a(125, param1);
                if (var3 != null) {
                  var3.a(false, var9, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              var4 = (oea) (Object) ((vf) this).field_j.e(124);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L3: while (true) {
            if (var4 != null) {
              L4: {
                var8 = var4.field_h;
                if (var3 != null) {
                  var3.a(0, var8, param1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var8.a(125, param1);
                if (var3 != null) {
                  var3.a(false, var8, param1);
                  break L5;
                } else {
                  break L5;
                }
              }
              var4 = (oea) (Object) ((vf) this).field_j.e(124);
              continue L3;
            } else {
              return;
            }
          }
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
        ((vf) this).field_j = new vna();
        ((vf) this).field_i = param0;
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
