/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo implements ntb, ofa, iu {
    int[] field_d;
    static java.security.SecureRandom field_a;
    int field_h;
    int field_f;
    static String field_g;
    int field_b;
    private int field_c;
    static int field_e;

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          var4 = 0;
          if (param0 <= -9) {
            break L0;
          } else {
            boolean discarded$3 = ((jo) this).c(105, -29);
            break L0;
          }
        }
        L1: while (true) {
          if (((jo) this).field_d.length <= var4) {
            return param2;
          } else {
            var5 = ((jo) this).field_d[var4];
            if (param1 != var5) {
              var6 = 0;
              var7_int = 0;
              L2: while (true) {
                L3: {
                  if (var7_int >= param2) {
                    break L3;
                  } else {
                    if (var5 == ada.field_a[var7_int]) {
                      var6 = 1;
                      break L3;
                    } else {
                      var7_int++;
                      continue L2;
                    }
                  }
                }
                if (var6 == 0) {
                  L4: {
                    if (ada.field_a.length != param2) {
                      break L4;
                    } else {
                      var7 = new int[10 + ada.field_a.length];
                      cua.a(ada.field_a, 0, var7, 0, ada.field_a.length);
                      ada.field_a = var7;
                      break L4;
                    }
                  }
                  int incrementValue$4 = param2;
                  param2++;
                  ada.field_a[incrementValue$4] = var5;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
    }

    final boolean c(int param0, int param1) {
        ((jo) this).field_d = wm.a(param0, (byte) 116, ((jo) this).field_d);
        this.a((byte) -119);
        if (null == ((jo) this).field_d) {
            return true;
        }
        if (param1 != 8) {
            return true;
        }
        return false;
    }

    public final void b(faa param0, int param1) {
        try {
            pgb.a(8, null != ((jo) this).field_d ? ((jo) this).field_d.length : 0, 73, param0, ((jo) this).field_d);
            param0.a(-632, ((jo) this).field_h, 8);
            if (param1 > -109) {
                ((jo) this).field_b = -39;
            }
            param0.a(-632, ((jo) this).field_b, 8);
            param0.a(-632, ((jo) this).field_f, 2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(Object param0, boolean param1) {
        jo var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param1) {
              var3 = (jo) param0;
              if (var3.field_h > ((jo) this).field_h) {
                stackOut_19_0 = -1;
                stackIn_20_0 = stackOut_19_0;
                return stackIn_20_0;
              } else {
                if (var3.field_h < ((jo) this).field_h) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  if (((jo) this).field_b >= var3.field_b) {
                    if (var3.field_b >= ((jo) this).field_b) {
                      if (((jo) this).field_f < var3.field_f) {
                        stackOut_15_0 = -1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        if (((jo) this).field_f <= var3.field_f) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        }
                      }
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = -1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = 114;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("jo.I(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        jo var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -19) {
                break L1;
              } else {
                ((jo) this).field_d = null;
                break L1;
              }
            }
            L2: {
              var5 = (jo) (Object) param0;
              var4 = 0;
              if (!ikb.a(((jo) this).field_d, var5.field_d, false)) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int[] ids has changed. ");
                break L2;
              }
            }
            L3: {
              if (((jo) this).field_h != var5.field_h) {
                System.out.println("int gridx has changed. before=" + var5.field_h + ", now=" + ((jo) this).field_h);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((jo) this).field_b != var5.field_b) {
                var4 = 1;
                System.out.println("int gridy has changed. before=" + var5.field_b + ", now=" + ((jo) this).field_b);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var5.field_f == ((jo) this).field_f) {
                break L5;
              } else {
                var4 = 1;
                System.out.println("int type has changed. before=" + var5.field_f + ", now=" + ((jo) this).field_f);
                break L5;
              }
            }
            L6: {
              if (var4 == 0) {
                break L6;
              } else {
                System.out.println("This instance of PartitionZone has changed");
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("jo.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        jo var3 = (jo) (Object) param1;
        if (((jo) this).field_c == var3.field_c) {
            return;
        }
        try {
            var3.field_c = ((jo) this).field_c;
            var3.field_d = dob.a(var3.field_d, (byte) -55, ((jo) this).field_d);
            var3.field_b = ((jo) this).field_b;
            var3.field_h = ((jo) this).field_h;
            if (param0 <= 54) {
                Object var4 = null;
                ((jo) this).b((faa) null, 31);
            }
            var3.field_f = ((jo) this).field_f;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = VoidHunters.field_G;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((jo) this).field_d.length) {
            L1: {
              if (param0 == 11964) {
                break L1;
              } else {
                var5 = null;
                ((jo) this).b((faa) null, 55);
                break L1;
              }
            }
            return;
          } else {
            if (param1 < ((jo) this).field_d[var3]) {
              ((jo) this).field_d[var3] = ((jo) this).field_d[var3] - 1;
              this.a((byte) -82);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                ((jo) this).field_d = null;
            }
            ((jo) this).field_d = wkb.a((byte) 37, ((jo) this).field_d, param0, 8);
            ((jo) this).field_h = uwa.a(8, param0, (byte) 20);
            ((jo) this).field_b = uwa.a(8, param0, (byte) 20);
            ((jo) this).field_f = param0.i(0, 2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jo.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        jo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (jo) (Object) param1;
                var4 = 11 % ((22 - param0) / 59);
                if (wpb.a(var3.field_d, ((jo) this).field_d, (byte) 28)) {
                  break L2;
                } else {
                  if (((jo) this).field_h != var3.field_h) {
                    break L2;
                  } else {
                    if (((jo) this).field_b != var3.field_b) {
                      break L2;
                    } else {
                      if (((jo) this).field_f == var3.field_f) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("jo.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void a(byte param0) {
        if (param0 >= -57) {
            ((jo) this).field_c = -117;
        }
        int fieldTemp$0 = kgb.field_a;
        kgb.field_a = kgb.field_a + 1;
        ((jo) this).field_c = fieldTemp$0;
    }

    final void a(int param0, int param1) {
        if (param1 != -13251) {
            int discarded$0 = ((jo) this).a(-116, 102, -62);
        }
        ((jo) this).field_d = nra.a(true, ((jo) this).field_d, param0, param1 + 42100, true);
        this.a((byte) -77);
    }

    jo() {
        ((jo) this).field_c = 0;
        this.a((byte) -92);
    }

    jo(int param0, int param1, int param2) {
        ((jo) this).field_c = 0;
        this.a((byte) -92);
        ((jo) this).field_f = param2;
        ((jo) this).field_b = param1;
        ((jo) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Blueprint Showdown";
        field_e = 500;
    }
}
