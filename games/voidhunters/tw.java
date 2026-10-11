/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw implements ntb {
    boa field_a;
    so field_d;
    twa field_e;
    static caa[] field_f;
    int field_b;
    dv field_c;

    public final void a(tv param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tw var5 = null;
        try {
          var5 = (tw) (param0);
          if (this.field_d != null &&
            var5.field_d != null) {
            this.field_d.a(var5.field_d, -52);
          }
          if (this.field_e != null &&
            var5.field_e != null) {
            this.field_e.a(var5.field_e, -93);
          }
          if (null != this.field_c &&
            null != var5.field_c) {
            this.field_c.a(var5.field_c, -60);
          }
          if (this.field_a != null &&
            null != var5.field_a) {
            this.field_a.a(var5.field_a, -68);
          }
          var4 = 0;
          if (this.field_b != var5.field_b) {
            System.out.println("int ordertype has changed. before=" + var5.field_b + ", now=" + this.field_b);
            var4 = 1;
          }
          stackIn_19_0 = (null != var5.field_d) ? 0 : 1;
          if (null != this.field_d) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          if ((stackIn_19_0 ^ stackIn_22_1) != 0 ||
            this.field_d != null &&
            this.field_d.a((byte) -80, var5.field_d)) {
            var4 = 1;
            System.out.println("SettingsChange settings_change has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (param1 >= -19) {
            this.field_b = 9;
          }
          stackIn_32_0 = (null != this.field_e) ? 0 : 1;
          if (var5.field_e != null) {
            stackIn_35_1 = 0;
          } else {
            stackIn_35_1 = 1;
          }
          if ((stackIn_32_0 ^ stackIn_35_1) != 0 ||
            this.field_e != null &&
            this.field_e.a((byte) -64, var5.field_e)) {
            var4 = 1;
            System.out.println("SpawnChoice spawnchoice has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          stackIn_43_0 = (var5.field_c != null) ? 0 : 1;
          if (null != this.field_c) {
            stackIn_46_1 = 0;
          } else {
            stackIn_46_1 = 1;
          }
          if ((stackIn_43_0 ^ stackIn_46_1) != 0 ||
            this.field_c != null &&
            this.field_c.a((byte) -42, var5.field_c)) {
            var4 = 1;
            System.out.println("PlayerVote vote has changed. before=" + var5.field_c + ", now=" + this.field_c);
          }
          stackIn_54_0 = (var5.field_a != null) ? 0 : 1;
          if (this.field_a != null) {
            stackIn_57_1 = 0;
          } else {
            stackIn_57_1 = 1;
          }
          if ((stackIn_54_0 ^ stackIn_57_1) != 0 ||
            null != this.field_a &&
            this.field_a.a((byte) -40, var5.field_a)) {
            System.out.println("ShipBlueprint blueprint has changed. before=" + var5.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpecialOrderSubmessage has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("tw.F(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(fm[] param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        fm var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param0.length;
          if (param1 != 62) {
            tw.a(-111);
          }
          for (var3 = 1; var2_int > var3; var3++) {
            var4 = param0[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (uk.a(param1 ^ -27562, param0[var5], var4)) {
                param0[1 + var5] = param0[var5];
                continue;
              }
              break;
            }
            param0[var5 + 1] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("tw.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        fm[] var5 = null;
        tw var6 = null;
        var4 = VoidHunters.field_G;
        try {
          var6 = (tw) (param1);
          var6.field_b = this.field_b;
          if (null == this.field_d) {
            var6.field_d = null;
          } else {
            if (null == var6.field_d) {
              var6.field_d = new so();
            }
            this.field_d.b((byte) 64, var6.field_d);
          }
          if (null != this.field_e) {
            if (null == var6.field_e) {
              var6.field_e = new twa();
            }
            this.field_e.b((byte) 111, var6.field_e);
          } else {
            var6.field_e = null;
          }
          if (param0 <= 54) {
            var5 = (fm[]) null;
            tw.a((fm[]) null, (byte) -120);
          }
          if (this.field_c != null) {
            if (null == var6.field_c) {
              var6.field_c = new dv();
            }
            this.field_c.b((byte) 88, var6.field_c);
          } else {
            var6.field_c = null;
          }
          if (this.field_a == null) {
            var6.field_a = null;
            return;
          }
          if (var6.field_a == null) {
            var6.field_a = new boa();
          }
          this.field_a.b((byte) 86, var6.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("tw.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public tw() {
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = -65 % ((-23 - param0) / 51);
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        boolean stackIn_43_0 = false;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        tw var4 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = 114 / ((22 - param0) / 59);
          var4 = (tw) (param1);
          if (this.field_b == var4.field_b) {
            stackIn_4_0 = (null != var4.field_d) ? 0 : 1;
            if (null != this.field_d) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.field_d == null ||
              !this.field_d.a((byte) 123, var4.field_d))) {
              stackIn_14_0 = (this.field_e != null) ? 0 : 1;
              if (null != var4.field_e) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.field_e == null ||
                !this.field_e.a((byte) -38, var4.field_e))) {
                stackIn_24_0 = (var4.field_c != null) ? 0 : 1;
                if (this.field_c != null) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if ((stackIn_24_0 ^ stackIn_27_1) == 0 && (this.field_c == null ||
                  !this.field_c.a((byte) 110, var4.field_c))) {
                  stackIn_34_0 = (this.field_a != null) ? 0 : 1;
                  if (null != var4.field_a) {
                    stackIn_37_1 = 0;
                  } else {
                    stackIn_37_1 = 1;
                  }
                  if ((stackIn_34_0 ^ stackIn_37_1) == 0 && (this.field_a == null ||
                    !this.field_a.a((byte) -118, var4.field_a))) {
                    stackIn_43_0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_43_0 = true;
          }
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_46_0 = var3;
          stackIn_46_1 = new StringBuilder().append("tw.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.a(-632, this.field_b, 32);
          if (param1 >= -109) {
            return;
          }
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = 66;
          stackIn_5_2 = (null != this.field_d);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.field_d.b(param0, -110);
          }
          stackIn_10_0 = (faa) (param0);
          stackIn_10_1 = 80;
          stackIn_11_2 = (this.field_e != null);
          if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
            this.field_e.b(param0, -125);
          }
          stackIn_15_0 = (faa) (param0);
          stackIn_15_1 = 117;
          stackIn_16_2 = (this.field_c != null);
          if (vq.a(stackIn_15_0, stackIn_15_1, stackIn_16_2)) {
            this.field_c.b(param0, -126);
          }
          stackIn_20_0 = (faa) (param0);
          stackIn_20_1 = 122;
          stackIn_21_2 = (null != this.field_a);
          if (!vq.a(stackIn_20_0, stackIn_20_1, stackIn_21_2)) {
            return;
          }
          this.field_a.b(param0, -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tw.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    tw(int param0) {
        this.field_b = param0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.field_b = param0.i(0, 32);
          if (kv.a(param1, param0)) {
            if (null == this.field_d) {
              this.field_d = new so();
            }
            this.field_d.a(param0, false);
          } else {
            this.field_d = null;
          }
          if (!kv.a(false, param0)) {
            this.field_e = null;
          } else {
            if (null == this.field_e) {
              this.field_e = new twa();
            }
            this.field_e.a(param0, false);
          }
          if (!kv.a(false, param0)) {
            this.field_c = null;
          } else {
            if (this.field_c != null) {
              this.field_c.a(param0, false);
            } else {
              this.field_c = new dv();
              this.field_c.a(param0, false);
            }
          }
          if (!kv.a(param1, param0)) {
            this.field_a = null;
            return;
          }
          if (null == this.field_a) {
            this.field_a = new boa();
          }
          this.field_a.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tw.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
