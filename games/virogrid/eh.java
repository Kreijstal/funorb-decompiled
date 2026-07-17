/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    boolean field_b;
    private sj field_c;
    private ba field_i;
    static String[] field_j;
    private Object[][] field_f;
    static String field_m;
    static int field_n;
    int field_k;
    static boolean field_e;
    static int field_d;
    static String field_g;
    static String field_h;
    static rm field_l;
    private Object[] field_a;

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((eh) this).c(param2 ^ param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((eh) this).field_c.field_h.b(true, nf.a(6, var6));
              if (!this.a((byte) 94, var4_int)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((eh) this).field_c.field_u[var4_int].b(true, nf.a(6, var7));
                stackOut_8_0 = ((eh) this).a(var4_int, (byte) 125, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("eh.P(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    final int d(byte param0, int param1) {
        if (param0 <= 33) {
            boolean discarded$0 = ((eh) this).a(((byte[]) ((eh) this).field_a[2])[1], (String) ((eh) this).field_a[12]);
        }
        if (!this.a((byte) 101, param1)) {
            return 0;
        }
        return ((eh) this).field_c.field_i[param1];
    }

    final synchronized boolean c(int param0) {
        L0: {
          if (((eh) this).field_c == null) {
            ((eh) this).field_c = ((eh) this).field_i.a((byte) 64);
            if (null == ((eh) this).field_c) {
              return false;
            } else {
              ((eh) this).field_f = new Object[((eh) this).field_c.field_v][];
              ((eh) this).field_a = new Object[((eh) this).field_c.field_v];
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param0 == 0) {
          return true;
        } else {
          boolean discarded$1 = ((eh) this).c((byte) 63, -6);
          return true;
        }
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -102) {
                break L1;
              } else {
                field_j = (String[]) ((eh) this).field_a[0];
                break L1;
              }
            }
            if (((eh) this).c(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((eh) this).field_c.field_h.b(true, nf.a(6, var4));
              stackOut_5_0 = ((eh) this).c((byte) -127, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("eh.BA(").append(param0).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                if (param2 == -25) {
                  L1: {
                    if (pd.field_x.startsWith("win")) {
                      if (ne.a(10448, param0)) {
                        return;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  {
                    L2: {
                      param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var4_ref;
                stackOut_11_1 = new StringBuilder().append("eh.CA(");
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
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(int param0) {
        L0: {
          if (param0 > 11) {
            break L0;
          } else {
            eh.a((String) ((Object[]) ((eh) this).field_a[7])[1], (java.applet.Applet) ((eh) this).field_a[35], (byte) -84, false);
            break L0;
          }
        }
        if (!((eh) this).c(0)) {
          return -1;
        } else {
          return ((eh) this).field_c.field_i.length;
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        Object var4 = null;
        if (!((eh) this).c(0)) {
          return false;
        } else {
          L0: {
            if (param0 > 92) {
              break L0;
            } else {
              var4 = null;
              boolean discarded$1 = ((eh) this).a((byte) -128, (String) null);
              break L0;
            }
          }
          L1: {
            if (param1 < 0) {
              break L1;
            } else {
              if (((eh) this).field_c.field_i.length <= param1) {
                break L1;
              } else {
                if (((eh) this).field_c.field_i[param1] == 0) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
          }
          if (bk.field_a) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final static String d(int param0) {
        int var1 = 0;
        var1 = -42 % ((param0 - -47) / 43);
        if (pa.field_l == ao.field_Kb) {
          return de.field_sb;
        } else {
          if (w.field_I.b(-73)) {
            if (ao.field_Kb != cb.field_c) {
              return pm.field_g;
            } else {
              return w.field_I.a(32);
            }
          } else {
            return w.field_I.a(32);
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        jc var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        jc var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        jc var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int[] var45 = null;
        byte[][] var46 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        int[] var52 = null;
        byte[][] var53 = null;
        byte[] var54 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_88_0 = 0;
        int stackIn_109_0 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_87_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        var22 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 112, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (((eh) this).field_a[param1] != null) {
                L1: {
                  var5_int = ((eh) this).field_c.field_n[param1];
                  var48 = ((eh) this).field_c.field_r[param1];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (null == ((eh) this).field_f[param1]) {
                    ((eh) this).field_f[param1] = new Object[((eh) this).field_c.field_i[param1]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((eh) this).field_f[param1];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10_int = var48[var9_int];
                          break L4;
                        } else {
                          var10_int = var9_int;
                          break L4;
                        }
                      }
                      if (null != var7[var10_int]) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  var10_int = -7 / ((17 - param2) / 44);
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param3[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param3[1]) {
                                break L7;
                              } else {
                                if (0 != param3[2]) {
                                  break L7;
                                } else {
                                  if (param3[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = gi.a(((eh) this).field_a[param1], true, (byte) -128);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new jc(var49);
                          var26.a(var26.field_g.length, param3, 9843, 5);
                          break L5;
                        }
                      }
                      var9_array = gi.a(((eh) this).field_a[param1], false, (byte) -125);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = mc.a(var9_array, 117);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        var44 = var51;
                        var37 = var44;
                        var28 = var37;
                        var10 = var28;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_35_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_35_1 = new StringBuilder();
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (param3 == null) {
                          stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                          stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                          stackOut_38_2 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L9;
                        } else {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 1;
                          stackIn_39_0 = stackOut_36_0;
                          stackIn_39_1 = stackOut_36_1;
                          stackIn_39_2 = stackOut_36_2;
                          break L9;
                        }
                      }
                      throw kg.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param1 + " " + param3.length + " " + na.a(false, param3.length, var9_array) + " " + na.a(false, -2 + param3.length, var9_array) + " " + ((eh) this).field_c.field_m[param1] + " " + ((eh) this).field_c.field_q);
                    }
                    L10: {
                      if (((eh) this).field_b) {
                        ((eh) this).field_a[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 == null) {
                            var11 = 0;
                            break L12;
                          } else {
                            var11 = param3[0];
                            break L12;
                          }
                        }
                        if (((eh) this).field_k == 0) {
                          int discarded$2 = 0;
                          var7[var11] = th.a(-3, var10);
                          break L11;
                        } else {
                          var7[var11] = (Object) (Object) var50;
                          break L11;
                        }
                      } else {
                        if (((eh) this).field_k == 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * (var5_int * var12);
                          var32 = new jc(var51);
                          var14 = 0;
                          var32.field_l = var11;
                          var15 = 0;
                          var16 = 0;
                          L13: while (true) {
                            if (var16 >= var12) {
                              if (var14 == 0) {
                                stackOut_87_0 = 1;
                                stackIn_88_0 = stackOut_87_0;
                                return stackIn_88_0 != 0;
                              } else {
                                var54 = new byte[var14];
                                var14 = 0;
                                var32.field_l = var11;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = (Object) (Object) var54;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L15: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var19 = var19 + var32.d((byte) 96);
                                          if (var6 != null) {
                                            var21 = param3[var20];
                                            break L16;
                                          } else {
                                            var21 = var20;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (param0 != var21) {
                                            break L17;
                                          } else {
                                            ek.a(var51, var17, var54, var14, var19);
                                            var14 = var14 + var19;
                                            break L17;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var17 = var17 + var32.d((byte) 123);
                                    if (null != var6) {
                                      var19 = param3[var18];
                                      break L19;
                                    } else {
                                      var19 = var18;
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (param0 == var19) {
                                      var14 = var14 + var17;
                                      var15 = var19;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var18++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var29 = new jc(var51);
                          var52 = new int[var5_int];
                          var45 = var52;
                          var38 = var45;
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var29.field_l = var11;
                          var15 = 0;
                          L21: while (true) {
                            if (var12 <= var15) {
                              var53 = new byte[var5_int][];
                              var46 = var53;
                              var39 = var46;
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L22: while (true) {
                                if (var5_int <= var16) {
                                  var29.field_l = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L23: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L24: while (true) {
                                        if (var5_int <= var17) {
                                          return true;
                                        } else {
                                          L25: {
                                            if (null != var6) {
                                              var18 = param3[var17];
                                              break L25;
                                            } else {
                                              var18 = var17;
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (((eh) this).field_k == 0) {
                                              int discarded$3 = 0;
                                              var7[var18] = th.a(-3, var53[var17]);
                                              break L26;
                                            } else {
                                              var7[var18] = (Object) (Object) var53[var17];
                                              break L26;
                                            }
                                          }
                                          var17++;
                                          continue L24;
                                        }
                                      }
                                    } else {
                                      L27: {
                                        var18 = 0;
                                        var19 = 0;
                                        if (var5_int <= var19) {
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      var17++;
                                      continue L23;
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16] = new byte[param3[var16]];
                                  param3[var16] = 0;
                                  var16++;
                                  continue L22;
                                }
                              }
                            } else {
                              L28: {
                                var16 = 0;
                                var17 = 0;
                                if (var17 >= var5_int) {
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              var15++;
                              continue L21;
                            }
                          }
                        }
                      }
                    }
                    stackOut_108_0 = 1;
                    stackIn_109_0 = stackOut_108_0;
                    break L0;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  }
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_110_0 = (RuntimeException) var5;
            stackOut_110_1 = new StringBuilder().append("eh.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_113_0 = stackOut_110_0;
            stackIn_113_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param3 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L29;
            } else {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "{...}";
              stackIn_114_0 = stackOut_111_0;
              stackIn_114_1 = stackOut_111_1;
              stackIn_114_2 = stackOut_111_2;
              break L29;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_114_0, stackIn_114_2 + 41);
        }
        return stackIn_109_0 != 0;
    }

    final synchronized int[] e(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        if (this.a((byte) 103, param1)) {
          L0: {
            if (param0 >= 124) {
              break L0;
            } else {
              ((long[]) ((Object[]) ((eh) this).field_a[5])[2])[5] = ((long[]) ((eh) this).field_a[3])[14];
              break L0;
            }
          }
          L1: {
            var3 = ((eh) this).field_c.field_r[param1];
            if (null != var3) {
              break L1;
            } else {
              var6 = new int[((eh) this).field_c.field_n[param1]];
              var3 = var6;
              var4 = 0;
              L2: while (true) {
                if (var4 >= var6.length) {
                  break L1;
                } else {
                  var6[var4] = var4;
                  var4++;
                  continue L2;
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final int a(int param0, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((eh) this).c(0)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == -1) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((eh) this).field_c.field_h.b(true, nf.a(param0 + 7, var4));
                if (this.a((byte) 103, var3_int)) {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = 53;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("eh.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    final int a(int param0, int param1, String param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Object var5 = null;
        CharSequence var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!this.a((byte) 95, param1)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 < -46) {
                  break L1;
                } else {
                  var5 = null;
                  boolean discarded$1 = ((eh) this).a((byte) 121, (String) null);
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param2;
              var4_int = ((eh) this).field_c.field_u[param1].b(true, nf.a(6, var6));
              if (this.b(var4_int, param1, 0)) {
                stackOut_10_0 = var4_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("eh.L(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_11_0;
    }

    final synchronized boolean c(byte param0, int param1) {
        int var3 = 0;
        if (!this.a((byte) 110, param1)) {
          return false;
        } else {
          if (((eh) this).field_a[param1] != null) {
            return true;
          } else {
            var3 = -43 / ((-32 - param0) / 52);
            this.a(-8003, param1);
            if (null != ((eh) this).field_a[param1]) {
              return true;
            } else {
              return false;
            }
          }
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!((eh) this).c(0)) {
          return false;
        } else {
          if (1 == ((eh) this).field_c.field_i.length) {
            return ((eh) this).a(0, (byte) -10, param1);
          } else {
            if (this.a((byte) 105, param1)) {
              if (((eh) this).field_c.field_i[param1] != 1) {
                L0: {
                  if (param0) {
                    break L0;
                  } else {
                    boolean discarded$1 = ((eh) this).a(true, -82);
                    break L0;
                  }
                }
                throw new RuntimeException();
              } else {
                return ((eh) this).a(param1, (byte) 127, 0);
              }
            } else {
              return false;
            }
          }
        }
    }

    private final synchronized void a(int param0, int param1) {
        L0: {
          if (!((eh) this).field_b) {
            int discarded$1 = 0;
            ((eh) this).field_a[param1] = th.a(-3, ((eh) this).field_i.b(param1, 120));
            break L0;
          } else {
            ((eh) this).field_a[param1] = (Object) (Object) ((eh) this).field_i.b(param1, 122);
            break L0;
          }
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((eh) this).c(0)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((eh) this).field_c.field_h.b(true, nf.a(6, var6));
              if (this.a((byte) 97, var4_int)) {
                L1: {
                  if (param1 == 100) {
                    break L1;
                  } else {
                    byte[] discarded$2 = ((eh) this).b(-105, 124);
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param2;
                var5 = ((eh) this).field_c.field_u[var4_int].b(true, nf.a(6, var7));
                stackOut_8_0 = ((eh) this).a(var4_int, var5, 0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("eh.S(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((eh) this).c(0)) {
            return null;
        }
        if (((eh) this).field_c.field_i.length == 1) {
            return ((eh) this).a(0, param0, 0);
        }
        if (!this.a((byte) 124, param0)) {
            return null;
        }
        if (1 == ((eh) this).field_c.field_i[param0]) {
            return ((eh) this).a(param0, 0, param1 ^ 27034);
        }
        if (param1 != 27034) {
            return null;
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 == -2677) {
          if (!((eh) this).c(0)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (~((eh) this).field_a.length >= ~var4) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = 100 * var3 / var2;
                  return var4;
                }
              } else {
                L1: {
                  if (((eh) this).field_c.field_n[var4] > 0) {
                    var2 += 100;
                    var3 = var3 + ((eh) this).b((byte) 106, var4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -66;
        }
    }

    public static void a() {
        field_j = null;
        field_g = null;
        field_m = null;
        field_h = null;
        field_l = null;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((eh) this).c(param0 ^ param0)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((eh) this).field_c.field_c.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((eh) this).field_c.field_c[var3];
              if (((eh) this).field_a[var4] == null) {
                this.a(-8003, var4);
                if (null == ((eh) this).field_a[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final synchronized int b(byte param0, int param1) {
        if (this.a((byte) 119, param1)) {
          if (param0 > 73) {
            if (((eh) this).field_a[param1] != null) {
              return 100;
            } else {
              return ((eh) this).field_i.a(-7, param1);
            }
          } else {
            return -79;
          }
        } else {
          return 0;
        }
    }

    final static ch[] a(int param0, pd param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ch[] var4 = null;
        int var5 = 0;
        ch var6 = null;
        int var7 = 0;
        un var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ch[] stackIn_3_0 = null;
        ch[] stackIn_14_0 = null;
        ch[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch[] stackOut_13_0 = null;
        ch[] stackOut_19_0 = null;
        ch[] stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.b(-121)) {
              var8 = param1.a((byte) -125);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a == 2) {
                    stackOut_13_0 = new ch[]{};
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    var12 = (int[]) var8.field_f;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new ch[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_19_0 = (ch[]) var4;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        var6 = new ch();
                        var4[var5] = var6;
                        var6.field_c = var3[var5 << 2];
                        var6.field_k = var3[1 + (var5 << 2)];
                        var6.field_g = var3[(var5 << 2) + 2];
                        var6.field_d = var3[(var5 << 2) - -3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  mm.a(-27, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new ch[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("eh.AA(").append(105).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_20_0;
    }

    final boolean a(String param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!((eh) this).c(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((eh) this).field_c.field_h.b(param1, nf.a(6, var4));
              if (0 <= var3_int) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("eh.D(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((eh) this).c(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 >= 71) {
                  break L1;
                } else {
                  int discarded$1 = ((eh) this).e(-48);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((eh) this).field_c.field_h.b(true, nf.a(6, var4));
              stackOut_7_0 = ((eh) this).b((byte) 85, var3_int);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("eh.G(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((eh) this).c(0)) {
            return false;
        }
        if (0 <= param1) {
            if (param0 >= 0) {
                if (((eh) this).field_c.field_i.length > param1) {
                    if (param0 < ((eh) this).field_c.field_i[param1]) {
                        return true;
                    }
                }
            }
        }
        if (!bk.field_a) {
            return false;
        }
        throw new IllegalArgumentException(param1 + " " + param0);
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 0) {
            return (byte[]) ((eh) this).field_a[14];
        }
        return this.a(125, param0, (int[]) null, param1);
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_37_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            if (this.b(param3, param1, 0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((eh) this).field_f[param1] == null) {
                    break L2;
                  } else {
                    if (null != ((eh) this).field_f[param1][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param3, param1, 63, param2)) {
                  this.a(-8003, param1);
                  if (this.a(param3, param1, 108, param2)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((eh) this).field_f[param1]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((eh) this).field_f[param1][param3] != null) {
                    var7 = gi.a(((eh) this).field_f[param1][param3], false, (byte) -126);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null != var5) {
                    if (1 != ((eh) this).field_k) {
                      if (2 == ((eh) this).field_k) {
                        ((eh) this).field_f[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      ((eh) this).field_f[param1][param3] = null;
                      if (((eh) this).field_c.field_i[param1] == 1) {
                        ((eh) this).field_f[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_37_0 = var5;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_39_0 = var5;
            stackOut_39_1 = new StringBuilder().append("eh.W(").append(125).append(44).append(param1).append(44);
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_42_0 = stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L5;
            } else {
              stackOut_40_0 = stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_38_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (!this.b(param2, param0, 0)) {
          return false;
        } else {
          L0: {
            if (((eh) this).field_f[param0] == null) {
              break L0;
            } else {
              if (((eh) this).field_f[param0][param2] == null) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (((eh) this).field_a[param0] != null) {
            return true;
          } else {
            this.a(-8003, param0);
            var4 = 119 / ((74 - param1) / 50);
            if (null == ((eh) this).field_a[param0]) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    eh(ba param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((eh) this).field_c = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  L2: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param1) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((eh) this).field_b = stackIn_9_1 != 0;
                  ((eh) this).field_k = param2;
                  ((eh) this).field_i = param0;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("eh.<init>(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "On";
        field_n = 0;
        field_m = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
