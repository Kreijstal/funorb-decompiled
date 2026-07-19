/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static boolean field_g;
    private kl field_d;
    int field_c;
    private Object[] field_e;
    private Object[][] field_a;
    static int field_h;
    boolean field_b;
    static sj field_f;
    private ow field_i;

    final static void b(int param0) {
        int discarded$0 = 0;
        nv.field_N = new tf();
        if (param0 != -1) {
            discarded$0 = sj.a(4, 10, (byte) -102);
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.d(-80)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                var7 = (CharSequence) ((Object) param0);
                var4_int = this.field_d.field_q.a(tf.a(true, var7), param2 + -33);
                if (param2 == -10) {
                  break L1;
                } else {
                  var6 = (String) null;
                  discarded$2 = this.a(((byte[]) (this.field_e[3]))[2], (String) null, -100);
                  break L1;
                }
              }
              if (this.a((byte) -58, var4_int)) {
                var8 = (CharSequence) ((Object) param1);
                var5 = this.field_d.field_s[var4_int].a(tf.a(true, var8), -67);
                stackOut_8_0 = this.a(var5, 125, var4_int);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("sj.R(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (!(this.a(param2, param0, true))) {
            return false;
        }
        if (this.field_a[param2] != null) {
            if (!(null == this.field_a[param2][param0])) {
                return true;
            }
        }
        if (null != this.field_e[param2]) {
            return true;
        }
        if (param1 < 36) {
            discarded$0 = this.a(false, (String) (this.field_e[4]));
        }
        this.a(param2, (byte) 41);
        if (this.field_e[param2] != null) {
            return true;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 >= -83) {
            sj.a(0.31954155933475825, (byte) 102, 1.241292563355284, 0.9239833289377695);
        }
        field_f = null;
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (this.d(-64)) {
          L0: {
            var2 = 1;
            if (!param0) {
              break L0;
            } else {
              this.field_d = (kl) null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (this.field_d.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_d.field_b[var3];
              if (this.field_e[var4] == null) {
                this.a(var4, (byte) 38);
                if (null == this.field_e[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, boolean param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_11_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_d = (kl) null;
                break L1;
              }
            }
            if (this.a(param0, param3, param2)) {
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_a[param0] == null) {
                    break L3;
                  } else {
                    if (null == this.field_a[param0][param3]) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param0, param1, param3, 2)) {
                  break L2;
                } else {
                  this.a(param0, (byte) 86);
                  if (this.a(param0, param1, param3, 2)) {
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              if (this.field_a[param0] == null) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (this.field_a[param0][param3] == null) {
                    break L4;
                  } else {
                    var7 = lg.a(this.field_a[param0][param3], false, 18828);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (-2 != (this.field_c ^ -1)) {
                      if (-3 != (this.field_c ^ -1)) {
                        break L5;
                      } else {
                        this.field_a[param0] = null;
                        break L5;
                      }
                    } else {
                      this.field_a[param0][param3] = null;
                      if (-2 != (this.field_d.field_e[param0] ^ -1)) {
                        break L5;
                      } else {
                        this.field_a[param0] = null;
                        break L5;
                      }
                    }
                  }
                }
                stackOut_24_0 = var5;
                stackIn_25_0 = stackOut_24_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = var5;
            stackOut_26_1 = new StringBuilder().append("sj.N(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_11_0);
        } else {
          return (byte[]) ((Object) stackIn_25_0);
        }
    }

    private final synchronized void a(int param0, byte param1) {
        boolean discarded$0 = false;
        if (this.field_b) {
            this.field_e[param0] = this.field_i.b(param0, 4);
        } else {
            this.field_e[param0] = cq.a(this.field_i.b(param0, 4), false, 136);
        }
        if (param1 < 31) {
            discarded$0 = this.b(-52, ((int[]) (this.field_e[5]))[1]);
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
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
        byte[] stackOut_8_0 = null;
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
            L1: {
              if (param2 > 2) {
                break L1;
              } else {
                sj.c(((int[]) (this.field_e[10]))[0]);
                break L1;
              }
            }
            if (this.d(-118)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_d.field_q.a(tf.a(true, var6), -73);
              if (this.a((byte) -70, var4_int)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_d.field_s[var4_int].a(tf.a(true, var7), -128);
                stackOut_8_0 = this.b(var4_int, -32669, var5);
                stackIn_9_0 = stackOut_8_0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("sj.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        byte[] discarded$0 = null;
        if (!param2) {
            discarded$0 = this.a((String) (((Object[]) (this.field_e[6]))[2]), (String) (((Object[]) (this.field_e[5]))[6]), ((int[]) (((Object[]) (this.field_e[0]))[8]))[7]);
        }
        if (!this.d(-88)) {
            return false;
        }
        if (0 <= param0) {
            if (-1 >= (param1 ^ -1)) {
                if (param0 < this.field_d.field_e.length) {
                    if (param1 < this.field_d.field_e[param0]) {
                        return true;
                    }
                }
            }
        }
        if (rf.field_a) {
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
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
        try {
          L0: {
            if (this.d(-121)) {
              L1: {
                if (param1 <= -46) {
                  break L1;
                } else {
                  ((long[]) (this.field_e[9]))[5] = -51L;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_d.field_q.a(tf.a(true, var4), -108);
              if (var3_int >= 0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("sj.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (!this.a((byte) -40, param0)) {
            return null;
        }
        if (param1 != 4) {
            return (int[]) null;
        }
        int[] var3 = this.field_d.field_r[param0];
        if (!(var3 != null)) {
            var6 = new int[this.field_d.field_i[param0]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!(this.d(-78))) {
            return false;
        }
        int var3 = 38 % ((22 - param0) / 62);
        if (-1 >= (param1 ^ -1)) {
            if (this.field_d.field_e.length > param1) {
                if (-1 != (this.field_d.field_e[param1] ^ -1)) {
                    return true;
                }
            }
        }
        if (!rf.field_a) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.d(param0 + -56)) {
            return null;
        }
        if (this.field_d.field_e.length == 1) {
            return this.b(0, -32669, param1);
        }
        if (!this.a((byte) 112, param1)) {
            return null;
        }
        if (param0 != 0) {
            return (byte[]) null;
        }
        if (!(this.field_d.field_e[param1] != 1)) {
            return this.b(param1, param0 + -32669, 0);
        }
        throw new RuntimeException();
    }

    final byte[] b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param1 != -32669) {
            discarded$0 = this.a(((boolean[]) (this.field_e[17]))[4], -120);
        }
        return this.a(param0, (int[]) null, true, param2);
    }

    final int a(int param0) {
        if (param0 <= 79) {
            ((Object[]) (this.field_e[5]))[0] = (Object) null;
        }
        if (!(this.d(-111))) {
            return -1;
        }
        return this.field_d.field_e.length;
    }

    final synchronized boolean d(int param0) {
        if (param0 >= -29) {
            return ((boolean[]) (this.field_e[1]))[1];
        }
        if (null != this.field_d) {
            return true;
        }
        this.field_d = this.field_i.a(-24854);
        if (null == this.field_d) {
            return false;
        }
        this.field_a = new Object[this.field_d.field_d][];
        this.field_e = new Object[this.field_d.field_d];
        return true;
    }

    final synchronized boolean b(int param0, int param1) {
        int discarded$0 = 0;
        if (!this.d(-107)) {
            return false;
        }
        if (this.field_d.field_e.length == 1) {
            return this.a(param0, 44, 0);
        }
        if (!(this.a((byte) 107, param0))) {
            return false;
        }
        if (!(1 != this.field_d.field_e[param0])) {
            return this.a(0, 66, param0);
        }
        if (param1 < 108) {
            discarded$0 = this.a((String) null, ((int[]) (this.field_e[0]))[5]);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, byte param1) {
        if (!(this.a((byte) -104, param0))) {
            return 0;
        }
        if (!(this.field_e[param0] == null)) {
            return 100;
        }
        if (param1 != 56) {
            return -55;
        }
        return this.field_i.a(6999, param0);
    }

    final int a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
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
            if (!this.a((byte) -108, param2)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_d.field_s[param2].a(tf.a(true, var5), -78);
              if (!this.a(param2, var4_int, true)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 <= -63) {
                    break L1;
                  } else {
                    this.field_i = (ow) null;
                    break L1;
                  }
                }
                stackOut_10_0 = var4_int;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("sj.G(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final boolean a(boolean param0, String param1) {
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
        int decompiledRegionSelector0 = 0;
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
            if (this.d(-56)) {
              param1 = param1.toLowerCase();
              if (!param0) {
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_d.field_q.a(tf.a(true, var4), -123);
                stackOut_6_0 = this.b((byte) 20, var3_int);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
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
            if (!this.d(-100)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_d.field_q.a(tf.a(true, var4), -66);
              if (this.a((byte) 115, var3_int)) {
                if (param1 == -1) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = ((int[]) (this.field_e[2]))[0];
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("sj.Q(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final synchronized int e(int param0) {
        boolean discarded$2 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (param0 == -8185) {
            break L0;
          } else {
            discarded$2 = this.b(-94, -79);
            break L0;
          }
        }
        if (this.d(param0 + 8092)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (this.field_e.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > (this.field_d.field_i[var4] ^ -1)) {
                var3 = var3 + this.b(var4, (byte) 56);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(double param0, byte param1, double param2, double param3) {
        wm.field_C = wm.field_C + param2;
        if (param1 <= 125) {
            field_g = false;
        }
        cq.field_f = cq.field_f + param0;
        la.field_d = la.field_d + 8.0 * param3;
        if (848.0 > la.field_d) {
            la.field_d = 848.0;
        }
        if (2048.0 < la.field_d) {
            la.field_d = 2048.0;
        }
        if (!(!pb.field_B)) {
            return;
        }
        int var7 = 81920 / hw.field_i - 320;
        int var8 = 61440 / hw.field_i - 240;
        int var9 = 896 - var7;
        int var10 = -var8 + 1344;
        if ((double)var8 > cq.field_f) {
            cq.field_f = (double)var8;
        }
        if (wm.field_C < (double)var7) {
            wm.field_C = (double)var7;
        }
        if (!(cq.field_f <= (double)var10)) {
            cq.field_f = (double)var10;
        }
        if (!(wm.field_C <= (double)var9)) {
            wm.field_C = (double)var9;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 <= -71) {
                break L1;
              } else {
                field_f = (sj) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = uq.field_c;
            L2: while (true) {
              if (eq.field_c.length <= var3_int) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = dk.field_g[var3_int];
                  if (var5 >= 0) {
                    var6 = ud.a(10, eq.field_c[var3_int], true);
                    var7 = -(var6 >> 758025377) + ta.field_A;
                    var4 = var4 + aj.field_a;
                    if (!ec.a(-eb.field_d + var7, param1, param0, (byte) -124, var4, var6 - -(eb.field_d << 308571105), nr.field_j + (pr.field_d << -497123871))) {
                      var4 = var4 + ((pr.field_d << -678301567) + aj.field_a + nr.field_j);
                      break L3;
                    } else {
                      stackOut_8_0 = var5;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var4 = var4 + la.field_c;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "sj.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    final int a(boolean param0, int param1) {
        boolean discarded$0 = false;
        if (!(this.a((byte) 87, param1))) {
            return 0;
        }
        if (!param0) {
            discarded$0 = this.a(-87, ((int[]) (this.field_e[5]))[0], -96);
        }
        return this.field_d.field_e[param1];
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
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
        iw var26 = null;
        byte[] var27 = null;
        iw var29 = null;
        iw var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_61_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var22 = Kickabout.field_G;
        try {
          L0: {
            if (this.a((byte) 91, param0)) {
              if (null != this.field_e[param0]) {
                L1: {
                  if (param3 == 2) {
                    break L1;
                  } else {
                    field_g = ((boolean[]) (this.field_e[1]))[1];
                    break L1;
                  }
                }
                L2: {
                  var5_int = this.field_d.field_i[param0];
                  var34 = this.field_d.field_r[param0];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_a[param0]) {
                    array$2 = new Object[this.field_d.field_e[param0]];
                    this.field_a[param0] = array$2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7 = this.field_a[param0];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    if (var9_int >= var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L5;
                        } else {
                          var10 = var34[var9_int];
                          break L5;
                        }
                      }
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L3;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L6: {
                      L7: {
                        if (param1 == null) {
                          break L7;
                        } else {
                          L8: {
                            if (0 != param1[0]) {
                              break L8;
                            } else {
                              if (param1[1] != 0) {
                                break L8;
                              } else {
                                if (-1 != (param1[2] ^ -1)) {
                                  break L8;
                                } else {
                                  if (-1 != (param1[3] ^ -1)) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = lg.a(this.field_e[param0], true, 18828);
                          var25 = var35;
                          var9_array = var25;
                          var26 = new iw(var35);
                          var26.a(var26.field_f.length, param1, true, 5);
                          break L6;
                        }
                      }
                      var9_array = lg.a(this.field_e[param0], false, param3 + 18826);
                      break L6;
                    }
                    try {
                      L9: {
                        var36 = hh.a(var9_array, (byte) -3);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param1 == null) {
                          stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L10;
                        } else {
                          stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L10;
                        }
                      }
                      throw nb.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param0 + " " + param1.length + " " + er.a(false, param1.length, var9_array) + " " + er.a(false, param1.length - 2, var9_array) + " " + this.field_d.field_c[param0] + " " + this.field_d.field_g);
                    }
                    L11: {
                      if (!this.field_b) {
                        break L11;
                      } else {
                        this.field_e[param0] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int > 1) {
                        if ((this.field_c ^ -1) != -3) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var31 = new iw(var43);
                          var31.field_n = var11;
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L13: while (true) {
                            if (var15_int >= var12) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_n = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var34[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (this.field_c != 0) {
                                              var7[var18] = var40[var17];
                                              break L18;
                                            } else {
                                              var7[var18] = cq.a(var40[var17], false, ek.b(param3, 138));
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.k(4);
                                          dv.a(var43, var16, var40[var19], var39[var19], var18);
                                          var14[var19] = var14[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$3 = new byte[var39[var16]];
                                  var15[var16] = array$3;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.k(4);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var5_int * var12 * 4;
                          var29 = new iw(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_n = var11;
                          var16 = 0;
                          L21: while (true) {
                            if (var12 <= var16) {
                              if (-1 == (var14_int ^ -1)) {
                                stackOut_60_0 = 1;
                                stackIn_61_0 = stackOut_60_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14_int];
                                var14_int = 0;
                                var29.field_n = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = var44;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.k(4);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var34[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (var21 != param2) {
                                            break L25;
                                          } else {
                                            dv.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.k(4);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var34[var18];
                                      break L27;
                                    }
                                  }
                                  if (param2 == var19) {
                                    var15_int = var19;
                                    var14_int = var14_int + var17;
                                    var18++;
                                    continue L26;
                                  } else {
                                    var18++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L28;
                          } else {
                            var11 = 0;
                            break L28;
                          }
                        }
                        if (this.field_c == 0) {
                          var7[var11] = cq.a(var43, false, 136);
                          break L12;
                        } else {
                          var7[var11] = var36;
                          return true;
                        }
                      }
                    }
                    stackOut_98_0 = 1;
                    stackIn_99_0 = stackOut_98_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var5);
            stackOut_100_1 = new StringBuilder().append("sj.AA(").append(param0).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L29;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L29;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_61_0 != 0;
              } else {
                return stackIn_99_0 != 0;
              }
            }
          }
        }
    }

    final synchronized boolean b(byte param0, int param1) {
        boolean discarded$0 = false;
        if (!this.a((byte) 97, param1)) {
            return false;
        }
        if (param0 != 20) {
            String var4 = (String) null;
            discarded$0 = this.a((String) null, (String) null, (byte) 110);
        }
        if (this.field_e[param1] != null) {
            return true;
        }
        this.a(param1, (byte) 35);
        if (this.field_e[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(String param0, int param1) {
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
        int decompiledRegionSelector0 = 0;
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
            if (!this.d(-124)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -16248) {
                  break L1;
                } else {
                  this.field_b = true;
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_d.field_q.a(tf.a(true, var4), -105);
              stackOut_6_0 = this.b(var3_int, (byte) 56);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("sj.H(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    sj(ow param0, boolean param1, int param2) {
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
        this.field_d = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -3) {
                  L2: {
                    this.field_c = param2;
                    this.field_i = param0;
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
                  ((sj) (this)).field_b = stackIn_7_1 != 0;
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("sj.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = false;
        field_h = 4;
    }
}
