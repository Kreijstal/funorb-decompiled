/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends ub implements ntb {
    private bhb field_i;
    private mib field_j;

    public final void a(tv param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        af var5 = null;
        try {
          super.a(param0, -43);
          var5 = (af) (param0);
          if (this.field_j != null &&
            var5.field_j != null) {
            this.field_j.a(var5.field_j, -42);
          }
          if (null != this.field_i &&
            var5.field_i != null) {
            this.field_i.a(var5.field_i, true);
          }
          var4 = 0;
          if (param1 >= -19) {
            this.field_j = (mib) null;
          }
          stackIn_11_0 = (null != this.field_j) ? 0 : 1;
          if (var5.field_j != null) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if ((stackIn_11_0 ^ stackIn_14_1) != 0 ||
            null != this.field_j &&
            this.field_j.a((byte) 118, var5.field_j)) {
            System.out.println("Carousel_commongame_Info server_carousel has changed. before=" + var5.field_j + ", now=" + this.field_j);
            var4 = 1;
          }
          stackIn_22_0 = (null != this.field_i) ? 0 : 1;
          if (null != var5.field_i) {
            stackIn_25_1 = 0;
          } else {
            stackIn_25_1 = 1;
          }
          if ((stackIn_22_0 ^ stackIn_25_1) != 0 ||
            this.field_i != null &&
            this.field_i.a((byte) 97, var5.field_i)) {
            var4 = 1;
            System.out.println("CarouselSlotStateDump client_state_dump has changed. before=" + var5.field_i + ", now=" + this.field_i);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of BlackBoxRecording has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("af.F(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final mib a(int param0) {
        if (param0 <= 96) {
          return (mib) null;
        }
        return this.field_j;
    }

    private final void a(byte param0, faa param1) {
        try {
          pu.field_a = osa.field_e;
          int var3_int = -88 % ((12 - param0) / 49);
          osa.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "af.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          this.a(param0, (byte) -122);
          super.a(param0, param1);
          if (!kv.a(false, param0)) {
            this.field_j = null;
          } else {
            if (this.field_j != null) {
              this.field_j.a(param0, param1);
            } else {
              this.field_j = new mib();
              this.field_j.a(param0, param1);
            }
          }
          if (kv.a(param1, param0)) {
            if (this.field_i == null) {
              this.field_i = new bhb();
            }
            this.field_i.a(param0, false);
          } else {
            this.field_i = null;
          }
          this.a(116, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("af.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(faa param0, int param1) {
        try {
          osa.field_e = pu.field_a;
          if (param1 <= 25) {
            this.c(-23);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, faa param1) {
        try {
          osa.field_e = pu.field_a;
          if (param0 != 116) {
            af.a((byte) 124, -116, -59, -4, 46, 82);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "af.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final bhb c(int param0) {
        if (param0 != 116) {
          return (bhb) null;
        }
        return this.field_i;
    }

    public final void b(byte param0, tv param1) {
        af var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        af var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          super.b((byte) 91, param1);
          var5 = (af) (param1);
          var3 = var5;
          if (param0 <= 54) {
            this.c(-43);
          }
          if (this.field_j != null) {
            if (null == var3.field_j) {
              var3.field_j = new mib();
            }
            this.field_j.b((byte) 55, var3.field_j);
          } else {
            var5.field_j = null;
          }
          if (null == this.field_i) {
            var3.field_i = null;
            return;
          }
          if (null == var3.field_i) {
            var3.field_i = new bhb();
          }
          this.field_i.b((byte) 87, var3.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("af.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(faa param0, byte param1) {
        try {
          this.field_j = new mib();
          this.field_j.field_h = true;
          pu.field_a = osa.field_e;
          if (param1 >= -3) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          osa.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "af.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        jt.a(param4, param5, param2, (byte) 51, 116, param1, param3);
        if (param0 != -115) {
          af.a((byte) 25, -61, 61, -7, -52, -26);
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        af var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_23_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = 17 / ((param0 - 22) / 59);
          var4 = (af) (param1);
          if (!super.a((byte) 105, param1)) {
            stackIn_4_0 = (null != this.field_j) ? 0 : 1;
            if (null != var4.field_j) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.field_j == null ||
              !this.field_j.a((byte) -70, var4.field_j))) {
              stackIn_14_0 = (this.field_i != null) ? 0 : 1;
              if (null != var4.field_i) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.field_i == null ||
                !this.field_i.a((byte) -116, var4.field_i))) {
                stackIn_23_0 = false;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_23_0 = true;
          }
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("af.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    af() {
    }

    public final void b(faa param0, int param1) {
        try {
          this.a((byte) -85, param0);
          if (param1 > -109) {
            tv var4 = (tv) null;
            this.a((byte) 94, (tv) null);
          }
          super.b(param0, -116);
          if (vq.a(param0, 110, this.field_j != null ? true : false)) {
            this.field_j.b(param0, -110);
          }
          if (vq.a(param0, -35, this.field_i != null ? true : false)) {
            this.field_i.b(param0, -120);
          }
          this.a(param0, 92);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "af.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
