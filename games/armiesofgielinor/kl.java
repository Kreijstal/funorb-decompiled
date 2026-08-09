/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private ew field_g;
    private jm field_j;
    int field_e;
    boolean field_b;
    static sa field_k;
    private Object[] field_h;
    static String field_d;
    static String field_f;
    static v field_a;
    static volatile int field_i;

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        if (this.a((byte) 82)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_h.length) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (this.field_j.field_p[var4] > 0) {
                var3 = var3 + this.b(var4, (byte) 73);
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

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        String var7 = null;
        byte[] var8 = null;
        try {
          L0: {
            if (this.b(param3, 0, param2)) {
              L1: {
                if (param1 >= 113) {
                  break L1;
                } else {
                  var7 = (String) null;
                  this.a(((byte[]) (this.field_h[1]))[1], (String) null);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_c[param3]) {
                    break L3;
                  } else {
                    if (this.field_c[param3][param2] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param2, 0, param0, param3)) {
                  break L2;
                } else {
                  this.a(true, param3);
                  if (this.a(param2, 0, param0, param3)) {
                    break L2;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (null != this.field_c[param3]) {
                L4: {
                  if (null != this.field_c[param3][param2]) {
                    var8 = ko.a(false, 80, this.field_c[param3][param2]);
                    var5 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (this.field_e == 1) {
                      this.field_c[param3][param2] = null;
                      if (this.field_j.field_h[param3] == 1) {
                        this.field_c[param3] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      if (this.field_e == 2) {
                        this.field_c[param3] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_29_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("kl.T(");

            if (param0 == null) {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_11_0);
          } else {
            return (byte[]) ((Object) stackIn_29_0);
          }
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 82)) {
              L1: {
                if (param0 == 28979) {
                  break L1;
                } else {
                  field_a = (v) (this.field_h[6]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
              stackIn_6_0 = this.a(param0 + -17085, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kl.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) 82)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_j.field_l.a(rs.a((byte) -116, var6), 1);
              if (!this.c(var4_int, -24876)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 <= -51) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_j.field_f[var4_int].a(rs.a((byte) -116, var7), 1);
                  stackIn_12_0 = this.a(var4_int, var5, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = ((boolean[]) (this.field_h[13]))[11];
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("kl.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final synchronized byte[] c(int param0, byte param1) {
        if (!this.a((byte) 82)) {
            return null;
        }
        if (param1 != 81) {
            this.a(21, 79);
        }
        if (!(this.field_j.field_h.length != 1)) {
            return this.a((byte) 99, param0, 0);
        }
        if (!this.c(param0, param1 ^ -24955)) {
            return null;
        }
        if (!(1 != this.field_j.field_h[param0])) {
            return this.a((byte) 94, 0, param0);
        }
        throw new RuntimeException();
    }

    final int e(int param0) {
        if (!(this.a((byte) 82))) {
            return -1;
        }
        if (param0 >= -96) {
            kl.b(52);
        }
        return this.field_j.field_h.length;
    }

    final synchronized int[] b(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > -24) {
            ((int[]) (this.field_h[0]))[43] = ((int[]) (((Object[]) (((Object[]) (this.field_h[0]))[13]))[2]))[6];
        }
        if (!this.c(param1, -24876)) {
            return null;
        }
        int[] var3 = this.field_j.field_a[param1];
        if (!(var3 != null)) {
            var6 = new int[this.field_j.field_p[param1]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.a((byte) 82))) {
            return false;
        }
        if (param1 != 0) {
            this.field_e = -128;
        }
        if ((param0 ^ -1) <= -1 && -1 >= (param2 ^ -1) && this.field_j.field_h.length > param0 && this.field_j.field_h[param0] > param2) {
            return true;
        }
        if (wh.field_f) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = -33 % ((param1 - 33) / 62);
        if (2 > param2) {
            if (5 > param0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) 82)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 >= 89) {
                  break L1;
                } else {
                  field_f = (String) (((Object[]) (this.field_h[9]))[6]);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
              if (!this.c(var3_int, -24876)) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kl.O(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.c(param1, param0 + -36770)) {
            return false;
        }
        if (this.field_h[param1] != null) {
            return true;
        }
        if (param0 != 11894) {
            field_d = (String) (((Object[]) (((Object[]) (this.field_h[8]))[7]))[5]);
        }
        this.a(true, param1);
        if (this.field_h[param1] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param0, param2, param1)) {
            return false;
        }
        if (null != this.field_c[param0] && this.field_c[param0][param1] != null) {
            return true;
        }
        if (null != this.field_h[param0]) {
            return true;
        }
        this.a(true, param0);
        if (null != this.field_h[param0]) {
            return true;
        }
        return false;
    }

    final synchronized boolean d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.a((byte) 82)) {
          L0: {
            var2 = 1;
            if (param0 == -27927) {
              break L0;
            } else {
              kl.c(((int[]) (this.field_h[1]))[2], 24, 50);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (this.field_j.field_q.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_j.field_q[var3];
              if (this.field_h[var4] == null) {
                this.a(true, var4);
                if (null == this.field_h[var4]) {
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

    private final synchronized boolean c(int param0, int param1) {
        if (param1 != -24876) {
            return true;
        }
        if (!this.a((byte) 82)) {
            return false;
        }
        if ((param0 ^ -1) <= -1 && param0 < this.field_j.field_h.length && this.field_j.field_h[param0] != 0) {
            return true;
        }
        if (!wh.field_f) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 82) {
            this.a(-110);
        }
        if (null != this.field_j) {
            return true;
        }
        this.field_j = this.field_g.a(param0 ^ 20097);
        if (!(null != this.field_j)) {
            return false;
        }
        this.field_c = new Object[this.field_j.field_i][];
        this.field_h = new Object[this.field_j.field_i];
        return true;
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) 82)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              if (param0 <= -127) {
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
                if (0 <= var3_int) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("kl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final int a(byte param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -107 % ((76 - param0) / 40);
            if (!this.c(param1, -24876)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var5 = this.field_j.field_f[param1].a(rs.a((byte) -116, var6), 1);
              if (this.b(param1, 0, var5)) {
                stackIn_8_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("kl.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              var1_int = sm.field_d;
              var2 = ko.field_b;
              if (param0 == -20193) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (tr.field_A ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_5_0;
              if (ro.field_ub != 1) {
                stackIn_8_0 = 0;
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L3;
              }
            }
            var4 = stackIn_8_0;
            st.field_z.a(87, var4 != 0, var3 != 0, var1_int, var2, el.field_d);
            L4: while (true) {
              if (!jd.i((byte) -61)) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L5: {
                  if (13 != rs.field_q) {
                    break L5;
                  } else {
                    bv.a(true, 0, param0 + 20194, jt.field_a);
                    break L5;
                  }
                }
                L6: {
                  if (12 == rs.field_q) {
                    L7: {
                      if (ln.field_e) {
                        stackIn_17_0 = 0;
                        break L7;
                      } else {
                        stackIn_17_0 = 1;
                        break L7;
                      }
                    }
                    ln.field_e = stackIn_17_0 != 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (rs.field_q != 11) {
                  continue L4;
                } else {
                  if (hi.field_j >= 2) {
                    L8: {
                      if (jv.field_a) {
                        stackIn_24_0 = 0;
                        break L8;
                      } else {
                        stackIn_24_0 = 1;
                        break L8;
                      }
                    }
                    jv.field_a = stackIn_24_0 != 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "kl.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 82)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = 119 % ((param1 - -36) / 44);
              var7 = (CharSequence) ((Object) param2);
              var5 = this.field_j.field_l.a(rs.a((byte) -116, var7), 1);
              if (this.c(var5, -24876)) {
                var8 = (CharSequence) ((Object) param0);
                var6 = this.field_j.field_f[var5].a(rs.a((byte) -116, var8), 1);
                stackIn_7_0 = this.a((byte) 119, var6, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("kl.DA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.a((byte) 82)) {
            return false;
        }
        if (param1 != -56) {
            field_d = (String) null;
        }
        if (1 == this.field_j.field_h.length) {
            return this.a(0, param0, 0);
        }
        if (!this.c(param0, param1 ^ 24860)) {
            return false;
        }
        if (!(-2 != (this.field_j.field_h[param0] ^ -1))) {
            return this.a(param0, 0, param1 + 56);
        }
        throw new RuntimeException();
    }

    final int d(int param0, int param1) {
        if (param1 != -2) {
            return -27;
        }
        if (!this.c(param0, -24876)) {
            return 0;
        }
        return this.field_j.field_h[param0];
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 <= 42) {
            return (byte[]) null;
        }
        return this.a((int[]) null, 116, param1, param2);
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_61_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
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
        vh var26 = null;
        byte[] var27 = null;
        vh var29 = null;
        vh var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.c(param3, -24876)) {
              if (null == this.field_h[param3]) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_j.field_p[param3];
                  var34 = this.field_j.field_a[param3];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_c[param3] != null) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_j.field_h[param3]];
                    this.field_c[param3] = array$0;
                    break L1;
                  }
                }
                var7 = this.field_c[param3];
                var8 = 1;
                var9_int = param1;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var34[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param2[1]) {
                                break L7;
                              } else {
                                if (param2[2] != 0) {
                                  break L7;
                                } else {
                                  if (param2[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = ko.a(true, 42, this.field_h[param3]);
                          var25 = var35;
                          var9 = var25;
                          var26 = new vh(var35);
                          var26.a(param2, var26.field_o.length, 5, -12366);
                          break L5;
                        }
                      }
                      var9 = ko.a(false, 87, this.field_h[param3]);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = el.a(false, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_33_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_33_1 = new StringBuilder();

                        if (param2 == null) {
                          stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                          stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                          stackIn_34_2 = 0;
                          break L9;
                        } else {
                          stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                          stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                          stackIn_34_2 = 1;
                          break L9;
                        }
                      }
                      throw ig.a((Throwable) ((Object) stackIn_34_0), (stackIn_34_2 != 0) + " " + param3 + " " + var9.length + " " + pk.a(var9, var9.length, 113) + " " + pk.a(var9, -2 + var9.length, 115) + " " + this.field_j.field_e[param3] + " " + this.field_j.field_s);
                    }
                    L10: {
                      if (this.field_b) {
                        this.field_h[param3] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (-2 > (var5_int ^ -1)) {
                        if (-3 != (this.field_e ^ -1)) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var31 = new vh(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_q = var11;
                          var15_int = 0;
                          L12: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L13: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_q = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L14: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L15: while (true) {
                                        if (var17 >= var5_int) {
                                          break L11;
                                        } else {
                                          L16: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L16;
                                            } else {
                                              var18 = var17;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (0 != this.field_e) {
                                              var7[var18] = var40[var17];
                                              break L17;
                                            } else {
                                              var7[var18] = pf.a(param1 + 0, var40[var17], false);
                                              break L17;
                                            }
                                          }
                                          var17++;
                                          continue L15;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L18: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L14;
                                        } else {
                                          var18 = var18 + var31.i(1);
                                          vm.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L13;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L12;
                                } else {
                                  var16 = var16 + var31.i(param1 + 1);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var12 * var5_int * 4;
                          var29 = new vh(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_q = var11;
                          var16 = 0;
                          L20: while (true) {
                            if (var16 >= var12) {
                              if (0 == var14_int) {
                                stackIn_61_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14_int];
                                var29.field_q = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L21: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L22: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L21;
                                      } else {
                                        L23: {
                                          var19 = var19 + var29.i(param1 ^ 1);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L23;
                                          } else {
                                            var21 = var20;
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (var21 == param0) {
                                            vm.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L24;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L25: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L20;
                                } else {
                                  L26: {
                                    var17 = var17 + var29.i(1);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L26;
                                    } else {
                                      var19 = var18;
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (param0 == var19) {
                                      var14_int = var14_int + var17;
                                      var15_int = var19;
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  var18++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 == null) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = var34[0];
                            break L28;
                          }
                        }
                        if (-1 == (this.field_e ^ -1)) {
                          var7[var11] = pf.a(0, var43, false);
                          break L11;
                        } else {
                          var7[var11] = var36;
                          return true;
                        }
                      }
                    }
                    stackIn_100_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_20_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var5);

            stackIn_103_1 = new StringBuilder().append("kl.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L29;
            } else {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L29;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_61_0 != 0;
              } else {
                return stackIn_100_0 != 0;
              }
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 98 % ((param1 - 39) / 43);
            if (this.a((byte) 82)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_j.field_l.a(rs.a((byte) -116, var5), 1);
              stackIn_4_0 = this.b(var4, (byte) 73);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kl.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    kl(ew param0, boolean param1, int param2) {
        this.field_j = null;
        try {
            if ((param2 ^ -1) > -1 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_g = param0;
            this.field_b = param1 ? true : false;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b(int param0, byte param1) {
        if (!(this.c(param0, -24876))) {
            return 0;
        }
        if (this.field_h[param0] != null) {
            return 100;
        }
        if (param1 != 73) {
            kl.b(-64);
        }
        return this.field_g.b(5926, param0);
    }

    private final synchronized void a(boolean param0, int param1) {
        if (!param0) {
            this.field_h = (Object[]) (this.field_h[2]);
        }
        if (!this.field_b) {
            this.field_h[param1] = pf.a(0, this.field_g.a(param1, 4), false);
        } else {
            this.field_h[param1] = this.field_g.a(param1, 4);
        }
    }

    static {
        field_k = new sa();
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_i = -1;
    }
}
