/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private im field_c;
    static String field_b;
    private ca field_a;

    final static boolean a(boolean param0) {
        if (param0) {
            km.a(62);
            return null != mg.field_k ? true : wg.field_o;
        }
        return null != mg.field_k ? true : wg.field_o;
    }

    final static void a(int param0) {
        wl.a(uj.b((byte) -120), (byte) 67);
        if (param0 != 16711935) {
            km.a(83);
        }
    }

    final ca b(boolean param0) {
        ca var2 = null;
        var2 = ((km) this).field_a;
        if (((km) this).field_c.field_d != var2) {
          ((km) this).field_a = var2.field_e;
          if (!param0) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((km) this).field_a = null;
          return null;
        }
    }

    final ca b(ca param0, byte param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ca stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = ((km) this).field_c.field_d.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (((km) this).field_c.field_d != var3) {
              ((km) this).field_a = var3.field_c;
              if (param1 <= -114) {
                stackOut_9_0 = (ca) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (ca) (Object) stackIn_8_0;
              }
            } else {
              ((km) this).field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ca) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("km.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(byte param0, int param1) {
        og.field_b = 33;
        og.field_o = 133;
        if (param0 > -18) {
            return;
        }
        og.field_a = 21845;
    }

    final ca a(byte param0) {
        ca var2 = null;
        if (param0 < -69) {
          var2 = ((km) this).field_a;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_c;
            return var2;
          }
        } else {
          ((km) this).field_a = null;
          var2 = ((km) this).field_a;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = param4 + ul.field_f * param3;
              var8 = param2 & 16711935;
              param2 = param2 & 65280;
              var9 = 0;
              if (param1 > 53) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: while (true) {
              if (param6 <= var9) {
                break L0;
              } else {
                var10 = (1 + var9) * (-param5 + param0) / (1 + param6) + param5;
                var11 = ul.field_b[var7_int];
                var12 = 16711935 & var11;
                var11 = var11 & 65280;
                var12 = (var8 * var10 & -16711936) + ((256 - var10) * var12 & -16711936);
                var11 = (16711680 & var10 * param2) - -(16711680 & (-var10 + 256) * var11);
                int incrementValue$1 = var7_int;
                var7_int++;
                ul.field_b[incrementValue$1] = ge.a(var12, var11) >>> 8;
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var7, "km.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == nk.field_q) {
          return;
        } else {
          var1 = (Object) (Object) nk.field_q;
          synchronized (var1) {
            L0: {
              nk.field_q = null;
              break L0;
            }
          }
          return;
        }
    }

    final static void a(long param0, int param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ca d(int param0) {
        ca var2 = null;
        var2 = ((km) this).field_c.field_d.field_e;
        if (param0 == 27935) {
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_e;
            return var2;
          }
        } else {
          ((km) this).field_c = null;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_e;
            return var2;
          }
        }
    }

    public static void e(int param0) {
        field_b = null;
    }

    final ca a(ca param0, byte param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ca stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ca stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((km) this).field_c.field_d.field_e;
                break L1;
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                boolean discarded$2 = km.a(true);
                break L2;
              }
            }
            if (((km) this).field_c.field_d == var3) {
              ((km) this).field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ca) (Object) stackIn_8_0;
            } else {
              ((km) this).field_a = var3.field_e;
              stackOut_9_0 = (ca) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("km.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    km(im param0) {
        try {
            ((km) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ca c(int param0) {
        ca var2 = null;
        var2 = ((km) this).field_c.field_d.field_c;
        if (var2 == ((km) this).field_c.field_d) {
          ((km) this).field_a = null;
          return null;
        } else {
          ((km) this).field_a = var2.field_c;
          if (param0 != -7651) {
            field_b = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
    }
}
