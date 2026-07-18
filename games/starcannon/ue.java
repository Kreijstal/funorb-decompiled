/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private Object[][] field_g;
    private ti field_a;
    private int field_i;
    private ak field_b;
    static int field_e;
    static int[] field_c;
    static int field_f;
    private boolean field_d;
    private Object[] field_h;

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!param1) {
              if (!((ue) this).b((byte) 99)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((ue) this).field_b.field_l.a((byte) 0, ne.a(param1, var4));
                if (this.a((byte) -76, var3_int)) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = -78;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ue.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final int a(String param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = ((ue) this).a((String) null, (String) null, (byte) -41);
                break L1;
              }
            }
            if (!this.a((byte) -76, param2)) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((ue) this).field_b.field_s[param2].a((byte) 127, ne.a(false, var6));
              if (!this.a(var4_int, 117, param2)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return var4_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ue.L(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        if (!((ue) this).b((byte) 114)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((ue) this).field_b.field_g.length) {
              L1: {
                if (param0 == 29741) {
                  break L1;
                } else {
                  boolean discarded$1 = ((ue) this).a(53, (String) ((ue) this).field_h[3]);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((ue) this).field_b.field_g[var3];
              if (((ue) this).field_h[var4] == null) {
                this.d(var4, 0);
                if (((ue) this).field_h[var4] == null) {
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
        }
    }

    final synchronized int a(int param0, int param1) {
        if (!(this.a((byte) -76, param1))) {
            return 0;
        }
        if (null != ((ue) this).field_h[param1]) {
            return 100;
        }
        if (param0 != 100) {
            int discarded$0 = ((ue) this).a((String) ((ue) this).field_h[21], ((boolean[]) ((Object[]) ((ue) this).field_h[12])[31])[0]);
        }
        return ((ue) this).field_a.a(param1, true);
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = rh.field_j[(int)(var7 + -(37L * param0))];
            if (var9 == 95) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (((ue) this).b((byte) 109)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var7 = (CharSequence) (Object) param0;
              var4_int = ((ue) this).field_b.field_l.a((byte) 21, ne.a(false, var7));
              if (this.a((byte) -76, var4_int)) {
                var5 = -85 / ((param1 - -35) / 41);
                var8 = (CharSequence) (Object) param2;
                var6 = ((ue) this).field_b.field_s[var4_int].a((byte) -128, ne.a(false, var8));
                stackOut_6_0 = ((ue) this).a(var4_int, true, var6);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ue.N(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((ue) this).b((byte) 100)) {
              L1: {
                if (param0 == -20955) {
                  break L1;
                } else {
                  ((ue) this).field_i = 24;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((ue) this).field_b.field_l.a((byte) -126, ne.a(false, var4));
              if (var3_int < 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
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
            if (!((ue) this).b((byte) 111)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 >= 74) {
                  break L1;
                } else {
                  ((byte[]) ((ue) this).field_h[3])[0] = ((byte[]) ((Object[]) ((ue) this).field_h[0])[9])[13];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ue) this).field_b.field_l.a((byte) -21, ne.a(false, var4));
              stackOut_6_0 = ((ue) this).a(100, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ue.J(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        if (((ue) this).b((byte) 123)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((ue) this).field_h.length <= var4) {
              if (var2 != 0) {
                L1: {
                  if (param0 > 37) {
                    break L1;
                  } else {
                    ((ue) this).field_i = ((int[]) ((Object[]) ((ue) this).field_h[4])[8])[1];
                    break L1;
                  }
                }
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((ue) this).field_b.field_i[var4] > 0) {
                var3 = var3 + ((ue) this).a(100, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            return null;
        }
        return this.a((int[]) null, param0, param2, true);
    }

    final synchronized boolean b(byte param0) {
        if (null == ((ue) this).field_b) {
            ((ue) this).field_b = ((ue) this).field_a.b((byte) -84);
            if (((ue) this).field_b == null) {
                return false;
            }
            ((ue) this).field_h = new Object[((ue) this).field_b.field_m];
            ((ue) this).field_g = new Object[((ue) this).field_b.field_m][];
        }
        if (param0 <= 87) {
            ((ue) this).field_a = null;
            return true;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((ue) this).b((byte) 92)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -17) {
                  break L1;
                } else {
                  i discarded$2 = ue.a((ue) null, (byte) 1, -121, ((int[]) ((ue) this).field_h[2])[5], (ue) ((ue) this).field_h[0]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((ue) this).field_b.field_l.a((byte) -125, ne.a(false, var6));
              if (this.a((byte) -76, var4_int)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((ue) this).field_b.field_s[var4_int].a((byte) 9, ne.a(false, var7));
                stackOut_8_0 = ((ue) this).a((byte) -93, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ue.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.a((byte) -76, param0))) {
            return false;
        }
        if (((ue) this).field_h[param0] != null) {
            return true;
        }
        this.d(param0, 0);
        if (param1 > -24) {
            return false;
        }
        if (((ue) this).field_h[param0] != null) {
            return true;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = null;
        }
        field_c = null;
    }

    private final synchronized void d(int param0, int param1) {
        if (!((ue) this).field_d) {
            ((ue) this).field_h[param0] = d.a(false, (byte) 119, ((ue) this).field_a.b(param0, false));
        } else {
            ((ue) this).field_h[param0] = (Object) (Object) ((ue) this).field_a.b(param0, false);
        }
        if (param1 != 0) {
            ((int[]) ((ue) this).field_h[1])[5] = 92;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 <= 106) {
            return false;
        }
        if (!(((ue) this).b((byte) 94))) {
            return false;
        }
        if (param2 >= 0) {
            if (param0 >= 0) {
                if (param2 < ((ue) this).field_b.field_j.length) {
                    if (param0 < ((ue) this).field_b.field_j[param2]) {
                        return true;
                    }
                }
            }
        }
        if (!gf.field_d) {
            return false;
        }
        throw new IllegalArgumentException(param2 + " " + param0);
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
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
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
        rb var26 = null;
        byte[] var27 = null;
        rb var29 = null;
        rb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var22 = StarCannon.field_A;
        try {
          L0: {
            if (!this.a((byte) -76, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((ue) this).field_h[param0]) {
                L1: {
                  var5_int = ((ue) this).field_b.field_i[param0];
                  var48 = ((ue) this).field_b.field_k[param0];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (null == ((ue) this).field_g[param0]) {
                    ((ue) this).field_g[param0] = new Object[((ue) this).field_b.field_j[param0]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((ue) this).field_g[param0];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
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
                                if (param3[2] != 0) {
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
                          var49 = dk.a((byte) -56, ((ue) this).field_h[param0], true);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new rb(var49);
                          var26.a(param3, var26.field_f.length, -84, 5);
                          break L5;
                        }
                      }
                      var9_array = dk.a((byte) 90, ((ue) this).field_h[param0], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = hc.a((byte) 74, var9_array);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param3 == null) {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L9;
                        } else {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L9;
                        }
                      }
                      throw sd.a((Throwable) (Object) stackIn_36_0, (stackIn_36_2 != 0) + " " + param0 + " " + param3.length + " " + mg.a(param3.length, var9_array, (byte) -69) + " " + mg.a(-2 + param3.length, var9_array, (byte) -110) + " " + ((ue) this).field_b.field_c[param0] + " " + ((ue) this).field_b.field_b);
                    }
                    L10: {
                      if (!((ue) this).field_d) {
                        break L10;
                      } else {
                        ((ue) this).field_h[param0] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (param2 < -15) {
                        break L11;
                      } else {
                        ((ue) this).field_a = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int <= 1) {
                        L13: {
                          if (var6 != null) {
                            var11 = var48[0];
                            break L13;
                          } else {
                            var11 = 0;
                            break L13;
                          }
                        }
                        if (((ue) this).field_i == 0) {
                          var7[var11] = d.a(false, (byte) 123, var51);
                          break L12;
                        } else {
                          var7[var11] = (Object) (Object) var50;
                          break L12;
                        }
                      } else {
                        if (((ue) this).field_i != 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var31 = new rb(var51);
                          var31.field_g = var11;
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L14: while (true) {
                            if (var15_int >= var12) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L15: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_g = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L17: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L18: {
                                            if (var6 != null) {
                                              var18 = var48[var17];
                                              break L18;
                                            } else {
                                              var18 = var17;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (((ue) this).field_i == 0) {
                                              var7[var18] = d.a(false, (byte) -21, var54[var17]);
                                              break L19;
                                            } else {
                                              var7[var18] = (Object) (Object) var54[var17];
                                              break L19;
                                            }
                                          }
                                          var17++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L20: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L16;
                                        } else {
                                          var18 = var18 + var31.f((byte) -100);
                                          ug.a(var51, var16, var54[var19], var53[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var53[var16]];
                                  var53[var16] = 0;
                                  var16++;
                                  continue L15;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L21: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L14;
                                } else {
                                  var16 = var16 + var31.f((byte) -79);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var29 = new rb(var51);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_g = var11;
                          var16 = 0;
                          L22: while (true) {
                            if (var12 <= var16) {
                              if (var14_int != 0) {
                                var52 = new byte[var14_int];
                                var29.field_g = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L23: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = (Object) (Object) var52;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L24: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L23;
                                      } else {
                                        L25: {
                                          var19 = var19 + var29.f((byte) -87);
                                          if (var6 != null) {
                                            var21 = var48[var20];
                                            break L25;
                                          } else {
                                            var21 = var20;
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (var21 == param1) {
                                            ug.a(var51, var17, var52, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_56_0 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L22;
                                } else {
                                  L28: {
                                    var17 = var17 + var29.f((byte) -119);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L28;
                                    } else {
                                      var19 = var48[var18];
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (var19 == param1) {
                                      var15_int = var19;
                                      var14_int = var14_int + var17;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_101_0 = 1;
                    stackIn_102_0 = stackOut_101_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var5 = decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var5;
            stackOut_103_1 = new StringBuilder().append("ue.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L30;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L30;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_106_0, stackIn_106_2 + ')');
        }
        return stackIn_102_0 != 0;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, boolean param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (this.a(param2, 122, param1)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((ue) this).field_g[param1] == null) {
                    break L2;
                  } else {
                    if (((ue) this).field_g[param1][param2] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param1, param2, -65, param0)) {
                  this.d(param1, 0);
                  if (this.a(param1, param2, -52, param0)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              if (((ue) this).field_g[param1] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((ue) this).field_g[param1][param2] == null) {
                    break L3;
                  } else {
                    var7 = dk.a((byte) -87, ((ue) this).field_g[param1][param2], false);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (1 == ((ue) this).field_i) {
                      ((ue) this).field_g[param1][param2] = null;
                      if (((ue) this).field_b.field_j[param1] != 1) {
                        break L4;
                      } else {
                        ((ue) this).field_g[param1] = null;
                        break L4;
                      }
                    } else {
                      if (((ue) this).field_i != 2) {
                        break L4;
                      } else {
                        ((ue) this).field_g[param1] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_23_0 = var5;
                stackIn_24_0 = stackOut_23_0;
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
            stackOut_25_0 = var5;
            stackOut_25_1 = new StringBuilder().append("ue.R(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + true + ')');
        }
        return (byte[]) (Object) stackIn_24_0;
    }

    final static int b(int param0, int param1) {
        if (param1 <= 118) {
            return -2;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return 6144 > param0 ? -bd.field_c[6144 - param0] : bd.field_c[param0 + -6144];
        }
        return param0 < 2048 ? bd.field_c[-param0 + 2048] : -bd.field_c[-2048 + param0];
    }

    final static i a(ue param0, byte param1, int param2, int param3, ue param4) {
        RuntimeException var5 = null;
        i stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        i stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -57) {
                break L1;
              } else {
                ue.b(-26);
                break L1;
              }
            }
            if (qb.a((byte) -106, param3, param2, param4)) {
              stackOut_5_0 = oe.a(5, param0.a(param3, true, param2));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ue.U(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((ue) this).b((byte) 120)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (((ue) this).field_b.field_j.length <= param1) {
                break L0;
              } else {
                if (0 != ((ue) this).field_b.field_j[param1]) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (gf.field_d) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    ue(ti param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((ue) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((ue) this).field_a = param0;
                    ((ue) this).field_i = param2;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ue) this).field_d = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ue.<init>(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == -9883) {
              if (((ue) this).b((byte) 108)) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((ue) this).field_b.field_l.a((byte) -117, ne.a(false, var4));
                stackOut_6_0 = ((ue) this).c(var3_int, -116);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ue.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, 116, param1)) {
            return false;
        }
        if (null != ((ue) this).field_g[param1]) {
            if (!(null == ((ue) this).field_g[param1][param2])) {
                return true;
            }
        }
        if (null != ((ue) this).field_h[param1]) {
            return true;
        }
        this.d(param1, param0 ^ -93);
        if (param0 != -93) {
            boolean discarded$0 = ((ue) this).c(-4, ((int[]) ((ue) this).field_h[0])[9]);
        }
        if (((ue) this).field_h[param1] != null) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{15, 20, 20, 10, 10};
        field_f = 500;
    }
}
