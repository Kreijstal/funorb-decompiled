/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vpa implements ntb {
    static eab field_b;
    private hkb[] field_a;

    final static boolean a(byte param0) {
        if (param0 >= -41) {
            return false;
        }
        if (null == fwa.field_g) {
            return false;
        }
        if (fwa.field_g.field_e == null) {
            return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static java.applet.Applet b(byte param0) {
        if (!(bkb.field_b == null)) {
            return bkb.field_b;
        }
        if (param0 >= -81) {
            return null;
        }
        return (java.applet.Applet) (Object) tu.field_a;
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        hkb[] var4 = null;
        int var5 = 0;
        hkb[] var6 = null;
        int var7 = 0;
        hkb var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -109) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var3 = param0;
              var4 = ((vpa) this).field_a;
              if (var4 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = var4.length;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_6_0;
              var3.a(-632, var5, 8);
              if (0 == var5) {
                break L3;
              } else {
                var6 = var4;
                var7 = 0;
                L4: while (true) {
                  if (var6.length <= var7) {
                    break L3;
                  } else {
                    L5: {
                      var8 = var6[var7];
                      stackOut_9_0 = (faa) var3;
                      stackOut_9_1 = -88;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var8 == null) {
                        stackOut_11_0 = (faa) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L5;
                      } else {
                        stackOut_10_0 = (faa) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L5;
                      }
                    }
                    L6: {
                      if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                        stb.a(2, 1, var3, (tv) (Object) var8);
                        var7++;
                        break L6;
                      } else {
                        var7++;
                        break L6;
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("vpa.B(");
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
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final hkb a(int param0, boolean param1) {
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = VoidHunters.field_G;
        if (null != ((vpa) this).field_a) {
          var3 = null;
          var4 = 0;
          if (param1) {
            var6 = null;
            ((vpa) this).a((tv) null, -74);
            L0: while (true) {
              if (((vpa) this).field_a.length > var4) {
                if (param0 == ((vpa) this).field_a[var4].a(0)) {
                  return ((vpa) this).field_a[var4];
                } else {
                  if (((vpa) this).field_a[var4].a(0) == 0) {
                    var3 = (Object) (Object) ((vpa) this).field_a[var4];
                    var4++;
                    continue L0;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              } else {
                System.err.println("Mission id " + param0 + ", not found, using sandbox");
                return (hkb) var3;
              }
            }
          } else {
            L1: while (true) {
              if (((vpa) this).field_a.length > var4) {
                if (param0 == ((vpa) this).field_a[var4].a(0)) {
                  return ((vpa) this).field_a[var4];
                } else {
                  if (((vpa) this).field_a[var4].a(0) == 0) {
                    var3 = (Object) (Object) ((vpa) this).field_a[var4];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              } else {
                System.err.println("Mission id " + param0 + ", not found, using sandbox");
                return (hkb) var3;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(tv param0, int param1) {
        vpa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3 = (vpa) (Object) param0;
              boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
              var4 = 0;
              if (dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -5)) {
                var4 = 1;
                System.out.println("Mission[] missions has changed. ");
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 <= -19) {
              if (var4 != 0) {
                System.out.println("This instance of MissionList has changed");
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vpa.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        vpa var3 = (vpa) (Object) param1;
        if (param0 <= 54) {
            return;
        }
        try {
            int discarded$0 = 0;
            var3.field_a = (hkb[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, fi.field_p);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vpa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        vpa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (vpa) (Object) param1;
            var4 = -51 / ((22 - param0) / 59);
            stackOut_0_0 = dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) ((vpa) this).field_a, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("vpa.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            ((vpa) this).field_a = (hkb[]) (Object) kcb.a(8, fi.field_p, param0, 1, -92, (tv[]) (Object) ((vpa) this).field_a);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vpa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
