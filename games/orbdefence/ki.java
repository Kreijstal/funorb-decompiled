/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    private int field_b;
    private jl field_e;
    private boolean field_g;
    static int[] field_f;
    static String field_h;
    private Object[][] field_c;
    private Object[] field_a;
    private hd field_i;
    static String field_d;

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param2, true, param3)) {
              L1: {
                var5 = null;
                if (param0 == -2) {
                  break L1;
                } else {
                  this.field_i = (hd) (((Object[]) (this.field_a[18]))[5]);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (this.field_c[param2] == null) {
                    break L3;
                  } else {
                    if (null != this.field_c[param2][param3]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param1, -895, param2, param3)) {
                  this.a(param2, 114);
                  if (this.a(param1, -895, param2, param3)) {
                    break L2;
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              if (null != this.field_c[param2]) {
                L4: {
                  if (this.field_c[param2][param3] != null) {
                    var7 = e.a(this.field_c[param2][param3], false, 25966);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (this.field_b == 1) {
                      this.field_c[param2][param3] = null;
                      if (-2 != (this.field_i.field_l[param2] ^ -1)) {
                        break L5;
                      } else {
                        this.field_c[param2] = null;
                        break L5;
                      }
                    } else {
                      if (this.field_b == 2) {
                        this.field_c[param2] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_28_0 = var5;
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
            stackIn_31_0 = var5;

            stackIn_31_1 = new StringBuilder().append("ki.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_12_0);
          } else {
            return (byte[]) ((Object) stackIn_28_0);
          }
        }
    }

    private final synchronized void a(int param0, int param1) {
        if (!this.field_g) {
            this.field_a[param0] = fm.a(this.field_e.a(-15861, param0), 3, false);
        } else {
            this.field_a[param0] = this.field_e.a(-15861, param0);
        }
        int var3 = -85 % ((param1 - 69) / 38);
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param2 ^ 0)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_o.a(sk.a((byte) 76, var6), -76);
              if (!this.b(var4_int, -7720)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_i.field_g[var4_int].a(sk.a((byte) 76, var7), -119);
                  if (param2 == -1) {
                    break L1;
                  } else {
                    field_h = (String) (((Object[]) (this.field_a[26]))[11]);
                    break L1;
                  }
                }
                stackIn_10_0 = this.a(var5, 19115, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ki.E(");

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
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -79 % ((param0 - -5) / 55);
            if (this.b(-1)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_i.field_o.a(sk.a((byte) 76, var5), -107);
              stackIn_4_0 = this.c((byte) 118, var4);
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

            stackIn_7_1 = new StringBuilder().append("ki.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final synchronized boolean c(byte param0, int param1) {
        if (!this.b(param1, -7720)) {
            return false;
        }
        if (param0 < 93) {
            return ((boolean[]) (((Object[]) (this.field_a[4]))[3]))[1];
        }
        if (!(this.field_a[param1] == null)) {
            return true;
        }
        this.a(param1, -45);
        if (null != this.field_a[param1]) {
            return true;
        }
        return false;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, -7720)) {
            return 0;
        }
        if (!(null == this.field_a[param1])) {
            return 100;
        }
        int var3 = 91 % ((param0 - 25) / 52);
        return this.field_e.b(param1, -7362);
    }

    final int a(byte param0) {
        if (!(this.b(-1))) {
            return -1;
        }
        if (param0 <= 112) {
            return 124;
        }
        return this.field_i.field_l.length;
    }

    final int a(byte param0, int param1) {
        if (!(this.b(param1, -7720))) {
            return 0;
        }
        if (param0 < 100) {
            return 42;
        }
        return this.field_i.field_l[param1];
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -81 / ((param0 - 32) / 58);
            if (!this.b(-1)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_i.field_o.a(sk.a((byte) 76, var5), -121);
              stackIn_5_0 = this.b((byte) -53, var4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ki.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final boolean c(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
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
            if (!this.b(-1)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var4 = 125 % ((param0 - 7) / 32);
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_i.field_o.a(sk.a((byte) 76, var5), -126);
              if ((var3_int ^ -1) <= -1) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
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

            stackIn_11_1 = new StringBuilder().append("ki.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    final byte[] b(int param0, boolean param1, int param2) {
        if (param1) {
            this.field_c = (Object[][]) null;
        }
        return this.a(-2, (int[]) null, param0, param2);
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (this.b(-1)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_a.length) {
              L1: {
                if (param0 == 20147) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a((String) null, 33);
                  break L1;
                }
              }
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (0 < this.field_i.field_d[var4]) {
                var3 = var3 + this.b((byte) -93, var4);
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

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(-1)) {
              if (param1 == 1) {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_i.field_o.a(sk.a((byte) 76, var6), -80);
                if (this.b(var4_int, param1 + -7721)) {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_i.field_g[var4_int].a(sk.a((byte) 76, var7), -87);
                  stackIn_10_0 = this.b(var4_int, false, var5);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackIn_5_0 = (byte[]) null;
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
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ki.M(");

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
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != -1) {
            return true;
        }
        if (null == this.field_i) {
            this.field_i = this.field_e.a(-23879);
            if (!(null != this.field_i)) {
                return false;
            }
            this.field_c = new Object[this.field_i.field_s][];
            this.field_a = new Object[this.field_i.field_s];
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2, true, param0)) {
            return false;
        }
        if (this.field_c[param2] != null && null != this.field_c[param2][param0]) {
            return true;
        }
        if (this.field_a[param2] != null) {
            return true;
        }
        if (param1 != 19115) {
            return ((boolean[]) (this.field_a[0]))[13];
        }
        this.a(param2, -74);
        if (this.field_a[param2] != null) {
            return true;
        }
        return false;
    }

    final static boolean d(int param0) {
        if (param0 >= -92) {
            field_d = (String) null;
        }
        return ec.k(783);
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_f = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = fi.a(1, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ki.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_83_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
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
        mg var26 = null;
        byte[] var27 = null;
        mg var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        mg var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.b(param2, -7720)) {
              if (this.field_a[param2] == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_i.field_d[param2];
                  var34 = this.field_i.field_f[param2];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_c[param2]) {
                    array$0 = new Object[this.field_i.field_l[param2]];
                    this.field_c[param2] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
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
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (-1 != (param0[0] ^ -1)) {
                              break L7;
                            } else {
                              if (-1 != (param0[1] ^ -1)) {
                                break L7;
                              } else {
                                if (param0[2] != 0) {
                                  break L7;
                                } else {
                                  if (-1 == (param0[3] ^ -1)) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = e.a(this.field_a[param2], true, 25966);
                          var25 = var35;
                          var9 = var25;
                          var26 = new mg(var35);
                          var26.a(5, var26.field_j.length, false, param0);
                          break L5;
                        }
                      }
                      var9 = e.a(this.field_a[param2], false, 25966);
                      break L5;
                    }
                    if (param1 == -895) {
                      try {
                        L8: {
                          var36 = nf.a(var9, param1 ^ 895);
                          var27 = var36;
                          var23 = var27;
                          var43 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);

                          stackIn_38_1 = new StringBuilder();

                          if (param0 == null) {
                            stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                            stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                            stackIn_39_2 = 0;
                            break L9;
                          } else {
                            stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                            stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                            stackIn_39_2 = 1;
                            break L9;
                          }
                        }
                        throw dd.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + param0.length + " " + eg.a(var9, 0, param0.length) + " " + eg.a(var9, 0, param0.length + -2) + " " + this.field_i.field_r[param2] + " " + this.field_i.field_p);
                      }
                      L10: {
                        if (this.field_g) {
                          this.field_a[param2] = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (-2 <= (var5_int ^ -1)) {
                          L12: {
                            if (var6 == null) {
                              var11 = 0;
                              break L12;
                            } else {
                              var11 = var34[0];
                              break L12;
                            }
                          }
                          if (-1 != (this.field_b ^ -1)) {
                            var7[var11] = var43;
                            break L11;
                          } else {
                            var7[var11] = fm.a(var23, gi.a(param1, -894), false);
                            break L11;
                          }
                        } else {
                          if (-3 == (this.field_b ^ -1)) {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * var12 * var5_int;
                            var32 = new mg(var43);
                            var14 = 0;
                            var32.field_i = var11;
                            var15 = 0;
                            var16 = 0;
                            L13: while (true) {
                              if (var12 <= var16) {
                                if (var14 == 0) {
                                  stackIn_83_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  var44 = new byte[var14];
                                  var14 = 0;
                                  var32.field_i = var11;
                                  var17 = 0;
                                  var18 = 0;
                                  L14: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15] = var44;
                                      return true;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L15: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L14;
                                        } else {
                                          L16: {
                                            var19 = var19 + var32.l(0);
                                            if (var6 == null) {
                                              var21 = var20;
                                              break L16;
                                            } else {
                                              var21 = var34[var20];
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (param3 != var21) {
                                              break L17;
                                            } else {
                                              mk.a(var43, var17, var44, var14, var19);
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
                                      var17 = var17 + var32.l(param1 ^ -895);
                                      if (var6 == null) {
                                        var19 = var18;
                                        break L19;
                                      } else {
                                        var19 = var34[var18];
                                        break L19;
                                      }
                                    }
                                    if (var19 == param3) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      var18++;
                                      continue L18;
                                    } else {
                                      var18++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * var12 * var5_int;
                            var29 = new mg(var43);
                            var38 = new int[var5_int];
                            var30 = var38;
                            var14_ref_int__ = var30;
                            var29.field_i = var11;
                            var15 = 0;
                            L20: while (true) {
                              if (var15 >= var12) {
                                var39 = new byte[var5_int][];
                                var31 = var39;
                                var15_ref_byte____ = var31;
                                var16 = 0;
                                L21: while (true) {
                                  if (var5_int <= var16) {
                                    var29.field_i = var11;
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
                                                var18 = var34[var17];
                                                break L24;
                                              } else {
                                                var18 = var17;
                                                break L24;
                                              }
                                            }
                                            L25: {
                                              if (-1 == (this.field_b ^ -1)) {
                                                var7[var18] = fm.a(var39[var17], 3, false);
                                                break L25;
                                              } else {
                                                var7[var18] = var39[var17];
                                                break L25;
                                              }
                                            }
                                            var17++;
                                            continue L23;
                                          }
                                        }
                                      } else {
                                        var18 = 0;
                                        var19 = 0;
                                        L26: while (true) {
                                          if (var5_int <= var19) {
                                            var17++;
                                            continue L22;
                                          } else {
                                            var18 = var18 + var29.l(0);
                                            mk.a(var43, var16, var39[var19], var38[var19], var18);
                                            var16 = var16 + var18;
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var19++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    array$1 = new byte[var38[var16]];
                                    var15_ref_byte____[var16] = array$1;
                                    var38[var16] = 0;
                                    var16++;
                                    continue L21;
                                  }
                                }
                              } else {
                                var16 = 0;
                                var17 = 0;
                                L27: while (true) {
                                  if (var5_int <= var17) {
                                    var15++;
                                    continue L20;
                                  } else {
                                    var16 = var16 + var29.l(0);
                                    var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                    var17++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_103_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_33_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_22_0 = 1;
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
          L28: {
            var5 = decompiledCaughtException;
            stackIn_106_0 = (RuntimeException) (var5);

            stackIn_106_1 = new StringBuilder().append("ki.BA(");

            if (param0 == null) {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "null";
              break L28;
            } else {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "{...}";
              break L28;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_33_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_83_0 != 0;
                } else {
                  return stackIn_103_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final synchronized byte[] a(int param0, boolean param1) {
        if (!this.b(-1)) {
            return null;
        }
        if (!((this.field_i.field_l.length ^ -1) != -2)) {
            return this.b(0, false, param0);
        }
        if (!param1) {
            field_f = (int[]) (this.field_a[5]);
        }
        if (!this.b(param0, -7720)) {
            return null;
        }
        if (1 == this.field_i.field_l[param0]) {
            return this.b(param0, !param1 ? true : false, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
              if (param1 == 5187) {
                break L1;
              } else {
                this.a((byte) 121);
                break L1;
              }
            }
            if (!this.b(param2, -7720)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_g[param2].a(sk.a((byte) 76, var5), -109);
              if (this.a(param2, true, var4_int)) {
                stackIn_10_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ki.J(");

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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.b(param1 + 7719)) {
            return false;
        }
        if (param1 != -7720) {
            return true;
        }
        if (0 > param0 || this.field_i.field_l.length <= param0 || this.field_i.field_l[param0] == 0) {
            if (!rf.field_N) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.b(-1)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_i.field_o.a(sk.a((byte) 76, var4), -73);
              if (!this.b(var3_int, param1 + -7720)) {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    ((int[]) (((Object[]) (this.field_a[0]))[2]))[9] = ((int[]) (this.field_a[1]))[5];
                    break L1;
                  }
                }
                stackIn_10_0 = var3_int;
                decompiledRegionSelector0 = 2;
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
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ki.I(");

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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (this.b(-1)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_i.field_c.length) {
              if (param0 == 7715) {
                return var2 != 0;
              } else {
                return true;
              }
            } else {
              var4 = this.field_i.field_c[var3];
              if (null == this.field_a[var4]) {
                this.a(var4, param0 ^ -7726);
                if (null == this.field_a[var4]) {
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

    ki(jl param0, boolean param1, int param2) {
        this.field_i = null;
        try {
            if (-1 < (param2 ^ -1) || -3 > (param2 ^ -1)) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param2;
            this.field_g = param1 ? true : false;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(this.b(-1))) {
            return false;
        }
        if (!param1) {
            CharSequence var5 = (CharSequence) null;
            ki.a(101, (CharSequence) null);
        }
        if ((param0 ^ -1) <= -1 && 0 <= param2 && param0 < this.field_i.field_l.length && this.field_i.field_l[param0] > param2) {
            return true;
        }
        if (rf.field_N) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    static {
        int var0 = 0;
        field_h = "Create a free Account";
        field_f = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_f[var0] = 256 * (var0 / 3) + var0 / 2 * 65536 + 1 * var0;
        }
        field_d = "Logging in...";
    }
}
