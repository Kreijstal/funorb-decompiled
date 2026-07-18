/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
              var4_int = ((eh) this).field_c.field_h.b(true, nf.a(6, (CharSequence) (Object) param0));
              if (!this.a((byte) 94, var4_int)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var5 = ((eh) this).field_c.field_u[var4_int].b(true, nf.a(6, (CharSequence) (Object) param1));
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final int d(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 33) {
                break L1;
              } else {
                boolean discarded$2 = ((eh) this).a(((byte[]) ((eh) this).field_a[2])[1], (String) ((eh) this).field_a[12]);
                break L1;
              }
            }
            if (this.a((byte) 101, param1)) {
              stackOut_6_0 = ((eh) this).field_c.field_i[param1];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.EA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (((eh) this).field_c == null) {
                ((eh) this).field_c = ((eh) this).field_i.a((byte) 64);
                if (null == ((eh) this).field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((eh) this).field_f = new Object[((eh) this).field_c.field_v][];
                  ((eh) this).field_a = new Object[((eh) this).field_c.field_v];
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                boolean discarded$2 = ((eh) this).c((byte) 63, -6);
                break L2;
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "eh.E(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              var3_int = ((eh) this).field_c.field_h.b(true, nf.a(6, (CharSequence) (Object) param1));
              stackOut_6_0 = ((eh) this).c((byte) -127, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("eh.BA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
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
                stackOut_13_0 = (RuntimeException) var4_ref;
                stackOut_13_1 = new StringBuilder().append("eh.CA(");
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L4;
                }
              }
              L5: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                stackIn_20_0 = stackOut_17_0;
                stackIn_20_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L5;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  break L5;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 11) {
                break L1;
              } else {
                eh.a((String) ((Object[]) ((eh) this).field_a[7])[1], (java.applet.Applet) ((eh) this).field_a[35], (byte) -84, false);
                break L1;
              }
            }
            if (!((eh) this).c(0)) {
              stackOut_6_0 = -1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((eh) this).field_c.field_i.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "eh.N(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (!((eh) this).c(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 > 92) {
                  break L1;
                } else {
                  boolean discarded$2 = ((eh) this).a((byte) -128, (String) null);
                  break L1;
                }
              }
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (((eh) this).field_c.field_i.length <= param1) {
                    break L2;
                  } else {
                    if (((eh) this).field_c.field_i[param1] == 0) {
                      break L2;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    }
                  }
                }
              }
              if (bk.field_a) {
                throw new IllegalArgumentException(Integer.toString(param1));
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final static String d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_9_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            var1_int = -42 % ((param0 - -47) / 43);
            if (pa.field_l == ao.field_Kb) {
              stackOut_3_0 = de.field_sb;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (w.field_I.b(-73)) {
                if (ao.field_Kb != cb.field_c) {
                  stackOut_11_0 = pm.field_g;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = w.field_I.a(32);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = w.field_I.a(32);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "eh.I(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        jc var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        jc var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_156_0 = 0;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        String stackIn_161_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_58_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        RuntimeException stackOut_158_0 = null;
        StringBuilder stackOut_158_1 = null;
        String stackOut_158_2 = null;
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
                  var6 = ((eh) this).field_c.field_r[param1];
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
                    if (~var5_int >= ~var9_int) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (var6 != null) {
                            break L5;
                          } else {
                            var10_int = var9_int;
                            if (var22 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var10_int = var6[var9_int];
                        break L4;
                      }
                      L6: {
                        if (null != var7[var10_int]) {
                          break L6;
                        } else {
                          var8 = 0;
                          if (var22 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9_int++;
                      if (var22 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var10_int = -7 / ((17 - param2) / 44);
                  if (var8 == 0) {
                    L7: {
                      L8: {
                        if (param3 == null) {
                          break L8;
                        } else {
                          L9: {
                            if (param3[0] != 0) {
                              break L9;
                            } else {
                              if (0 != param3[1]) {
                                break L9;
                              } else {
                                if (0 != param3[2]) {
                                  break L9;
                                } else {
                                  if (param3[3] != 0) {
                                    break L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = gi.a(((eh) this).field_a[param1], true, (byte) -128);
                          var10_ref = new jc(var9_array);
                          var10_ref.a(var10_ref.field_g.length, param3, 9843, 5);
                          break L7;
                        }
                      }
                      var9_array = gi.a(((eh) this).field_a[param1], false, (byte) -125);
                      break L7;
                    }
                    try {
                      L10: {
                        var10 = mc.a(var9_array, 117);
                        break L10;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_43_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_43_1 = new StringBuilder();
                        stackIn_46_0 = stackOut_43_0;
                        stackIn_46_1 = stackOut_43_1;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        if (param3 == null) {
                          stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                          stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                          stackOut_46_2 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          break L11;
                        } else {
                          stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                          stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                          stackOut_44_2 = 1;
                          stackIn_47_0 = stackOut_44_0;
                          stackIn_47_1 = stackOut_44_1;
                          stackIn_47_2 = stackOut_44_2;
                          break L11;
                        }
                      }
                      throw kg.a((Throwable) (Object) stackIn_47_0, (stackIn_47_2 != 0) + " " + param1 + " " + var9_array.length + " " + na.a(false, var9_array.length, var9_array) + " " + na.a(false, -2 + var9_array.length, var9_array) + " " + ((eh) this).field_c.field_m[param1] + " " + ((eh) this).field_c.field_q);
                    }
                    L12: {
                      if (((eh) this).field_b) {
                        ((eh) this).field_a[param1] = null;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        L15: {
                          if (var5_int <= 1) {
                            break L15;
                          } else {
                            L16: {
                              if (((eh) this).field_k == 2) {
                                break L16;
                              } else {
                                var11 = var10.length;
                                var11--;
                                var12 = 255 & var10[var11];
                                var11 = var11 - var12 * var5_int * 4;
                                var13 = new jc(var10);
                                var14_ref_int__ = new int[var5_int];
                                var13.field_l = var11;
                                var15 = 0;
                                L17: while (true) {
                                  L18: {
                                    L19: {
                                      if (~var12 >= ~var15) {
                                        break L19;
                                      } else {
                                        var16_int = 0;
                                        stackOut_58_0 = 0;
                                        stackIn_68_0 = stackOut_58_0;
                                        stackIn_59_0 = stackOut_58_0;
                                        if (var22 != 0) {
                                          break L18;
                                        } else {
                                          var17 = stackIn_59_0;
                                          L20: while (true) {
                                            L21: {
                                              L22: {
                                                if (var17 >= var5_int) {
                                                  break L22;
                                                } else {
                                                  var16_int = var16_int + var13.d((byte) 126);
                                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                                  var17++;
                                                  if (var22 != 0) {
                                                    break L21;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                              }
                                              var15++;
                                              break L21;
                                            }
                                            if (var22 == 0) {
                                              continue L17;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_67_0 = var5_int;
                                    stackIn_68_0 = stackOut_67_0;
                                    break L18;
                                  }
                                  var15_ref_byte____ = new byte[stackIn_68_0][];
                                  var16_int = 0;
                                  L23: while (true) {
                                    L24: {
                                      L25: {
                                        if (~var5_int >= ~var16_int) {
                                          break L25;
                                        } else {
                                          var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                          var14_ref_int__[var16_int] = 0;
                                          var16_int++;
                                          if (var22 != 0) {
                                            break L24;
                                          } else {
                                            if (var22 == 0) {
                                              continue L23;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                      var13.field_l = var11;
                                      var16_int = 0;
                                      break L24;
                                    }
                                    var17 = 0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if (~var17 <= ~var12) {
                                            break L28;
                                          } else {
                                            var18 = 0;
                                            stackOut_77_0 = 0;
                                            stackIn_87_0 = stackOut_77_0;
                                            stackIn_78_0 = stackOut_77_0;
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              var19 = stackIn_78_0;
                                              L29: while (true) {
                                                L30: {
                                                  L31: {
                                                    if (var5_int <= var19) {
                                                      break L31;
                                                    } else {
                                                      var18 = var18 + var13.d((byte) 122);
                                                      ek.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                      var16_int = var16_int + var18;
                                                      var19++;
                                                      if (var22 != 0) {
                                                        break L30;
                                                      } else {
                                                        if (var22 == 0) {
                                                          continue L29;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var17++;
                                                  break L30;
                                                }
                                                if (var22 == 0) {
                                                  continue L26;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_86_0 = 0;
                                        stackIn_87_0 = stackOut_86_0;
                                        break L27;
                                      }
                                      var17 = stackIn_87_0;
                                      L32: while (true) {
                                        L33: {
                                          if (var5_int <= var17) {
                                            break L33;
                                          } else {
                                            if (var22 != 0) {
                                              break L14;
                                            } else {
                                              L34: {
                                                L35: {
                                                  if (null != var6) {
                                                    break L35;
                                                  } else {
                                                    var18 = var17;
                                                    if (var22 == 0) {
                                                      break L34;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                                var18 = var6[var17];
                                                break L34;
                                              }
                                              L36: {
                                                L37: {
                                                  if (((eh) this).field_k == 0) {
                                                    break L37;
                                                  } else {
                                                    var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                                    if (var22 == 0) {
                                                      break L36;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                                var7[var18] = th.a(-3, var15_ref_byte____[var17], false);
                                                break L36;
                                              }
                                              var17++;
                                              if (var22 == 0) {
                                                continue L32;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                        if (var22 == 0) {
                                          break L14;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var10.length;
                            var11--;
                            var12 = 255 & var10[var11];
                            var11 = var11 - 4 * (var5_int * var12);
                            var13 = new jc(var10);
                            var14 = 0;
                            var13.field_l = var11;
                            var15 = 0;
                            var16_int = 0;
                            L38: while (true) {
                              L39: {
                                L40: {
                                  if (var16_int >= var12) {
                                    break L40;
                                  } else {
                                    var17 = 0;
                                    stackOut_105_0 = 0;
                                    stackIn_122_0 = stackOut_105_0;
                                    stackIn_106_0 = stackOut_105_0;
                                    if (var22 != 0) {
                                      break L39;
                                    } else {
                                      var18 = stackIn_106_0;
                                      L41: while (true) {
                                        L42: {
                                          L43: {
                                            if (~var5_int >= ~var18) {
                                              break L43;
                                            } else {
                                              var17 = var17 + var13.d((byte) 123);
                                              if (var22 != 0) {
                                                break L42;
                                              } else {
                                                L44: {
                                                  L45: {
                                                    if (null != var6) {
                                                      break L45;
                                                    } else {
                                                      var19 = var18;
                                                      if (var22 == 0) {
                                                        break L44;
                                                      } else {
                                                        break L45;
                                                      }
                                                    }
                                                  }
                                                  var19 = var6[var18];
                                                  break L44;
                                                }
                                                L46: {
                                                  if (param0 == var19) {
                                                    var14 = var14 + var17;
                                                    var15 = var19;
                                                    break L46;
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                                var18++;
                                                if (var22 == 0) {
                                                  continue L41;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                          }
                                          var16_int++;
                                          break L42;
                                        }
                                        if (var22 == 0) {
                                          continue L38;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_121_0 = ~var14;
                                stackIn_122_0 = stackOut_121_0;
                                break L39;
                              }
                              if (stackIn_122_0 == -1) {
                                stackOut_125_0 = 1;
                                stackIn_126_0 = stackOut_125_0;
                                return stackIn_126_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var14 = 0;
                                var13.field_l = var11;
                                var17 = 0;
                                var18 = 0;
                                L47: while (true) {
                                  L48: {
                                    if (var18 >= var12) {
                                      break L48;
                                    } else {
                                      var19 = 0;
                                      stackOut_129_0 = 0;
                                      stackIn_156_0 = stackOut_129_0;
                                      stackIn_130_0 = stackOut_129_0;
                                      if (var22 != 0) {
                                        break L13;
                                      } else {
                                        var20 = stackIn_130_0;
                                        L49: while (true) {
                                          L50: {
                                            L51: {
                                              if (~var5_int >= ~var20) {
                                                break L51;
                                              } else {
                                                var19 = var19 + var13.d((byte) 96);
                                                if (var22 != 0) {
                                                  break L50;
                                                } else {
                                                  L52: {
                                                    L53: {
                                                      if (var6 != null) {
                                                        break L53;
                                                      } else {
                                                        var21 = var20;
                                                        if (var22 == 0) {
                                                          break L52;
                                                        } else {
                                                          break L53;
                                                        }
                                                      }
                                                    }
                                                    var21 = var6[var20];
                                                    break L52;
                                                  }
                                                  L54: {
                                                    if (~param0 != ~var21) {
                                                      break L54;
                                                    } else {
                                                      ek.a(var10, var17, var16, var14, var19);
                                                      var14 = var14 + var19;
                                                      break L54;
                                                    }
                                                  }
                                                  var17 = var17 + var19;
                                                  var20++;
                                                  if (var22 == 0) {
                                                    continue L49;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                              }
                                            }
                                            var18++;
                                            break L50;
                                          }
                                          if (var22 == 0) {
                                            continue L47;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var7[var15] = (Object) (Object) var16;
                                  if (var22 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L55: {
                          L56: {
                            if (var6 == null) {
                              break L56;
                            } else {
                              var11 = var6[0];
                              if (var22 == 0) {
                                break L55;
                              } else {
                                break L56;
                              }
                            }
                          }
                          var11 = 0;
                          break L55;
                        }
                        L57: {
                          if (((eh) this).field_k == 0) {
                            break L57;
                          } else {
                            var7[var11] = (Object) (Object) var10;
                            if (var22 == 0) {
                              break L14;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var7[var11] = th.a(-3, var10, false);
                        break L14;
                      }
                      stackOut_155_0 = 1;
                      stackIn_156_0 = stackOut_155_0;
                      break L13;
                    }
                    break L0;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
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
          L58: {
            var5 = decompiledCaughtException;
            stackOut_157_0 = (RuntimeException) var5;
            stackOut_157_1 = new StringBuilder().append("eh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_160_0 = stackOut_157_0;
            stackIn_160_1 = stackOut_157_1;
            stackIn_158_0 = stackOut_157_0;
            stackIn_158_1 = stackOut_157_1;
            if (param3 == null) {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "null";
              stackIn_161_0 = stackOut_160_0;
              stackIn_161_1 = stackOut_160_1;
              stackIn_161_2 = stackOut_160_2;
              break L58;
            } else {
              stackOut_158_0 = (RuntimeException) (Object) stackIn_158_0;
              stackOut_158_1 = (StringBuilder) (Object) stackIn_158_1;
              stackOut_158_2 = "{...}";
              stackIn_161_0 = stackOut_158_0;
              stackIn_161_1 = stackOut_158_1;
              stackIn_161_2 = stackOut_158_2;
              break L58;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_161_0, stackIn_161_2 + ')');
        }
        return stackIn_156_0 != 0;
    }

    final synchronized int[] e(byte param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        int[] stackIn_13_0 = null;
        int[] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int[] stackOut_12_0 = null;
        int[] stackOut_16_0 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 103, param1)) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (int[]) (Object) stackIn_5_0;
            } else {
              L1: {
                if (param0 >= 124) {
                  break L1;
                } else {
                  ((long[]) ((Object[]) ((eh) this).field_a[5])[2])[5] = ((long[]) ((eh) this).field_a[3])[14];
                  break L1;
                }
              }
              L2: {
                L3: {
                  var3 = ((eh) this).field_c.field_r[param1];
                  if (null != var3) {
                    break L3;
                  } else {
                    var3 = new int[((eh) this).field_c.field_n[param1]];
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= var3.length) {
                        break L3;
                      } else {
                        stackOut_12_0 = (int[]) var3;
                        stackIn_17_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          stackIn_13_0[var4] = var4;
                          var4++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = (int[]) var3;
                stackIn_17_0 = stackOut_16_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3_ref, "eh.V(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
                var3_int = ((eh) this).field_c.field_h.b(true, nf.a(param0 + 7, (CharSequence) (Object) param1));
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
            stackOut_13_1 = new StringBuilder().append("eh.C(").append(param0).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
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
                  boolean discarded$2 = ((eh) this).a((byte) 121, (String) null);
                  break L1;
                }
              }
              var4_int = ((eh) this).field_c.field_u[param1].b(true, nf.a(6, (CharSequence) (Object) param2));
              if (this.b(var4_int, param1, 0)) {
                stackOut_11_0 = var4_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("eh.L(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean c(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            if (!this.a((byte) 110, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((eh) this).field_a[param1] != null) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var3_int = -43 / ((-32 - param0) / 52);
                this.a(-8003, param1);
                if (null != ((eh) this).field_a[param1]) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_11_0 = 0;
        try {
          if (!((eh) this).c(0)) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            if (1 == ((eh) this).field_c.field_i.length) {
              stackOut_8_0 = ((eh) this).a(0, (byte) -10, param1);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (this.a((byte) 105, param1)) {
                if (((eh) this).field_c.field_i[param1] != 1) {
                  L0: {
                    if (param0) {
                      break L0;
                    } else {
                      boolean discarded$2 = ((eh) this).a(true, -82);
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  stackOut_14_0 = ((eh) this).a(param1, (byte) 127, 0);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -8003) {
                break L1;
              } else {
                int discarded$2 = ((eh) this).e(-98);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((eh) this).field_b) {
                  break L3;
                } else {
                  ((eh) this).field_a[param1] = (Object) (Object) ((eh) this).field_i.b(param1, 122);
                  if (!Virogrid.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((eh) this).field_a[param1] = th.a(param0 + 8000, ((eh) this).field_i.b(param1, 120), false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.H(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (((eh) this).c(0)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var4_int = ((eh) this).field_c.field_h.b(true, nf.a(6, (CharSequence) (Object) param0));
              if (this.a((byte) 97, var4_int)) {
                L1: {
                  if (param1 == 100) {
                    break L1;
                  } else {
                    byte[] discarded$2 = ((eh) this).b(-105, 124);
                    break L1;
                  }
                }
                var5 = ((eh) this).field_c.field_u[var4_int].b(true, nf.a(6, (CharSequence) (Object) param2));
                stackOut_9_0 = ((eh) this).a(var4_int, var5, 0);
                stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("eh.S(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized byte[] b(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((eh) this).c(0)) {
            if (((eh) this).field_c.field_i.length != 1) {
              if (this.a((byte) 124, param0)) {
                if (1 != ((eh) this).field_c.field_i[param0]) {
                  if (param1 == 27034) {
                    throw new RuntimeException();
                  } else {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (byte[]) (Object) stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = ((eh) this).a(param0, 0, param1 ^ 27034);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = ((eh) this).a(0, param0, 0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.F(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -2677) {
              if (!((eh) this).c(0)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var2_int = 0;
                var3 = 0;
                var4 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~((eh) this).field_a.length >= ~var4) {
                        break L3;
                      } else {
                        stackOut_11_0 = -1;
                        stackOut_11_1 = ~((eh) this).field_c.field_n[var4];
                        stackIn_19_0 = stackOut_11_0;
                        stackIn_19_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_12_0 > stackIn_12_1) {
                              var2_int += 100;
                              var3 = var3 + ((eh) this).b((byte) 106, var4);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = -1;
                    stackOut_18_1 = ~var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L2;
                  }
                  if (stackIn_19_0 == stackIn_19_1) {
                    stackOut_21_0 = 100;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  } else {
                    var4 = 100 * var3 / var2_int;
                    stackOut_23_0 = var4;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = -66;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "eh.M(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -104) {
                break L1;
              } else {
                eh.a((String) null, (java.applet.Applet) null, (byte) -81, true);
                break L1;
              }
            }
            field_j = null;
            field_g = null;
            field_m = null;
            field_h = null;
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "eh.B(" + param0 + ')');
        }
    }

    final synchronized boolean b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (((eh) this).c(param0 ^ param0)) {
              var2_int = 1;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((eh) this).field_c.field_c.length >= ~var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((eh) this).field_c.field_c[var3];
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var4 = stackIn_7_0;
                          if (((eh) this).field_a[var4] != null) {
                            break L4;
                          } else {
                            this.a(-8003, var4);
                            if (null != ((eh) this).field_a[var4]) {
                              break L4;
                            } else {
                              var2_int = 0;
                              break L4;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var2_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "eh.U(" + param0 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final synchronized int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a((byte) 119, param1)) {
              if (param0 > 73) {
                if (((eh) this).field_a[param1] != null) {
                  stackOut_9_0 = 100;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = ((eh) this).field_i.a(-7, param1);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = -79;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "eh.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static ch[] a(int param0, pd param1) {
        RuntimeException var2 = null;
        un var2_ref = null;
        int[] var3 = null;
        ch[] var4 = null;
        int var5 = 0;
        ch var6 = null;
        int var7 = 0;
        ch[] stackIn_3_0 = null;
        ch[] stackIn_17_0 = null;
        ch[] stackIn_21_0 = null;
        ch[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch[] stackOut_20_0 = null;
        ch[] stackOut_24_0 = null;
        ch[] stackOut_16_0 = null;
        ch[] stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.b(-121)) {
              L1: {
                if (param0 > 30) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              var2_ref = param1.a((byte) -125);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var2_ref.field_a != 0) {
                      break L4;
                    } else {
                      mm.a(-27, 10L);
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var2_ref.field_a == 2) {
                    break L3;
                  } else {
                    var3 = (int[]) var2_ref.field_f;
                    var4 = new ch[var3.length >> 1720683810];
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5 >= var4.length) {
                            break L7;
                          } else {
                            var6 = new ch();
                            stackOut_20_0 = (ch[]) var4;
                            stackIn_25_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var7 != 0) {
                              break L6;
                            } else {
                              stackIn_21_0[var5] = var6;
                              var6.field_c = var3[var5 << 1683881474];
                              var6.field_k = var3[1 + (var5 << -531982590)];
                              var6.field_g = var3[(var5 << 1315220450) + 2];
                              var6.field_d = var3[(var5 << -1126362654) - -3];
                              var5++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_24_0 = (ch[]) var4;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      }
                      break L0;
                    }
                  }
                }
                stackOut_16_0 = new ch[]{};
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            } else {
              stackOut_2_0 = new ch[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("eh.AA(").append(param0).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_25_0;
    }

    final boolean a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              var3_int = ((eh) this).field_c.field_h.b(param1, nf.a(6, (CharSequence) (Object) param0));
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
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
              return stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 >= 71) {
                  break L1;
                } else {
                  int discarded$2 = ((eh) this).e(-48);
                  break L1;
                }
              }
              var3_int = ((eh) this).field_c.field_h.b(true, nf.a(6, (CharSequence) (Object) param0));
              stackOut_8_0 = ((eh) this).b((byte) 85, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("eh.G(");
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
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((eh) this).c(param2)) {
              L1: {
                if (param2 > param1) {
                  break L1;
                } else {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (~((eh) this).field_c.field_i.length >= ~param1) {
                      break L1;
                    } else {
                      if (param0 >= ((eh) this).field_c.field_i[param1]) {
                        break L1;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (bk.field_a) {
                throw new IllegalArgumentException(param1 + " " + param0);
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4, "eh.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = this.a(125, param0, (int[]) null, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) ((eh) this).field_a[14];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4, "eh.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
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
                var6 = this.a(param3, param1, 63, param2) ? 1 : 0;
                if (var6 == 0) {
                  this.a(-8003, param1);
                  var6 = this.a(param3, param1, 108, param2) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (byte[]) (Object) stackIn_14_0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((eh) this).field_f[param1]) {
                throw new RuntimeException("");
              } else {
                if (param0 > 107) {
                  L3: {
                    if (((eh) this).field_f[param1][param3] != null) {
                      var5 = (Object) (Object) gi.a(((eh) this).field_f[param1][param3], false, (byte) -126);
                      if (var5 != null) {
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
                      L5: {
                        if (1 != ((eh) this).field_k) {
                          break L5;
                        } else {
                          ((eh) this).field_f[param1][param3] = null;
                          if (((eh) this).field_c.field_i[param1] == 1) {
                            ((eh) this).field_f[param1] = null;
                            if (!Virogrid.field_F) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (2 == ((eh) this).field_k) {
                        ((eh) this).field_f[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_44_0 = var5;
                  stackIn_45_0 = stackOut_44_0;
                  break L0;
                } else {
                  stackOut_20_0 = null;
                  stackIn_21_0 = stackOut_20_0;
                  return (byte[]) (Object) stackIn_21_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_46_0 = var5;
            stackOut_46_1 = new StringBuilder().append("eh.W(").append(param0).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L6;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_45_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!this.b(param2, param0, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((eh) this).field_f[param0] == null) {
                  break L1;
                } else {
                  if (((eh) this).field_f[param0][param2] == null) {
                    break L1;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
              if (((eh) this).field_a[param0] != null) {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              } else {
                this.a(-8003, param0);
                var4_int = 119 / ((74 - param1) / 50);
                if (null == ((eh) this).field_a[param0]) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4, "eh.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    eh(ba param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                  ((eh) this).field_b = param1;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("eh.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
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
