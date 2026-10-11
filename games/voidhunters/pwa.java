/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pwa implements ntb {
    boolean field_c;
    static String field_a;
    gtb field_f;
    gqa field_e;
    hg field_d;
    static int field_b;

    public final void a(tv param0, int param1) {
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pwa var5 = null;
        try {
          var5 = (pwa) (param0);
          if (null != this.field_e &&
            var5.field_e != null) {
            this.field_e.a(var5.field_e, -63);
          }
          if (this.field_d != null &&
            var5.field_d != null) {
            this.field_d.a(var5.field_d, -125);
          }
          if (this.field_f != null &&
            var5.field_f != null) {
            this.field_f.a(var5.field_f, -39);
          }
          var4 = 0;
          stackIn_14_0 = (this.field_e != null) ? 0 : 1;
          if (var5.field_e != null) {
            stackIn_17_1 = 0;
          } else {
            stackIn_17_1 = 1;
          }
          if ((stackIn_14_0 ^ stackIn_17_1) != 0 ||
            null != this.field_e &&
            this.field_e.a((byte) 115, var5.field_e)) {
            iva.a(-6940, "PlayerJoin join has changed. before=" + var5.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          stackIn_25_0 = (this.field_d != null) ? 0 : 1;
          if (var5.field_d != null) {
            stackIn_28_1 = 0;
          } else {
            stackIn_28_1 = 1;
          }
          if ((stackIn_25_0 ^ stackIn_28_1) != 0 ||
            this.field_d != null &&
            this.field_d.a((byte) -51, var5.field_d)) {
            iva.a(-6940, "PlayerLeave leave has changed. before=" + var5.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          stackIn_36_0 = (this.field_f != null) ? 0 : 1;
          if (null != var5.field_f) {
            stackIn_39_1 = 0;
          } else {
            stackIn_39_1 = 1;
          }
          if ((stackIn_36_0 ^ stackIn_39_1) != 0 ||
            this.field_f != null &&
            this.field_f.a((byte) -121, var5.field_f)) {
            var4 = 1;
            iva.a(-6940, "PlayerReady ready has changed. before=" + var5.field_f + ", now=" + this.field_f);
          }
          stackIn_47_0 = (this.field_c) ? 0 : 1;
          if (var5.field_c) {
            stackIn_50_1 = 0;
          } else {
            stackIn_50_1 = 1;
          }
          if (stackIn_47_0 != stackIn_50_1) {
            iva.a(-6940, "boolean event_cancellation has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (var4 != 0) {
            iva.a(-6940, "This instance of CarouselSystemEvent has changed");
          }
          if (param1 <= -19) {
            return;
          }
          this.field_e = (gqa) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_60_0 = var3;
          stackIn_60_1 = new StringBuilder().append("pwa.F(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -81;
          stackIn_3_2 = (this.field_e != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.field_e.b(param0, -119);
          }
          stackIn_7_0 = (faa) (param0);
          stackIn_7_1 = -59;
          stackIn_8_2 = (null != this.field_d);
          if (vq.a(stackIn_7_0, stackIn_7_1, stackIn_8_2)) {
            this.field_d.b(param0, -110);
          }
          stackIn_12_0 = (faa) (param0);
          stackIn_12_1 = -43;
          stackIn_13_2 = (this.field_f != null);
          if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
            this.field_f.b(param0, -115);
          }
          vq.a(param0, -107, this.field_c);
          if (param1 < -109) {
            return;
          }
          this.toString();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("pwa.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -89) {
          field_b = -102;
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        pwa var6 = null;
        pwa var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var6 = (pwa) (param1);
          var7 = var6;
          if (null != this.field_e) {
            if (null == var7.field_e) {
              var7.field_e = new gqa();
            }
            this.field_e.b((byte) 110, var7.field_e);
          } else {
            var6.field_e = null;
          }
          if (this.field_d == null) {
            var7.field_d = null;
          } else {
            if (var7.field_d == null) {
              var7.field_d = new hg();
            }
            this.field_d.b((byte) 65, var7.field_d);
          }
          if (this.field_f == null) {
            var7.field_f = null;
          } else {
            if (null == var7.field_f) {
              var7.field_f = new gtb();
            }
            this.field_f.b((byte) 99, var7.field_f);
          }
          var7.field_c = this.field_c;
          if (param0 > 54) {
            return;
          }
          var5 = (tv) null;
          this.b((byte) 53, (tv) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("pwa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final String toString() {
        return "join=" + this.field_e + ", leave=" + this.field_d + ", ready=" + this.field_f + ", event_cancellation=" + this.field_c;
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_33_1 = 0;
        boolean stackIn_36_0 = false;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pwa var4 = null;
        try {
          var3_int = 105 % ((22 - param0) / 59);
          var4 = (pwa) (param1);
          stackIn_3_0 = (var4.field_e != null) ? 0 : 1;
          if (null != this.field_e) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && (null == this.field_e ||
            !this.field_e.a((byte) 90, var4.field_e))) {
            stackIn_13_0 = (null != var4.field_d) ? 0 : 1;
            if (null != this.field_d) {
              stackIn_16_1 = 0;
            } else {
              stackIn_16_1 = 1;
            }
            if ((stackIn_13_0 ^ stackIn_16_1) == 0 && (null == this.field_d ||
              !this.field_d.a((byte) -57, var4.field_d))) {
              stackIn_23_0 = (this.field_f != null) ? 0 : 1;
              if (null != var4.field_f) {
                stackIn_26_1 = 0;
              } else {
                stackIn_26_1 = 1;
              }
              if ((stackIn_23_0 ^ stackIn_26_1) == 0 && (this.field_f == null ||
                !this.field_f.a((byte) 122, var4.field_f))) {
                stackIn_32_0 = this.field_c;
                if (var4.field_c) {
                  stackIn_33_1 = 0;
                } else {
                  stackIn_33_1 = 1;
                }
                if ((stackIn_32_0 ? 1 : 0) != stackIn_33_1) {
                  stackIn_36_0 = false;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_36_0 = true;
          }
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("pwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (!kv.a(false, param0)) {
            this.field_e = null;
          } else {
            if (null == this.field_e) {
              this.field_e = new gqa();
            }
            this.field_e.a(param0, false);
          }
          if (!kv.a(param1, param0)) {
            this.field_d = null;
          } else {
            if (this.field_d != null) {
              this.field_d.a(param0, param1);
            } else {
              this.field_d = new hg();
              this.field_d.a(param0, param1);
            }
          }
          if (!kv.a(param1, param0)) {
            this.field_f = null;
          } else {
            if (this.field_f != null) {
              this.field_f.a(param0, param1);
            } else {
              this.field_f = new gtb();
              this.field_f.a(param0, param1);
            }
          }
          this.field_c = kv.a(false, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("pwa.H(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Good vs everything";
        field_b = 192;
    }
}
