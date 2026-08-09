/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bha implements ntb {
    boolean field_a;

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bha var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -73 % ((param0 - 22) / 59);
              var4 = (bha) ((Object) param1);
              if (this.field_a) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (var4.field_a) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_3_0 == stackIn_6_1) {
                stackIn_9_0 = 0;
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("bha.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    void a(boolean param0, tja param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        tja var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var6 = (tja) null;
                this.a(true, (tja) null, -49, 117);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bha.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void a(tv param0, int param1) {
        bha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -19) {
                break L1;
              } else {
                this.field_a = true;
                break L1;
              }
            }
            L2: {
              var3 = (bha) ((Object) param0);
              var4 = 0;
              stackIn_4_0 = this.field_a;

              if (var3.field_a) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L2;
              }
            }
            L3: {
              if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
                var4 = 1;
                iva.a(-6940, "boolean connected has changed. before=" + var3.field_a + ", now=" + this.field_a);
                break L3;
              } else {
                break L3;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              tfb.a((byte) -73, "This instance of CarouselPlayerInfo has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("bha.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public void a(faa param0, boolean param1) {
        try {
            this.field_a = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(tja param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -24354) {
                break L1;
              } else {
                this.field_a = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bha.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void b(faa param0, int param1) {
        try {
            if (param1 > -109) {
                faa var4 = (faa) null;
                this.a((faa) null, true);
            }
            vq.a(param0, -82, this.field_a);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        bha var5 = null;
        bha var6 = null;
        if (param0 <= 54) {
            return;
        }
        try {
            var5 = (bha) ((Object) param1);
            var6 = var5;
            var6.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
