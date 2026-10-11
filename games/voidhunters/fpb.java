/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpb extends mfb {
    static String field_b;
    static String field_c;
    static byte[][] field_d;

    final int k(int param0) {
        if (param0 != 0) {
          this.f((byte) -51);
          return 0;
        }
        return 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
          this.b(true);
        }
        return sbb.field_p;
    }

    final static void a(pgb param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = VoidHunters.field_G;
        try {
          for (var2_int = param1; var2_int < 3; var2_int++) {
            dca.field_q[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < ou.field_q; var2_intLifetime1++) {
            if (param0.field_a == nrb.field_b[var2_intLifetime1].field_a) {
              dupTemp$3 = nrb.field_b[var2_intLifetime1].a(param1 ^ 1);
              dca.field_q[dupTemp$3] = dca.field_q[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(1);
          dca.field_q[dupTemp$0] = dca.field_q[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; ou.field_q > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (nrb.field_b[var3].field_a == param0.field_a) {
              var4 = nrb.field_b[var3].a(1);
              if (dca.field_q[var4] > hab.field_k) {
                dca.field_q[var4] = dca.field_q[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              nrb.field_b[incrementValue$2] = nrb.field_b[var3];
            }
          }
          ou.field_q = var2_intLifetime2;
          fieldTemp$1 = ou.field_q;
          ou.field_q = ou.field_q + 1;
          nrb.field_b[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("fpb.P(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_c = null;
        field_b = null;
        field_d = (byte[][]) null;
        if (param0 <= 21) {
          field_d = (byte[][]) null;
        }
    }

    final int b(int param0) {
        int var2 = -52 / ((param0 - 7) / 47);
        return sib.field_i;
    }

    final static String d(boolean param0) {
        if (!param0) {
          field_d = (byte[][]) null;
        }
        if (dw.field_c == dn.field_r) {
          return mqb.field_x;
        }
        return ht.field_h;
    }

    final int a(boolean param0) {
        if (param0) {
          this.k(-51);
        }
        return 35;
    }

    final int g(byte param0) {
        if (param0 > -12) {
          return 70;
        }
        return aea.field_a;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
          field_d = (byte[][]) null;
        }
        return adb.field_a;
    }

    final int b(boolean param0) {
        if (param0) {
          field_d = (byte[][]) null;
        }
        return fd.field_p;
    }

    fpb() {
    }

    final int f(byte param0) {
        if (param0 < 0) {
          this.d((byte) -39);
        }
        return ujb.field_h;
    }

    final int c(int param0) {
        if (param0 != 0) {
          return 14;
        }
        return qca.field_wb;
    }

    final int g(int param0) {
        if (param0 != 2769) {
          field_c = (String) null;
        }
        return ls.field_p;
    }

    final int a(byte param0) {
        int var2 = 43 / ((param0 + 48) / 43);
        return oq.field_x;
    }

    static {
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Hold the component to deplete the enemy's score";
        field_d = new byte[1000][];
    }
}
