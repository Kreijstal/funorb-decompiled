/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends ev {
    private int field_j;
    private int field_g;
    private int field_k;
    static lpb field_h;
    static fcb field_i;
    private int field_f;

    final void a(int param0, byte param1, int param2) {
        if (param1 != 110) {
          this.field_k = -72;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          eu.a(true);
          if (qmb.field_q < 10) {
            return false;
          }
          if (ef.field_z >= 13) {
            return true;
          }
          return false;
        }
        if (qmb.field_q < 10) {
          return false;
        }
        if (ef.field_z >= 13) {
          return true;
        }
        return false;
    }

    final static int a(int param0, int param1) {
        if (param1 <= 36) {
          return 103;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return 6144 <= param0 ? -kra.field_a[8192 - param0] : -kra.field_a[param0 - 4096];
        }
        return 2048 > param0 ? kra.field_a[param0] : kra.field_a[-param0 + 4096];
    }

    public static void b(int param0) {
        if (param0 != 30826) {
          field_h = (lpb) null;
          field_i = null;
          field_h = null;
          return;
        }
        field_i = null;
        field_h = null;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -112) {
          this.field_g = 94;
        }
    }

    eu(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_k = param1;
        this.field_f = param3;
        this.field_j = param2;
        this.field_g = param0;
    }

    final static void a(eab param0, byte param1, asb param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          oea.field_p = "";
          tba.field_q = param2;
          nwa.field_c = param0;
          if (fjb.field_b.startsWith("win")) {
            oea.field_p = oea.field_p + "windows/";
          } else {
            if (fjb.field_b.startsWith("linux")) {
              oea.field_p = oea.field_p + "linux/";
            } else {
              if (fjb.field_b.startsWith("mac")) {
                oea.field_p = oea.field_p + "macos/";
              }
            }
          }
          var3_int = -92 % ((param1 - 67) / 49);
          if (nwa.field_c.field_j) {
            oea.field_p = oea.field_p + "msjava/";
            return;
          }
          if (!fjb.field_a.startsWith("amd64") &&
            !fjb.field_a.startsWith("x86_64")) {
            if (!fjb.field_a.startsWith("i386") &&
              !fjb.field_a.startsWith("i486") &&
              !fjb.field_a.startsWith("i586") &&
              !fjb.field_a.startsWith("x86")) {
              if (fjb.field_a.startsWith("ppc")) {
                oea.field_p = oea.field_p + "ppc/";
                return;
              }
              oea.field_p = oea.field_p + "universal/";
              return;
            }
            oea.field_p = oea.field_p + "x86/";
            return;
          }
          oea.field_p = oea.field_p + "x86_64/";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("eu.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * this.field_g >> 12;
        int var5 = this.field_j * param2 >> 12;
        int var6 = param1 * this.field_k >> 12;
        int var7 = param1 * this.field_f >> 12;
        ew.a(var6, var5, (byte) 84, var4, var7, this.field_d);
        int var8 = -73 / ((param0 + 48) / 40);
    }

    static {
    }
}
