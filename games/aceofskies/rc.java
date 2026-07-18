/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends hh {
    static ej field_e;
    private si field_f;
    private qe field_g;
    static kc field_d;

    final void b(byte param0) {
        if (param0 <= 5) {
            return;
        }
        ((rc) this).field_f.a(-23085, '');
        ((rc) this).field_a.a(false, 1);
        ((rc) this).field_a.a((rt) null, 1);
        ((rc) this).field_a.a(false, 0);
    }

    rc(wl param0, qe param1) {
        super(param0);
        try {
            ((rc) this).field_g = param1;
            ((rc) this).field_f = new si(param0, 2);
            ((rc) this).field_f.a((byte) 82, 0);
            ((rc) this).field_a.a(false, 1);
            if (((rc) this).field_g.field_d) {
                jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
                jaggl.OpenGL.glEnable(3170);
            }
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            ((rc) this).field_a.a(false, 0);
            ((rc) this).field_f.b(false);
            ((rc) this).field_f.a((byte) -110, 1);
            ((rc) this).field_a.a(false, 1);
            if (((rc) this).field_g.field_d) {
                jaggl.OpenGL.glDisable(3170);
            }
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            ((rc) this).field_a.a(false, 0);
            ((rc) this).field_f.b(false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            ((rc) this).b((byte) 51);
        }
    }

    final void a(int param0, int param1, rt param2) {
        try {
            if (param1 != -1486691000) {
                ((rc) this).field_f = null;
            }
            ((rc) this).field_a.a(param2, 1);
            ((rc) this).field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "rc.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -29304) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static void c(byte param0) {
        int var1 = 0;
        L0: {
          L1: {
            if (ob.field_d == 10) {
              break L1;
            } else {
              if (!ur.b(-125)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          int discarded$2 = 0;
          rl.a();
          ob.field_d = 11;
          break L0;
        }
        var1 = 8 % ((63 - param0) / 57);
        w.field_a = true;
    }

    final boolean a(byte param0) {
        int var2 = -10 / ((-11 - param0) / 63);
        return true;
    }

    final void a(byte param0, int param1, int param2) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float stackIn_3_0 = 0.0f;
        int stackIn_6_0 = 0;
        float stackOut_2_0 = 0.0f;
        float stackOut_1_0 = 0.0f;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var9 = AceOfSkies.field_G ? 1 : 0;
          var4 = -0.0005000000237487257f * (float)(1 + (param1 & 3));
          var5 = (float)(1 + ((param1 & 27) >> 3)) * 0.0005000000237487257f;
          if ((param1 & 64) == 0) {
            stackOut_2_0 = 0.00048828125f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0.0009765625f;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if ((param1 & 128) == 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_6_0;
          ((rc) this).field_a.a(false, 1);
          if (var7 == 0) {
            rn.field_b[2] = var6;
            rn.field_b[0] = 0.0f;
            rn.field_b[1] = 0.0f;
            rn.field_b[3] = 0.0f;
            break L2;
          } else {
            rn.field_b[1] = 0.0f;
            rn.field_b[2] = 0.0f;
            rn.field_b[3] = 0.0f;
            rn.field_b[0] = var6;
            break L2;
          }
        }
        L3: {
          jaggl.OpenGL.glTexGenfv(8192, 9474, rn.field_b, 0);
          rn.field_b[1] = var6;
          rn.field_b[0] = 0.0f;
          rn.field_b[2] = 0.0f;
          rn.field_b[3] = (float)((rc) this).field_a.field_hb * var4 % 1.0f;
          jaggl.OpenGL.glTexGenfv(8193, 9474, rn.field_b, 0);
          if (param0 == -65) {
            break L3;
          } else {
            field_d = null;
            break L3;
          }
        }
        L4: {
          if (!((rc) this).field_g.field_d) {
            var8 = (int)(var5 * (float)((rc) this).field_a.field_hb * 16.0f);
            ((rc) this).field_a.a((rt) (Object) ((rc) this).field_g.field_c[var8 % 16], param0 ^ -66);
            break L4;
          } else {
            rn.field_b[2] = 0.0f;
            rn.field_b[0] = 0.0f;
            rn.field_b[1] = 0.0f;
            rn.field_b[3] = (float)((rc) this).field_a.field_hb * var5 % 1.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, rn.field_b, 0);
            break L4;
          }
        }
        ((rc) this).field_a.a(false, 0);
    }

    final static int b(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -64) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = pt.field_a;
            L2: while (true) {
              if (var3_int >= ne.field_g.length) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  var5 = rn.field_a[var3_int];
                  if (0 <= var5) {
                    var6 = kp.a(true, ne.field_g[var3_int], true);
                    var7 = -(var6 >> 1) + ri.field_a;
                    var4 = var4 + pp.field_a;
                    if (!rl.a((byte) -21, param1, param2, var6 + (ud.field_g << 1), lp.field_h - -(as.field_c << 1), -ud.field_g + var7, var4)) {
                      var4 = var4 + (pp.field_a + (as.field_c << 1) + lp.field_h);
                      break L3;
                    } else {
                      stackOut_8_0 = var5;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  } else {
                    var4 = var4 + ce.field_u;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "rc.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(boolean param0, boolean param1) {
        ((rc) this).field_f.a(-23085, ' ');
        if (((rc) this).field_g.field_d) {
            ((rc) this).field_a.a(false, 1);
            ((rc) this).field_a.a((rt) (Object) ((rc) this).field_g.field_g, 1);
            ((rc) this).field_a.a(false, 0);
        }
        if (param0) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ej(12, 0, 1, 0);
        field_d = new kc();
    }
}
