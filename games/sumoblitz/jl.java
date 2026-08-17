/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private cr field_b;
    private pv field_d;
    static uw field_a;
    private pv field_c;

    public static void c(int param0) {
        if (param0 != 786336) {
            field_a = (uw) null;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
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
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1) {
        try {
            try {
                tw.a(-126, ra.c(param0 + -23), "resizing", new Object[]{new Integer(param1)});
            } catch (Throwable throwable) {
            }
            if (param0 != 25) {
                field_a = (uw) null;
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
                      L1: {
                        if (param0 == 110) {
                          break L1;
                        } else {
                          field_a = (uw) null;
                          break L1;
                        }
                      }
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
        int var3 = 0;
        km var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (km) ((Object) dk.field_a.b(111));
              if (param1) {
                break L1;
              } else {
                field_a = (uw) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                iu.a(-1, var4, param0);
                var4 = (km) ((Object) dk.field_a.d((byte) 18));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "jl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    if (!param1) {
                      param0.getAppletContext().showDocument(td.a((byte) 125, param0, var2), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("jl.A(");

                if (param0 == null) {
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
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, boolean param2, byte param3) {
        int var4;
        int var5;
        int stackIn_29_0 = 0;
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
                  stackIn_29_0 = 0;
                  break L1;
                } else {
                  stackIn_29_0 = 1;
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
        this.field_c.b(12001);
        if (param0 != -19073) {
            jl.a(121, -85, true, (byte) 9);
        }
    }

    jl(aw param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4_int = 0;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        try {
          L0: {
            L1: {
              param0.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g, ls.field_e}), new hu(ls.field_c)}, (byte) 53);
              this.field_c = param0.a((byte) 51, true);
              this.field_d = param0.a((byte) 51, false);
              this.field_d.a(12, (byte) -35, 393168);
              this.field_b = param0.e(3, false);
              this.field_b.a((byte) -116, 49146);
              var7 = this.field_b.a(true, 10081);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(true, var7);
                  if (!jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (-8192 >= (var4_int ^ -1)) {
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
                      if ((var4_int ^ -1) <= -8192) {
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
                this.field_b.a(-28833);
                break L1;
              }
            }
            L5: {
              var9 = this.field_d.a(7454, true);
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
                this.field_d.a(22957);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("jl.<init>(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final void a(int param0, aw param1) {
        try {
            int var3_int = -4 % ((param0 - 65) / 32);
            this.field_c.a(24, (byte) -35, 786336);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
