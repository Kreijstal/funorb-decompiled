/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends kj {
    private int field_l;
    private int field_i;
    static long field_k;
    private int field_g;
    private int field_j;
    static String field_h;

    final void a(int param0, int param1, int param2) {
        if (param2 < -101) {
          return;
        }
        ak.a(-126, 108, 95, (byte) 69);
    }

    final static t[] a(int param0, int param1, int param2, byte param3) {
        if (param3 != -124) {
          return (t[]) null;
        }
        return wf.a(param2, param0, 1, param1, (byte) 106);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > 7) {
          return;
        }
        this.field_i = 102;
    }

    ak(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_l = param3;
        this.field_j = param2;
        this.field_i = param0;
        this.field_g = param1;
    }

    final static boolean c(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Torquing.field_u;
        try {
          if (i.field_P.length == po.field_z) {
            po.field_z = -1;
          }
          if (param0 != -85) {
            field_h = (String) null;
          }
          while (true) {
            fieldTemp$2 = po.field_z + 1;
            po.field_z = po.field_z + 1;
            if (fieldTemp$2 < i.field_P.length) {
              if (!i.field_P[po.field_z]) {
                r.field_b[po.field_z] = nn.field_b;
                continue;
              }
              if (po.field_z != 13 &&
                po.field_z != 84 &&
                83 != po.field_z &&
                po.field_z != 81 &&
                po.field_z != 80) {
                if (r.field_b[po.field_z] == un.field_i) {
                  continue;
                }
                r.field_b[po.field_z] = rn.field_e;
              } else {
                if (r.field_b[po.field_z] != nn.field_b) {
                  continue;
                }
                r.field_b[po.field_z] = rn.field_e;
              }
            }
            break;
          }
          stackIn_22_0 = !(po.field_z >= i.field_P.length);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ak.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = this.field_i * param1 >> 12;
        if (param2 == 106) {
          var5 = param1 * this.field_j >> 12;
          var6 = this.field_g * param0 >> 12;
          var7 = this.field_l * param0 >> 12;
          um.a(var4, this.field_c, var6, var5, var7, false);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -1507) {
          ak.a(-101, -57, 63, (byte) -67);
          field_h = null;
          return;
        }
        field_h = null;
    }

    static {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
