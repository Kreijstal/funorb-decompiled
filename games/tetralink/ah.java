/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private Object[][] field_h;
    static int field_a;
    private Object[] field_i;
    private hk field_b;
    private t field_e;
    static String[] field_j;
    static String field_c;
    static int[] field_g;
    boolean field_f;
    int field_d;

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((ah) this).c(97)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1) {
                  break L1;
                } else {
                  boolean discarded$2 = this.a(-27, (int[]) null, true, ((int[]) ((Object[]) ((ah) this).field_i[4])[7])[23]);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ah) this).field_e.field_r.a(-114, g.a(-1, var4));
              stackOut_5_0 = ((ah) this).e(-11337, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ah.CA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final synchronized boolean f(int param0, int param1) {
        if (param1 <= 30) {
            return true;
        }
        if (!((ah) this).c(105)) {
            return false;
        }
        if (((ah) this).field_e.field_d.length == 1) {
            return ((ah) this).a((byte) -30, 0, param0);
        }
        if (!this.a((byte) 119, param0)) {
            return false;
        }
        if (((ah) this).field_e.field_d[param0] == 1) {
            return ((ah) this).a((byte) -30, param0, 0);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 8 / ((-45 - param0) / 33);
        return this.a(-2, (int[]) null, param2, param1);
    }

    final int a(int param0) {
        if (!((ah) this).c(94)) {
            return -1;
        }
        if (param0 != -1) {
            Object var3 = null;
            boolean discarded$0 = this.a(((int[]) ((Object[]) ((ah) this).field_i[0])[4])[0], (int[]) null, false, 120);
        }
        return ((ah) this).field_e.field_d.length;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        oh var13 = null;
        Object var14 = null;
        int[] var15 = null;
        oh var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = ra.field_b;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = ra.field_f;
          var8 = ra.field_e;
          var9 = new oh(param1, -(param1 * 2) + param5);
          var9.c();
          ra.b(0, 0, param1, param5 - param1 * 2, param4, param2);
          var10 = new oh(param1, param1);
          var10.c();
          ra.c(0, 0, param1, param1, param4);
          var11 = new oh(16, param1);
          var11.c();
          ra.c(0, 0, 16, param1, param4);
          var12 = new oh(param1, param1);
          var12.c();
          ra.c(0, 0, param1, param1, param2);
          var13 = new oh(16, param1);
          var13.c();
          ra.c(0, 0, param3, param1, param2);
          var14 = null;
          if (param0 > 0) {
            var16 = new oh(16, 16);
            var14 = (Object) (Object) var16;
            var16.c();
            ra.c(0, 0, 16, 16, param0);
            break L0;
          } else {
            break L0;
          }
        }
        ra.a(var20, var7, var8);
        return new oh[]{var10, var11, var10, var9, (oh) var14, var9, var12, var13, var12};
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (((ah) this).c(111)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ah) this).field_e.field_r.a(84, g.a(-1, var4));
              if (param1 <= -61) {
                stackOut_6_0 = ((ah) this).d(var3_int, 0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ah.L(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized int e(int param0, int param1) {
        if (!this.a((byte) 119, param1)) {
          return 0;
        } else {
          if (null == ((ah) this).field_i[param1]) {
            L0: {
              if (param0 == -11337) {
                break L0;
              } else {
                ((ah) this).field_e = (t) ((ah) this).field_i[9];
                break L0;
              }
            }
            return ((ah) this).field_b.a(param1, 0);
          } else {
            return 100;
          }
        }
    }

    private final synchronized void b(byte param0, int param1) {
        L0: {
          if (((ah) this).field_f) {
            ((ah) this).field_i[param1] = (Object) (Object) ((ah) this).field_b.b(20396, param1);
            break L0;
          } else {
            int discarded$10 = -137;
            int discarded$11 = 0;
            ((ah) this).field_i[param1] = ik.a(((ah) this).field_b.b(20396, param1));
            break L0;
          }
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_38_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            if (this.a(param2, (byte) -72, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((ah) this).field_h[param2] == null) {
                    break L2;
                  } else {
                    if (null != ((ah) this).field_h[param2][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param2, param1, false, param3)) {
                  this.b((byte) -3, param2);
                  if (this.a(param2, param1, false, param3)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (((ah) this).field_h[param2] != null) {
                L3: {
                  if (((ah) this).field_h[param2][param3] == null) {
                    break L3;
                  } else {
                    var7 = vj.a(false, (byte) -28, ((ah) this).field_h[param2][param3]);
                    var5 = (Object) (Object) var7;
                    if (null == var7) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((ah) this).field_d != 1) {
                      if (((ah) this).field_d != 2) {
                        break L4;
                      } else {
                        ((ah) this).field_h[param2] = null;
                        break L4;
                      }
                    } else {
                      ((ah) this).field_h[param2][param3] = null;
                      if (((ah) this).field_e.field_d[param2] == 1) {
                        ((ah) this).field_h[param2] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_38_0 = var5;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                throw new RuntimeException("");
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
            stackOut_40_0 = var5;
            stackOut_40_1 = new StringBuilder().append("ah.M(").append(-2).append(44);
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L5;
            } else {
              stackOut_41_0 = stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_39_0;
    }

    final synchronized boolean c(int param0) {
        if (param0 <= 87) {
            oh[] discarded$0 = ah.a(103, -121, ((int[]) ((ah) this).field_i[4])[43], -50, ((int[]) ((ah) this).field_i[4])[7], 99);
        }
        if (null != ((ah) this).field_e) {
            return true;
        }
        ((ah) this).field_e = ((ah) this).field_b.a(0);
        if (null == ((ah) this).field_e) {
            return false;
        }
        ((ah) this).field_i = new Object[((ah) this).field_e.field_i];
        ((ah) this).field_h = new Object[((ah) this).field_e.field_i][];
        return true;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!((ah) this).c(106)) {
            return false;
        }
        if (0 <= param0) {
            if (param2 >= 0) {
                if (((ah) this).field_e.field_d.length > param0) {
                    if (param2 < ((ah) this).field_e.field_d[param0]) {
                        return true;
                    }
                }
            }
        }
        if (ec.field_k) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((ah) this).c(88)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ah) this).field_e.field_r.a(-115, g.a(param1 + -1, var4));
              if (var3_int >= param1) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ah.K(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final int b(int param0, int param1) {
        L0: {
          if (param0 == -23126) {
            break L0;
          } else {
            int discarded$2 = ((ah) this).e(1, 109);
            break L0;
          }
        }
        if (!this.a((byte) 119, param1)) {
          return 0;
        } else {
          return ((ah) this).field_e.field_d[param1];
        }
    }

    private final synchronized boolean a(int param0, int[] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
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
        bh var26 = null;
        byte[] var28 = null;
        bh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        bh var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var37 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
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
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_98_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var22 = TetraLink.field_J;
        try {
          L0: {
            if (!this.a((byte) 119, param0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((ah) this).field_i[param0]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                L1: {
                  var5_int = ((ah) this).field_e.field_m[param0];
                  var48 = ((ah) this).field_e.field_a[param0];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (null != ((ah) this).field_h[param0]) {
                    break L1;
                  } else {
                    ((ah) this).field_h[param0] = new Object[((ah) this).field_e.field_d[param0]];
                    break L1;
                  }
                }
                if (!param2) {
                  var7 = ((ah) this).field_h[param0];
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var9_int >= var5_int) {
                        break L3;
                      } else {
                        L4: {
                          if (var6 != null) {
                            var10 = var48[var9_int];
                            break L4;
                          } else {
                            var10 = var9_int;
                            break L4;
                          }
                        }
                        if (null == var7[var10]) {
                          var8 = 0;
                          break L3;
                        } else {
                          var9_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var8 == 0) {
                      L5: {
                        L6: {
                          if (param1 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (-1 != param1[0]) {
                                break L7;
                              } else {
                                if (0 != param1[1]) {
                                  break L7;
                                } else {
                                  if (-1 != param1[2]) {
                                    break L7;
                                  } else {
                                    if (param1[3] != 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var49 = vj.a(true, (byte) -28, ((ah) this).field_i[param0]);
                            var42 = var49;
                            var35 = var42;
                            var25 = var35;
                            var9_array = var25;
                            var26 = new bh(var49);
                            var26.a(-25351, param1, var26.field_u.length, 5);
                            break L5;
                          }
                        }
                        var9_array = vj.a(false, (byte) -28, ((ah) this).field_i[param0]);
                        break L5;
                      }
                      try {
                        L8: {
                          var51 = pk.a(var9_array, (byte) 88);
                          var44 = var51;
                          var37 = var44;
                          var28 = var37;
                          var23 = var28;
                          var50 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_40_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_40_1 = new StringBuilder();
                          stackIn_43_0 = stackOut_40_0;
                          stackIn_43_1 = stackOut_40_1;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          if (null == param1) {
                            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                            stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                            stackOut_43_2 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            break L9;
                          } else {
                            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                            stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                            stackOut_41_2 = 1;
                            stackIn_44_0 = stackOut_41_0;
                            stackIn_44_1 = stackOut_41_1;
                            stackIn_44_2 = stackOut_41_2;
                            break L9;
                          }
                        }
                        throw oi.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + " " + param0 + " " + param1.length + " " + ti.a(var9_array, (byte) 92, param1.length) + " " + ti.a(var9_array, (byte) -15, -2 + param1.length) + " " + ((ah) this).field_e.field_u[param0] + " " + ((ah) this).field_e.field_v);
                      }
                      L10: {
                        if (((ah) this).field_f) {
                          ((ah) this).field_i[param0] = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var5_int > 1) {
                          if (((ah) this).field_d == 2) {
                            var11 = var51.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - var12 * var5_int * 4;
                            var32 = new bh(var50);
                            var14 = 0;
                            var32.field_t = var11;
                            var15 = 0;
                            var16 = 0;
                            L12: while (true) {
                              if (var16 >= var12) {
                                if (var14 != 0) {
                                  var54 = new byte[var14];
                                  var14 = 0;
                                  var32.field_t = var11;
                                  var17 = 0;
                                  var18 = 0;
                                  L13: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15] = (Object) (Object) var54;
                                      break L11;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L14: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L13;
                                        } else {
                                          L15: {
                                            var19 = var19 + var32.f(48);
                                            if (null != var6) {
                                              var21 = param1[var20];
                                              break L15;
                                            } else {
                                              var21 = var20;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            if (var21 == param3) {
                                              rd.a(var50, var17, var54, var14, var19);
                                              var14 = var14 + var19;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var17 = var17 + var19;
                                          var20++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackOut_97_0 = 1;
                                  stackIn_98_0 = stackOut_97_0;
                                  return stackIn_98_0 != 0;
                                }
                              } else {
                                var17 = 0;
                                var18 = 0;
                                L17: while (true) {
                                  if (var5_int <= var18) {
                                    var16++;
                                    continue L12;
                                  } else {
                                    L18: {
                                      var17 = var17 + var32.f(-124);
                                      if (var6 == null) {
                                        var19 = var18;
                                        break L18;
                                      } else {
                                        var19 = param1[var18];
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (param3 == var19) {
                                        var14 = var14 + var17;
                                        var15 = var19;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    var18++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var51.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - var5_int * var12 * 4;
                            var29 = new bh(var50);
                            var29.field_t = var11;
                            var52 = new int[var5_int];
                            var45 = var52;
                            var38 = var45;
                            var30 = var38;
                            var14_ref_int__ = var30;
                            var15 = 0;
                            L20: while (true) {
                              if (var15 >= var12) {
                                var53 = new byte[var5_int][];
                                var46 = var53;
                                var39 = var46;
                                var31 = var39;
                                var15_ref_byte____ = var31;
                                var16 = 0;
                                L21: while (true) {
                                  if (var16 >= var5_int) {
                                    var29.field_t = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var12 <= var17) {
                                        var17 = 0;
                                        L23: while (true) {
                                          if (var17 >= var5_int) {
                                            break L11;
                                          } else {
                                            L24: {
                                              if (var6 != null) {
                                                var18 = param1[var17];
                                                break L24;
                                              } else {
                                                var18 = var17;
                                                break L24;
                                              }
                                            }
                                            L25: {
                                              if (((ah) this).field_d != 0) {
                                                var7[var18] = (Object) (Object) var53[var17];
                                                break L25;
                                              } else {
                                                int discarded$4 = -137;
                                                int discarded$5 = 0;
                                                var7[var18] = ik.a(var53[var17]);
                                                break L25;
                                              }
                                            }
                                            var17++;
                                            continue L23;
                                          }
                                        }
                                      } else {
                                        L26: {
                                          var18 = 0;
                                          var19 = 0;
                                          if (var19 >= var5_int) {
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var15_ref_byte____[var16] = new byte[param1[var16]];
                                    param1[var16] = 0;
                                    var16++;
                                    continue L21;
                                  }
                                }
                              } else {
                                L27: {
                                  var16 = 0;
                                  var17 = 0;
                                  if (var5_int <= var17) {
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                                var15++;
                                continue L20;
                              }
                            }
                          }
                        } else {
                          L28: {
                            if (var6 == null) {
                              var11 = 0;
                              break L28;
                            } else {
                              var11 = param1[0];
                              break L28;
                            }
                          }
                          if (0 != ((ah) this).field_d) {
                            var7[var11] = (Object) (Object) var50;
                            break L11;
                          } else {
                            int discarded$6 = -137;
                            int discarded$7 = 0;
                            var7[var11] = ik.a(var23);
                            return true;
                          }
                        }
                      }
                      stackOut_113_0 = 1;
                      stackIn_114_0 = stackOut_113_0;
                      break L0;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  }
                } else {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var5;
            stackOut_115_1 = new StringBuilder().append("ah.C(").append(param0).append(44);
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param1 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L29;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L29;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_119_0, stackIn_119_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_114_0 != 0;
    }

    public static void d(int param0) {
        field_g = null;
        field_c = null;
        field_j = null;
        if (param0 != 16) {
            field_j = null;
        }
    }

    final int a(int param0, String param1) {
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
            if (!((ah) this).c(121)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((ah) this).field_e.field_r.a(-85, g.a(param0, var4));
              if (!this.a((byte) 119, var3_int)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ah.B(").append(param0).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_8_0;
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (((ah) this).c(95)) {
          var2 = 1;
          if (!param0) {
            var3 = 0;
            L0: while (true) {
              if (((ah) this).field_e.field_j.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((ah) this).field_e.field_j[var3];
                if (null == ((ah) this).field_i[var4]) {
                  this.b((byte) -3, var4);
                  if (null == ((ah) this).field_i[var4]) {
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
            return true;
          }
        } else {
          return false;
        }
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        var5 = TetraLink.field_J;
        if (this.a((byte) 119, param0)) {
          L0: {
            var3 = ((ah) this).field_e.field_a[param0];
            if (null == var3) {
              var6 = new int[((ah) this).field_e.field_m[param0]];
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (var6.length <= var4) {
                  break L0;
                } else {
                  var6[var4] = var4;
                  var4++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (param1 == 0) {
              break L2;
            } else {
              boolean discarded$1 = ((ah) this).f(((int[]) ((ah) this).field_i[1])[2], -20);
              break L2;
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
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
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 < -114) {
              if (((ah) this).c(98)) {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((ah) this).field_e.field_r.a(60, g.a(-1, var6));
                if (this.a((byte) 119, var4_int)) {
                  var7 = (CharSequence) (Object) param0;
                  var5 = ((ah) this).field_e.field_n[var4_int].a(-81, g.a(-1, var7));
                  stackOut_9_0 = ((ah) this).a((byte) -30, var4_int, var5);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ah.W(");
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((ah) this).c(104)) {
            return false;
        }
        if (param1 >= 0) {
            if (param1 < ((ah) this).field_e.field_d.length) {
                if (((ah) this).field_e.field_d[param1] != 0) {
                    return true;
                }
            }
        }
        if (ec.field_k) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.a((byte) 119, param0)) {
              L1: {
                param2 = param2.toLowerCase();
                if (!param1) {
                  break L1;
                } else {
                  var5 = null;
                  boolean discarded$2 = ((ah) this).a((String) null, 39);
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param2;
              var4_int = ((ah) this).field_e.field_n[param0].a(83, g.a(-1, var6));
              if (!this.a(param0, (byte) -72, var4_int)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ah.BA(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_8_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param1, (byte) -72, param2)) {
          return false;
        } else {
          L0: {
            if (null == ((ah) this).field_h[param1]) {
              break L0;
            } else {
              if (null != ((ah) this).field_h[param1][param2]) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (((ah) this).field_i[param1] != null) {
            return true;
          } else {
            this.b((byte) -3, param1);
            if (null == ((ah) this).field_i[param1]) {
              if (param0 == -30) {
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a((byte) 119, param0)) {
          return false;
        } else {
          if (((ah) this).field_i[param0] == null) {
            L0: {
              if (param1 == 0) {
                break L0;
              } else {
                ah.d(74);
                break L0;
              }
            }
            this.b((byte) -3, param0);
            if (null != ((ah) this).field_i[param0]) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    ah(hk param0, boolean param1, int param2) {
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
        ((ah) this).field_e = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 < param2) {
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
                  ((ah) this).field_f = stackIn_9_1 != 0;
                  ((ah) this).field_b = param0;
                  ((ah) this).field_d = param2;
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
            stackOut_11_1 = new StringBuilder().append("ah.<init>(");
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
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (!((ah) this).c(89)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((ah) this).field_i.length <= var4) {
              if (var2 != 0) {
                if (param0 == 22300) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return ((int[]) ((Object[]) ((ah) this).field_i[0])[1])[7];
                }
              } else {
                return 100;
              }
            } else {
              if (0 < ((ah) this).field_e.field_m[var4]) {
                var3 = var3 + ((ah) this).e(-11337, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_6_0 = null;
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
        Object stackOut_5_0 = null;
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
            if (((ah) this).c(97)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((ah) this).field_e.field_r.a(102, g.a(-1, var6));
              if (this.a((byte) 119, var4_int)) {
                L1: {
                  if (param2) {
                    break L1;
                  } else {
                    field_j = null;
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param1;
                var5 = ((ah) this).field_e.field_n[var4_int].a(-119, g.a(-1, var7));
                stackOut_9_0 = ((ah) this).a(-127, var5, var4_int);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (byte[]) (Object) stackIn_6_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ah.R(");
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized byte[] a(int param0, int param1) {
        if (((ah) this).c(113)) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              boolean discarded$2 = ((ah) this).a((byte) -43, 44, -77);
              break L0;
            }
          }
          if (((ah) this).field_e.field_d.length == 1) {
            return ((ah) this).a(8, param1, 0);
          } else {
            if (this.a((byte) 119, param1)) {
              if (((ah) this).field_e.field_d[param1] == 1) {
                return ((ah) this).a(103, 0, param1);
              } else {
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Owner";
        field_g = new int[128];
    }
}
