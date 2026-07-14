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
            field_g = null;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 27671) {
                  break L0;
                } else {
                  field_g = null;
                  break L0;
                }
              }
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1_ref != null) {
                try {
                  var2_ref = Runtime.getRuntime();
                  var4 = null;
                  var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                  qob.field_b = 1 + (int)(var3.longValue() / 1048576L);
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public void b(faa param0, int param1) {
        param0.a(-632, ((ara) this).field_d, 32);
        if (param1 >= -109) {
          ((ara) this).field_e = 34;
          param0.a(-632, ((ara) this).field_e, 32);
          this.b(param0, false);
          return;
        } else {
          param0.a(-632, ((ara) this).field_e, 32);
          this.b(param0, false);
          return;
        }
    }

    public void a(tv param0, int param1) {
        int var4 = 0;
        ara var5 = null;
        L0: {
          var5 = (ara) (Object) param0;
          var4 = 0;
          if (var5.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_e != var5.field_e) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var5.field_f == var5.field_f) {
            break L2;
          } else {
            System.out.println("int dx has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            var4 = 1;
            break L2;
          }
        }
        if (param1 > -19) {
          return;
        } else {
          L3: {
            if (var5.field_h == var5.field_h) {
              break L3;
            } else {
              var4 = 1;
              System.out.println("int dy has changed. before=" + var5.field_h + ", now=" + var5.field_h);
              break L3;
            }
          }
          L4: {
            if (var4 != 0) {
              System.out.println("This instance of MovingObject has changed");
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3 = 0;
        ara var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = -111 / ((22 - param0) / 59);
        var4 = (ara) (Object) param1;
        if (var4.field_d == var4.field_d) {
          if (var4.field_e != var4.field_e) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public void b(byte param0, tv param1) {
        ara var5 = null;
        ara var6 = null;
        var5 = (ara) (Object) param1;
        var6 = var5;
        var6.field_d = var5.field_d;
        if (param0 <= 54) {
          ((ara) this).field_h = 125;
          var6.field_f = var5.field_f;
          var6.field_h = var5.field_h;
          var6.field_e = var5.field_e;
          return;
        } else {
          var6.field_f = var5.field_f;
          var6.field_h = var5.field_h;
          var6.field_e = var5.field_e;
          return;
        }
    }

    private final void b(faa param0, boolean param1) {
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        faa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        faa stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        if (!param1) {
          L0: {
            L1: {
              stackOut_2_0 = (faa) param0;
              stackOut_2_1 = 87;
              stackIn_5_0 = stackOut_2_0;
              stackIn_5_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((ara) this).field_f != 0) {
                break L1;
              } else {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackIn_6_0 = stackOut_3_0;
                stackIn_6_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (((ara) this).field_h == 0) {
                  stackOut_6_0 = (faa) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_4_0 = (faa) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                }
              }
            }
            stackOut_5_0 = (faa) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            break L0;
          }
          if (vq.a(stackIn_7_0, stackIn_7_1, stackIn_7_2 != 0)) {
            param0.a(-632, ((ara) this).field_f, 32);
            param0.a(-632, ((ara) this).field_h, 32);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ara() {
    }

    private final void c(faa param0, int param1) {
        if (param1 != 32) {
          return;
        } else {
          L0: {
            if (kv.a(false, param0)) {
              ((ara) this).field_f = param0.i(param1 + -32, 32);
              ((ara) this).field_h = param0.i(0, 32);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public void a(faa param0, boolean param1) {
        ((ara) this).field_d = param0.i(0, 32);
        if (param1) {
          field_g = null;
          ((ara) this).field_e = param0.i(0, 32);
          this.c(param0, 32);
          return;
        } else {
          ((ara) this).field_e = param0.i(0, 32);
          this.c(param0, 32);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Sandbox";
    }
}
