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
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -19) {
          if (25 > oh.field_e) {
            if (aa.field_a[0] == null) {
              return false;
            } else {
              L0: {
                if (!aa.field_a[0].a((byte) 115)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          jl.a(0, false);
          if (25 > oh.field_e) {
            if (aa.field_a[0] == null) {
              return false;
            } else {
              L1: {
                if (!aa.field_a[0].a((byte) 115)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Object discarded$2 = null;
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                discarded$2 = tw.a(-126, ra.c(param0 + -23), "resizing", new Object[]{new Integer(param1)});
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param0 == 25) {
              return;
            } else {
              field_a = (uw) null;
              return;
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
            if (param1 != 45) {
              if (160 != param1) {
                if (param1 != 32) {
                  if (param1 != 95) {
                    if (param0 != 110) {
                      field_a = (uw) null;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
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
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
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
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("jl.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        int stackIn_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        if (!param2) {
          if (uc.field_c[param0] <= uc.field_c[param1]) {
            if (uc.field_c[param0] >= uc.field_c[param1]) {
              if (lj.field_a[param1] >= lj.field_a[param0]) {
                if (lj.field_a[param1] <= lj.field_a[param0]) {
                  var4 = vi.field_z[param1] + ic.field_c[param1] + jf.field_f[param1];
                  if (param3 == 98) {
                    var5 = vi.field_z[param0] + jf.field_f[param0] - -ic.field_c[param0];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param0 <= param1) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            break L0;
                          } else {
                            stackOut_36_0 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            break L0;
                          }
                        }
                        return stackIn_38_0 != 0;
                      }
                    } else {
                      return true;
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
                if (uc.field_c[param0] >= uc.field_c[param1]) {
                  var4 = vi.field_z[param1] + ic.field_c[param1] + jf.field_f[param1];
                  if (param3 == 98) {
                    var5 = vi.field_z[param0] + jf.field_f[param0] - -ic.field_c[param0];
                    if (var4 >= var5) {
                      if (var5 >= var4) {
                        if (param0 <= param1) {
                          return false;
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
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final void b(int param0) {
        this.field_c.b(12001);
        if (param0 == -19073) {
            return;
        }
        boolean discarded$0 = jl.a(121, -85, true, (byte) 9);
    }

    jl(aw param0) {
        hq discarded$4 = null;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$4 = param0.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g, ls.field_e}), new hu(ls.field_c)}, (byte) 53);
              this.field_c = param0.a((byte) 51, true);
              this.field_d = param0.a((byte) 51, false);
              discarded$5 = this.field_d.a(12, (byte) -35, 393168);
              this.field_b = param0.e(3, false);
              this.field_b.a((byte) -116, 49146);
              var7 = this.field_b.a(true, 10081);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param0.a(true, var7);
                      if (!jaclib.memory.Stream.b()) {
                        break L4;
                      } else {
                        var4_int = 0;
                        L5: while (true) {
                          L6: {
                            if ((var4_int ^ -1) <= -8192) {
                              break L6;
                            } else {
                              var5 = 4 * var4_int;
                              var8.b(var5);
                              var8.b(1 + var5);
                              var8.b(var5 - -2);
                              var8.b(2 + var5);
                              var8.b(var5 + 3);
                              var8.b(var5);
                              var4_int++;
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4_int = 0;
                    L7: while (true) {
                      if (-8192 >= (var4_int ^ -1)) {
                        break L3;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(var5 + 1);
                        var8.a(2 + var5);
                        var8.a(var5 - -2);
                        var8.a(var5 + 3);
                        var8.a(var5);
                        var4_int++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L7;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var8.a();
                  break L2;
                }
                discarded$6 = this.field_b.a(-28833);
                break L1;
              }
            }
            var9 = this.field_d.a(7454, true);
            if (var9 != null) {
              L8: {
                L9: {
                  L10: {
                    var4 = param0.a(true, var9);
                    if (!jaclib.memory.Stream.b()) {
                      break L10;
                    } else {
                      var5 = 0;
                      L11: while (true) {
                        L12: {
                          if (8191 <= var5) {
                            break L12;
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
                            if (var6 != 0) {
                              break L8;
                            } else {
                              if (var6 == 0) {
                                continue L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (var6 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  L13: while (true) {
                    if (8191 <= var5) {
                      break L9;
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
                      if (var6 != 0) {
                        break L8;
                      } else {
                        if (var6 == 0) {
                          continue L13;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                var4.a();
                break L8;
              }
              discarded$7 = this.field_d.a(22957);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("jl.<init>(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0, aw param1) {
        boolean discarded$0 = false;
        try {
            int var3_int = -4 % ((param0 - 65) / 32);
            discarded$0 = this.field_c.a(24, (byte) -35, 786336);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
