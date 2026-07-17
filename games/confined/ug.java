/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends oe {
    private int field_Y;
    private int field_eb;
    private int field_fb;
    static String field_bb;
    static String field_Z;
    private int field_ab;
    private int field_db;
    static String field_cb;
    private int field_gb;

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -6) {
            ((ug) this).field_db = 103;
        }
        if (((ug) this).field_ab <= 0) {
        } else {
            var2 = ((ug) this).field_fb;
            var3 = ((ug) this).field_Y;
            int fieldTemp$0 = ((ug) this).field_eb + 1;
            ((ug) this).field_eb = ((ug) this).field_eb + 1;
            if (fieldTemp$0 >= ((ug) this).field_ab) {
                ((ug) this).field_ab = 0;
                ((ug) this).g((byte) -82);
            } else {
                var4 = (-((ug) this).field_eb + 2 * ((ug) this).field_ab) * ((ug) this).field_eb;
                var5 = ((ug) this).field_ab * ((ug) this).field_ab;
                var3 = var4 * (((ug) this).field_Y - ((ug) this).field_db) / var5 + ((ug) this).field_db;
                var2 = ((ug) this).field_gb - -((-((ug) this).field_gb + ((ug) this).field_fb) * var4 / var5);
            }
            ((ug) this).a(param0 ^ 75, var3, var2);
        }
        return super.l(-6);
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 194) {
                break L1;
              } else {
                ug.a((byte) 35);
                break L1;
              }
            }
            var2_int = param0.length;
            var3 = new byte[var2_int];
            lj.a(param0, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ug.NA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    boolean j(int param0) {
        ((ug) this).m(71);
        return super.j(-104);
    }

    ug(sh param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ug) this).field_eb = 0;
        ((ug) this).field_ab = 0;
    }

    void m(int param0) {
        if (!(((ug) this).field_ab > 0)) {
            return;
        }
        ((ug) this).a(-34, ((ug) this).field_Y, ((ug) this).field_fb);
        ((ug) this).field_ab = 0;
        ((ug) this).g((byte) -9);
        if (param0 <= 53) {
            ug.a((byte) -18);
        }
    }

    public static void a(byte param0) {
        int var1 = 31 / ((param0 - -9) / 37);
        field_bb = null;
        field_Z = null;
        field_cb = null;
    }

    void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        L0: {
          var16 = Confined.field_J ? 1 : 0;
          fn.c(param0 + 6, 35 + param2, ((ug) this).field_F + -12, -40 + ((ug) this).field_z, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param2;
          if (param1 <= -58) {
            break L0;
          } else {
            var17 = null;
            byte[] discarded$1 = ug.a((byte[]) null, 12);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = param2 - -35;
            L2: while (true) {
              if (var7 >= var4) {
                rh.field_Z.d(-90 + param0 + ((ug) this).field_F, param2 + 10);
                nl.a(109, param0 - -5, wc.field_nc, ((ug) this).field_F + -10, 35 + param2);
                nl.a(124, param0, fi.field_d, ((ug) this).field_F, -22 + ((ug) this).field_z + param2);
                var5 = 169;
                var6 = 127;
                var4 = ((ug) this).field_z + -79;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    fn.b(param0, var8, 6, var9);
                    fn.b(param0 + ((ug) this).field_F - 6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << 16 | var9 << 8);
                fn.b(param0, var8, 6, var9);
                fn.b(((ug) this).field_F + (param0 + -6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= fn.field_b) {
              if (var8 < fn.field_j) {
                L4: {
                  var9 = var5 - -((-var5 + var6) * var7 / var4);
                  var10 = 0;
                  var11 = ((ug) this).field_F;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (20 - var7);
                        if (462 >= var12) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 16 | var13 << 8);
                            fn.field_h[var10 + (fn.field_g * var8 + param0)] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (20 - var7) * (-var7 + 20);
                          if (462 < var14) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              fn.field_h[param0 + (var8 * fn.field_g - -var11)] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 8 | var9 << 16);
                fn.b(var10 - -param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L1;
              } else {
                var7++;
                var8++;
                continue L1;
              }
            } else {
              var7++;
              var8++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
            ((ug) this).a(-109, param0, param3);
            return;
        }
        ((ug) this).field_eb = 0;
        ((ug) this).field_fb = param3;
        if (param2 != 6) {
            ((ug) this).field_gb = 125;
        }
        ((ug) this).field_gb = ((ug) this).field_F;
        ((ug) this).field_Y = param0;
        ((ug) this).field_db = ((ug) this).field_z;
        ((ug) this).field_ab = param1;
    }

    void g(byte param0) {
        if (param0 >= -6) {
            ug.a((byte) -68);
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        ig var3 = null;
        RuntimeException var3_ref = null;
        ig stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_5_0 = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_8_0 = null;
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
            if (param2 != null) {
              if (param2.length > 136) {
                var3 = new ig();
                ((qf) (Object) var3).a((byte) 49, param2);
                stackOut_5_0 = (ig) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                if (param0 >= 124) {
                  if (!param1) {
                    stackOut_13_0 = (byte[]) param2;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_11_0 = ug.a(param2, 194);
                    stackIn_12_0 = stackOut_11_0;
                    return (Object) (Object) stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ug.KA(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return (Object) (Object) stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Loading music";
        field_Z = "<col=FFFFFF>Lives:</col> if you die, you can carry on as long as you have at least one of these left.";
        field_cb = "Just play";
    }
}
