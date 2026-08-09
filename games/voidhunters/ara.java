/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ara extends ksa implements ntb {
    int field_f;
    int field_e;
    int field_d;
    static String field_g;
    int field_h;

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            field_g = (String) null;
        }
    }

    final static void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                if (param0 == 27671) {
                  break L0;
                } else {
                  field_g = (String) null;
                  break L0;
                }
              }
              var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    qob.field_b = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_d, 32);
            if (param1 >= -109) {
                this.field_e = 34;
            }
            param0.a(-632, this.field_e, 32);
            this.b(param0, false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ara.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void a(tv param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ara var5 = null;
        try {
          L0: {
            L1: {
              var5 = (ara) ((Object) param0);
              var4 = 0;
              if (var5.field_d != this.field_d) {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_e != this.field_e) {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_e + ", now=" + this.field_e);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_f == var5.field_f) {
                break L3;
              } else {
                System.out.println("int dx has changed. before=" + var5.field_f + ", now=" + this.field_f);
                var4 = 1;
                break L3;
              }
            }
            if (param1 <= -19) {
              L4: {
                if (this.field_h == var5.field_h) {
                  break L4;
                } else {
                  var4 = 1;
                  System.out.println("int dy has changed. before=" + var5.field_h + ", now=" + this.field_h);
                  break L4;
                }
              }
              if (var4 != 0) {
                System.out.println("This instance of MovingObject has changed");
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ara.F(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ara var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -111 / ((22 - param0) / 59);
                var4 = (ara) ((Object) param1);
                if (var4.field_d != this.field_d) {
                  break L2;
                } else {
                  if (this.field_e == var4.field_e) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ara.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public void b(byte param0, tv param1) {
        ara var5 = null;
        ara var6 = null;
        try {
            var5 = (ara) ((Object) param1);
            var6 = var5;
            var6.field_d = this.field_d;
            if (param0 <= 54) {
                this.field_h = 125;
            }
            var6.field_f = this.field_f;
            var6.field_h = this.field_h;
            var6.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ara.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(faa param0, boolean param1) {
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                L2: {
                  stackIn_5_0 = (faa) (param0);

                  stackIn_5_1 = 87;

                  if (this.field_f != 0) {
                    break L2;
                  } else {




                    if (this.field_h == 0) {
                      stackIn_7_0 = (faa) ((Object) stackIn_5_0);
                      stackIn_7_1 = stackIn_5_1;
                      stackIn_7_2 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = (faa) ((Object) stackIn_5_0);

                      break L2;
                    }
                  }
                }
                stackIn_7_0 = (faa) ((Object) stackIn_5_0);
                stackIn_7_1 = stackIn_5_1;
                stackIn_7_2 = 1;
                break L1;
              }
              if (!vq.a(stackIn_7_0, stackIn_7_1, stackIn_7_2 != 0)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param0.a(-632, this.field_f, 32);
                param0.a(-632, this.field_h, 32);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ara.TB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ara() {
    }

    private final void c(faa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 32) {
              if (kv.a(false, param0)) {
                this.field_f = param0.i(param1 + -32, 32);
                this.field_h = param0.i(0, 32);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ara.QB(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public void a(faa param0, boolean param1) {
        try {
            this.field_d = param0.i(0, 32);
            if (param1) {
                field_g = (String) null;
            }
            this.field_e = param0.i(0, 32);
            this.c(param0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ara.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_g = "Sandbox";
    }
}
