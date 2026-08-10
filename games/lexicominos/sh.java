/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(81)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if (param1 == -89) {
                if (!this.b(var3_int, 127)) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_6_0 = -87;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("sh.V(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -27493) {
            field_e = -77;
        }
        return this.a((int[]) null, (byte) 101, param0, param2);
    }

    final synchronized boolean c(int param0) {
        if (!(null != this.field_g)) {
            this.field_g = this.field_h.a(false);
            if (!(this.field_g != null)) {
                return false;
            }
            this.field_j = new Object[this.field_g.field_d];
            this.field_b = new Object[this.field_g.field_d][];
        }
        int var2 = -54 % ((21 - param0) / 52);
        return true;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
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
            if (this.b(param2, 127)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -27964) {
                  break L1;
                } else {
                  this.field_c = 26;
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, var5));
              if (this.a(true, param2, var4_int)) {
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("sh.D(");

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
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(true, param0, param2))) {
            return false;
        }
        if (null != this.field_b[param0] && null != this.field_b[param0][param2]) {
            return true;
        }
        if (!(null == this.field_j[param0])) {
            return true;
        }
        this.a(param0, true);
        if (null != this.field_j[param0]) {
            return true;
        }
        if (param1 != 78) {
            sh.d((String) (this.field_j[7]), (byte) -115);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        if (!(this.c(-54))) {
            return -1;
        }
        int var2 = 30 % ((-72 - param0) / 54);
        return this.field_g.field_a.length;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 109) {
                break L1;
              } else {
                this.field_i = false;
                break L1;
              }
            }
            if (this.c(-41)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              stackIn_6_0 = this.b((byte) -113, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("sh.N(");

            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            field_d = (nj[]) null;
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        boolean discarded$0 = false;
        Object stackIn_4_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
        try {
          L0: {
            L1: {
              if (param1 == 101) {
                break L1;
              } else {
                var7 = (int[]) null;
                discarded$0 = this.a(69, ((int[]) (this.field_j[2]))[7], (int[]) null, 35);
                break L1;
              }
            }
            if (this.a(true, param2, param3)) {
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_b[param2]) {
                    break L3;
                  } else {
                    if (null != this.field_b[param2][param3]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param2, 80, param0, param3)) {
                  this.a(param2, true);
                  if (this.a(param2, 124, param0, param3)) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (null == this.field_b[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (this.field_b[param2][param3] != null) {
                    var8 = nl.a(this.field_b[param2][param3], (byte) -74, false);
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
                    if (1 != this.field_c) {
                      if (-3 != (this.field_c ^ -1)) {
                        break L5;
                      } else {
                        this.field_b[param2] = null;
                        break L5;
                      }
                    } else {
                      this.field_b[param2][param3] = null;
                      if (-2 != (this.field_g.field_a[param2] ^ -1)) {
                        break L5;
                      } else {
                        this.field_b[param2] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_29_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("sh.W(");

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
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          return (byte[]) ((Object) stackIn_29_0);
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.b(param1, 126))) {
            return false;
        }
        if (!(null == this.field_j[param1])) {
            return true;
        }
        this.a(param1, true);
        if (!(null == this.field_j[param1])) {
            return true;
        }
        if (param0 != 5) {
            return ((boolean[]) (this.field_j[4]))[1];
        }
        return false;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (this.field_i) {
            this.field_j[param0] = this.field_h.a(param0, param1);
        } else {
            this.field_j[param0] = ri.a(136, this.field_h.a(param0, param1), false);
        }
        if (!param1) {
            field_f = ((int[]) (((Object[]) (this.field_j[13]))[1]))[8];
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(param1 ^ 10842)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
              if (param1 == 10762) {
                stackIn_8_0 = this.c(5, var3_int);
                decompiledRegionSelector0 = 2;
                break L0;
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("sh.B(");

            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, 126)) {
            return 0;
        }
        if (param0 > -79) {
            return ((int[]) (this.field_j[0]))[9];
        }
        if (null != this.field_j[param1]) {
            return 100;
        }
        return this.field_h.a(param1, 1215);
    }

    final synchronized boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(121)) {
          return false;
        } else {
          var2 = 1;
          var3 = 39 % ((-47 - param0) / 62);
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_g.field_f.length) {
              return var2 != 0;
            } else {
              var5 = this.field_g.field_f[var4];
              if (this.field_j[var5] == null) {
                this.a(var5, true);
                if (null == this.field_j[var5]) {
                  var2 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.c(param0 + -250)) {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 127) {
                  break L1;
                } else {
                  ((long[]) (this.field_j[9]))[2] = ((long[]) (this.field_j[0]))[1];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_b.a(-20075, na.a(param0 ^ 1048703, var6));
              if (this.b(var4_int, 127)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_c[var4_int].a(-20075, na.a(param0 + 1048449, var7));
                stackIn_9_0 = this.a(var4_int, -27493, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("sh.R(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.c(125)) {
            return null;
        }
        if (-2 == (this.field_g.field_a.length ^ -1)) {
            return this.a(0, -27493, param0);
        }
        if (!this.b(param0, 127)) {
            return null;
        }
        if (!((this.field_g.field_a[param0] ^ -1) != -2)) {
            return this.a(param0, -27493, 0);
        }
        int var3 = 81 / ((param1 - -44) / 43);
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(-98)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            if (!param0) {
              break L0;
            } else {
              this.field_j[1] = (Object) null;
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (this.field_j.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > (this.field_g.field_m[var4] ^ -1)) {
                var3 = var3 + this.b((byte) -98, var4);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(-118)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  field_a = ((int[]) (((Object[]) (this.field_j[2]))[2]))[0];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_b.a(-20075, na.a(param2 ^ -1048577, var6));
              if (!this.b(var4_int, 126)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_c[var4_int].a(-20075, na.a(1048576, var7));
                stackIn_11_0 = this.a(var4_int, (byte) 78, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("sh.J(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -113) {
                break L1;
              } else {
                this.c(71, ((int[]) (this.field_j[23]))[0]);
                break L1;
              }
            }
            if (!this.c(85)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if ((var3_int ^ -1) <= -1) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("sh.S(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.c(101)) {
          return false;
        } else {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (this.field_g.field_a.length <= param0) {
                break L0;
              } else {
                if (this.field_g.field_a[param0] == 0) {
                  break L0;
                } else {
                  if (param1 >= 125) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          if (!oc.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!this.c(-94)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if (this.field_g.field_a.length <= param1) {
                  break L0;
                } else {
                  if (this.field_g.field_a[param1] <= param2) {
                    break L0;
                  } else {
                    if (param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          if (oc.field_b) {
            throw new IllegalArgumentException(param1 + " " + param2);
          } else {
            return false;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_86_0 = 0;
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
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wf var27 = null;
        byte[] var28 = null;
        wf var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        wf var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.b(param0, 126)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_j[param0]) {
                L1: {
                  var5_int = this.field_g.field_m[param0];
                  var35 = this.field_g.field_n[param0];
                  var25 = var35;
                  var6 = var25;
                  if (this.field_b[param0] != null) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_g.field_a[param0]];
                    this.field_b[param0] = array$0;
                    break L1;
                  }
                }
                var7 = this.field_b[param0];
                var8 = -4 % ((param1 - 17) / 39);
                var9 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var10_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var11 = var10_int;
                          break L4;
                        } else {
                          var11 = var35[var10_int];
                          break L4;
                        }
                      }
                      if (var7[var11] != null) {
                        var10_int++;
                        continue L2;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var9 != 0) {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param2[0]) {
                              break L7;
                            } else {
                              if (param2[1] != 0) {
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
                          var36 = nl.a(this.field_j[param0], (byte) -74, true);
                          var26 = var36;
                          var10 = var26;
                          var27 = new wf(var36);
                          var27.a(4, var27.field_j.length, 5, param2);
                          break L5;
                        }
                      }
                      var10 = nl.a(this.field_j[param0], (byte) -74, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var37 = qk.a(65, var10);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackIn_34_0 = (RuntimeException) (var12_ref_RuntimeException);

                        stackIn_34_1 = new StringBuilder();

                        if (param2 == null) {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 0;
                          break L9;
                        } else {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 1;
                          break L9;
                        }
                      }
                      throw ld.a((Throwable) ((Object) stackIn_35_0), (stackIn_35_2 != 0) + " " + param0 + " " + var10.length + " " + oe.a(88, var10, var10.length) + " " + oe.a(-91, var10, -2 + var10.length) + " " + this.field_g.field_r[param0] + " " + this.field_g.field_i);
                    }
                    L10: {
                      if (this.field_i) {
                        this.field_j[param0] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (this.field_c == 2) {
                          var12 = var37.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - var5_int * var13 * 4;
                          var33 = new wf(var44);
                          var15 = 0;
                          var16 = 0;
                          var33.field_h = var12;
                          var17 = 0;
                          L12: while (true) {
                            if (var13 <= var17) {
                              if (var15 == 0) {
                                stackIn_86_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var45 = new byte[var15];
                                var15 = 0;
                                var33.field_h = var12;
                                var18 = 0;
                                var19 = 0;
                                L13: while (true) {
                                  if (var19 >= var13) {
                                    var7[var16] = var45;
                                    break L11;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (var21 >= var5_int) {
                                        var19++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var20 = var20 + var33.d((byte) 19);
                                          if (var6 != null) {
                                            var22 = var35[var21];
                                            break L15;
                                          } else {
                                            var22 = var21;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param3 != var22) {
                                            break L16;
                                          } else {
                                            o.a(var44, var18, var45, var15, var20);
                                            var15 = var15 + var20;
                                            break L16;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L17: while (true) {
                                if (var5_int <= var19) {
                                  var17++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var18 = var18 + var33.d((byte) 19);
                                    if (var6 == null) {
                                      var20 = var19;
                                      break L18;
                                    } else {
                                      var20 = var35[var19];
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var20 == param3) {
                                      var16 = var20;
                                      var15 = var15 + var18;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var19++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var37.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - 4 * (var13 * var5_int);
                          var30 = new wf(var44);
                          var30.field_h = var12;
                          var39 = new int[var5_int];
                          var31 = var39;
                          var15_ref_int__ = var31;
                          var16 = 0;
                          L20: while (true) {
                            if (var13 <= var16) {
                              var40 = new byte[var5_int][];
                              var32 = var40;
                              var16_ref_byte____ = var32;
                              var17 = 0;
                              L21: while (true) {
                                if (var5_int <= var17) {
                                  var30.field_h = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var18 >= var13) {
                                      var18 = 0;
                                      L23: while (true) {
                                        if (var18 >= var5_int) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var19 = var35[var18];
                                              break L24;
                                            } else {
                                              var19 = var18;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (this.field_c == 0) {
                                              var7[var19] = ri.a(136, var40[var18], false);
                                              break L25;
                                            } else {
                                              var7[var19] = var40[var18];
                                              break L25;
                                            }
                                          }
                                          var18++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L26: while (true) {
                                        if (var5_int <= var20) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          var19 = var19 + var30.d((byte) 19);
                                          o.a(var44, var17, var40[var20], var39[var20], var19);
                                          var17 = var17 + var19;
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var20++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var17]];
                                  var16_ref_byte____[var17] = array$1;
                                  var39[var17] = 0;
                                  var17++;
                                  continue L21;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L20;
                                } else {
                                  var17 = var17 + var30.d((byte) 19);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var12 = var35[0];
                            break L28;
                          } else {
                            var12 = 0;
                            break L28;
                          }
                        }
                        if (this.field_c != 0) {
                          var7[var12] = var44;
                          break L11;
                        } else {
                          var7[var12] = ri.a(136, var37, false);
                          return true;
                        }
                      }
                    }
                    stackIn_100_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var5);

            stackIn_103_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_86_0 != 0;
              } else {
                return stackIn_100_0 != 0;
              }
            }
          }
        }
    }

    sh(hf param0, boolean param1, int param2) {
        this.field_g = null;
        try {
            if (-1 < (param2 ^ -1) || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param1 ? true : false;
            this.field_c = param2;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == 50) {
                break L1;
              } else {
                field_a = -22;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= param0.length()) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (hi.a(18670, (char) var3)) {
                    break L3;
                  } else {
                    if (!ne.a((byte) 94, (char) var3)) {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("sh.O(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 92 % ((70 - param0) / 40);
        if (!this.b(param1, 126)) {
            return 0;
        }
        return this.field_g.field_a[param1];
    }

    static {
        field_f = 0;
        field_e = 0;
    }
}
