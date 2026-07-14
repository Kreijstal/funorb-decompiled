/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa extends ds {
    private int field_k;
    private int field_i;
    private dq field_j;

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = VoidHunters.field_G;
        param1 = param1 & uta.field_q[param2];
        L0: while (true) {
          if (((faa) this).field_k >= param2) {
            L1: {
              if (((faa) this).field_k == param2) {
                ((faa) this).field_e = ((faa) this).field_e + 1;
                ((faa) this).field_h[((faa) this).field_e] = (byte)(((faa) this).field_h[((faa) this).field_e] + param1);
                ((faa) this).field_h[((faa) this).field_e] = (byte) 0;
                ((faa) this).field_k = 8;
                break L1;
              } else {
                ((faa) this).field_k = ((faa) this).field_k - param2;
                ((faa) this).field_h[((faa) this).field_e] = (byte)(((faa) this).field_h[((faa) this).field_e] + (param1 << ((faa) this).field_k));
                break L1;
              }
            }
            if (param0 != -632) {
              ((faa) this).field_k = -63;
              return;
            } else {
              return;
            }
          } else {
            param2 = param2 - ((faa) this).field_k;
            ((faa) this).field_e = ((faa) this).field_e + 1;
            ((faa) this).field_h[((faa) this).field_e] = (byte)(((faa) this).field_h[((faa) this).field_e] + (param1 >>> param2));
            ((faa) this).field_h[((faa) this).field_e] = (byte) 0;
            ((faa) this).field_k = 8;
            continue L0;
          }
        }
    }

    final void f(byte param0) {
        ((faa) this).field_e = (((faa) this).field_i - -7) / 8;
        if (param0 > -31) {
            ((faa) this).field_j = null;
        }
    }

    final int o(int param0) {
        if (param0 != 255) {
          ((faa) this).f((byte) -108);
          ((faa) this).field_e = ((faa) this).field_e + 1;
          return 255 & ((faa) this).field_h[((faa) this).field_e] + -((faa) this).field_j.a((byte) -41);
        } else {
          ((faa) this).field_e = ((faa) this).field_e + 1;
          return 255 & ((faa) this).field_h[((faa) this).field_e] + -((faa) this).field_j.a((byte) -41);
        }
    }

    final static vab a(byte param0, qfa param1, int param2, String param3) {
        if (param0 != 115) {
            return null;
        }
        int var4 = jaggl.OpenGL.glGenProgramARB();
        jaggl.OpenGL.glBindProgramARB(param2, var4);
        jaggl.OpenGL.glProgramStringARB(param2, 34933, param3);
        jaggl.OpenGL.glGetIntegerv(34379, lp.field_b, 0);
        if (!(lp.field_b[0] == -1)) {
            jaggl.OpenGL.glBindProgramARB(param2, 0);
            return null;
        }
        jaggl.OpenGL.glBindProgramARB(param2, 0);
        return new vab(param1, param2, var4);
    }

    final int i(int param0, int param1) {
        int var6 = VoidHunters.field_G;
        int var3 = ((faa) this).field_i >> 535624387;
        int var4 = 8 + -(7 & ((faa) this).field_i);
        int var5 = param0;
        ((faa) this).field_i = ((faa) this).field_i + param1;
        while (var4 < param1) {
            var3++;
            var5 = var5 + ((((faa) this).field_h[var3] & uta.field_q[var4]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((faa) this).field_h[var3] >> -param1 + var4 & uta.field_q[param1]);
        } else {
            var5 = var5 + (((faa) this).field_h[var3] & uta.field_q[var4]);
        }
        return var5;
    }

    faa(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        if (param0 != 24335) {
          ((faa) this).field_j = null;
          ((faa) this).field_e = ((faa) this).field_e + 1;
          ((faa) this).field_h[((faa) this).field_e] = (byte)(param1 + ((faa) this).field_j.a((byte) -41));
          return;
        } else {
          ((faa) this).field_e = ((faa) this).field_e + 1;
          ((faa) this).field_h[((faa) this).field_e] = (byte)(param1 + ((faa) this).field_j.a((byte) -41));
          return;
        }
    }

    faa(int param0) {
        super(param0);
    }

    final void r(int param0) {
        L0: {
          if (-9 < (((faa) this).field_k ^ -1)) {
            ((faa) this).field_e = ((faa) this).field_e + 1;
            ((faa) this).field_k = 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 32712) {
          ((faa) this).field_j = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1) {
        ((faa) this).field_j = new dq(param1);
        if (param0 != 18794) {
            ((faa) this).r(-43);
        }
    }

    final void p(int param0) {
        ((faa) this).field_i = 8 * ((faa) this).field_e;
        if (param0 != -23497) {
            ((faa) this).r(-90);
        }
    }

    final void q(int param0) {
        ((faa) this).field_h[((faa) this).field_e] = (byte) 0;
        if (param0 > -66) {
            return;
        }
        ((faa) this).field_k = 8;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param2 != -50) {
          int discarded$1 = ((faa) this).o(39);
          var5 = 0;
          L0: while (true) {
            if (param0 <= var5) {
              return;
            } else {
              ((faa) this).field_e = ((faa) this).field_e + 1;
              param3[var5 - -param1] = (byte)(((faa) this).field_h[((faa) this).field_e] + -((faa) this).field_j.a((byte) -41));
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (param0 <= var5) {
              return;
            } else {
              ((faa) this).field_e = ((faa) this).field_e + 1;
              param3[var5 - -param1] = (byte)(((faa) this).field_h[((faa) this).field_e] + -((faa) this).field_j.a((byte) -41));
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
