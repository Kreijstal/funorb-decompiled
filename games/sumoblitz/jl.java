/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private cr field_b;
    private pv field_d;
    static uw field_a;
    private pv field_c;

    public static void c() {
        field_a = null;
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -19) {
            break L0;
          } else {
            jl.a(0, false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (25 <= oh.field_e) {
              break L2;
            } else {
              if (aa.field_a[0] == null) {
                break L2;
              } else {
                if (!aa.field_a[0].a((byte) 115)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$1 = tw.a(-126, ra.c(2), "resizing", new Object[1]);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (qw.a(57, param1)) {
            return true;
          } else {
            L0: {
              if (param1 == 45) {
                break L0;
              } else {
                if (160 == param1) {
                  break L0;
                } else {
                  if (param1 == 32) {
                    break L0;
                  } else {
                    if (param1 != 95) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        km var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (km) (Object) dk.field_a.b(111);
              if (param1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                iu.a(-1, var4, param0);
                var4 = (km) (Object) dk.field_a.d((byte) 18);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "jl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                  param0.getAppletContext().showDocument(td.a((byte) 125, param0, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("jl.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + false + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (!param2) {
            if (uc.field_c[param0] <= uc.field_c[param1]) {
              if (uc.field_c[param0] >= uc.field_c[param1]) {
                if (lj.field_a[param1] >= lj.field_a[param0]) {
                  if (lj.field_a[param1] <= lj.field_a[param0]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (lj.field_a[param0] <= lj.field_a[param1]) {
              if (lj.field_a[param1] > lj.field_a[param0]) {
                return false;
              } else {
                if (uc.field_c[param1] < uc.field_c[param0]) {
                  return true;
                } else {
                  if (uc.field_c[param0] < uc.field_c[param1]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              return true;
            }
          }
        }
        var4 = vi.field_z[param1] + ic.field_c[param1] + jf.field_f[param1];
        if (param3 == 98) {
          var5 = vi.field_z[param0] + jf.field_f[param0] - -ic.field_c[param0];
          if (var4 >= var5) {
            if (var5 >= var4) {
              L1: {
                if (param0 <= param1) {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L1;
                } else {
                  stackOut_27_0 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  break L1;
                }
              }
              return stackIn_29_0 != 0;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void b(int param0) {
        ((jl) this).field_c.b(12001);
        if (param0 != -19073) {
            boolean discarded$0 = jl.a(121, -85, true, (byte) 9);
        }
    }

    jl(aw param0) {
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              hq discarded$4 = param0.a(new hu[2], (byte) 53);
              ((jl) this).field_c = param0.a((byte) 51, true);
              ((jl) this).field_d = param0.a((byte) 51, false);
              boolean discarded$5 = ((jl) this).field_d.a(12, (byte) -35, 393168);
              ((jl) this).field_b = param0.e(3, false);
              ((jl) this).field_b.a((byte) -116, 49146);
              var7 = ((jl) this).field_b.a(true, 10081);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(true, var7);
                  if (!jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(var5 + 1);
                        var8.a(2 + var5);
                        var8.a(var5 - -2);
                        var8.a(var5 + 3);
                        var8.a(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.b(var5);
                        var8.b(1 + var5);
                        var8.b(var5 - -2);
                        var8.b(2 + var5);
                        var8.b(var5 + 3);
                        var8.b(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.a();
                boolean discarded$6 = ((jl) this).field_b.a(-28833);
                break L1;
              }
            }
            L5: {
              var9 = ((jl) this).field_d.a(7454, true);
              if (var9 == null) {
                break L5;
              } else {
                L6: {
                  var4 = param0.a(true, var9);
                  if (!jaclib.memory.Stream.b()) {
                    var5 = 0;
                    L7: while (true) {
                      if (8191 <= var5) {
                        break L6;
                      } else {
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var5++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if (8191 <= var5) {
                        break L6;
                      } else {
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
                var4.a();
                boolean discarded$7 = ((jl) this).field_d.a(22957);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("jl.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void a(int param0, aw param1) {
        try {
            int var3_int = -4 % ((param0 - 65) / 32);
            boolean discarded$0 = ((jl) this).field_c.a(24, (byte) -35, 786336);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
