/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private ps field_e;
    private Object[][] field_d;
    private Object[] field_a;
    static nf field_g;
    private ip field_h;
    private int field_b;
    private boolean field_f;
    static String field_c;

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 42)) {
            return false;
        }
        if (this.field_a[param0] != null) {
            return true;
        }
        this.a(param0, true);
        if (param1 != 0) {
            return false;
        }
        if (null != this.field_a[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (this.b((byte) 118)) {
          L0: {
            if ((param0 ^ -1) > -1) {
              break L0;
            } else {
              if (param0 >= this.field_e.field_j.length) {
                break L0;
              } else {
                if (this.field_e.field_j[param0] == 0) {
                  break L0;
                } else {
                  if (param1 == 42) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          if (ak.field_e) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
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
            if (!this.b((byte) -99)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                param2 = param2.toLowerCase();
                var6 = (CharSequence) ((Object) param0);
                var4_int = this.field_e.field_b.a(false, bg.a(var6, (byte) 120));
                if (param1 < -76) {
                  break L1;
                } else {
                  this.b(((int[]) (this.field_a[0]))[0], -77);
                  break L1;
                }
              }
              if (-1 >= (var4_int ^ -1)) {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_e.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
                if (0 > var5) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
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
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("gk.O(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.b((byte) 108))) {
            return false;
        }
        if (param1 <= 73) {
            this.field_h = (ip) null;
        }
        if ((param0 ^ -1) > -1 || (param2 ^ -1) > -1 || this.field_e.field_j.length <= param0 || param2 >= this.field_e.field_j[param0]) {
            if (!ak.field_e) {
                return false;
            }
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return true;
    }

    final synchronized boolean b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (this.b((byte) -71)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (this.field_e.field_o.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_e.field_o[var3];
              if (null == this.field_a[var4]) {
                this.a(var4, true);
                if (this.field_a[var4] == null) {
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

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -79) {
                break L1;
              } else {
                gk.c(((byte[]) (this.field_a[17]))[0]);
                break L1;
              }
            }
            if (!this.b((byte) 102)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_e.field_b.a(false, bg.a(var4, (byte) 120));
              stackIn_7_0 = this.a(var3_int, 100);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("gk.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 100) {
            return -113;
        }
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (!(this.field_a[param0] == null)) {
            return 100;
        }
        return this.field_h.b(1, param0);
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_8_0 = null;
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
            if (this.b((byte) -94)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_e.field_b.a(false, bg.a(var6, (byte) 120));
              if (this.a(var4_int, (byte) 42)) {
                if (param1 == -71) {
                  var7 = (CharSequence) ((Object) param2);
                  var5 = this.field_e.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
                  stackIn_10_0 = this.a(var4_int, param1 + -10399, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
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
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("gk.S(");

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
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final int b(int param0, int param1) {
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (param1 != 27912) {
            this.field_d = (Object[][]) (((Object[]) (this.field_a[4]))[2]);
        }
        return this.field_e.field_j[param0];
    }

    final int a(byte param0) {
        if (!(this.b((byte) -25))) {
            return -1;
        }
        if (param0 < 56) {
            this.a(((byte[]) (this.field_a[0]))[2]);
        }
        return this.field_e.field_j.length;
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 != -73) {
            field_g = (nf) null;
        }
        field_g = null;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.b(param2, 100, param1)) {
              L1: {
                var5 = null;
                if (param3 <= -44) {
                  break L1;
                } else {
                  this.b(8, 111);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (null == this.field_d[param2]) {
                    break L3;
                  } else {
                    if (this.field_d[param2][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param1, param0, param2, (byte) 40)) {
                  break L2;
                } else {
                  this.a(param2, true);
                  if (this.a(param1, param0, param2, (byte) 65)) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              if (null == this.field_d[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null != this.field_d[param2][param1]) {
                    var7 = rb.a(false, this.field_d[param2][param1], -45);
                    var5 = var7;
                    if (var7 == null) {
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
                    if ((this.field_b ^ -1) == -2) {
                      this.field_d[param2][param1] = null;
                      if (this.field_e.field_j[param2] != 1) {
                        break L5;
                      } else {
                        this.field_d[param2] = null;
                        break L5;
                      }
                    } else {
                      if (this.field_b != 2) {
                        break L5;
                      } else {
                        this.field_d[param2] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_28_0 = var5;
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
            stackIn_31_0 = var5;

            stackIn_31_1 = new StringBuilder().append("gk.E(");

            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) ((Object) stackIn_28_0);
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (param1 <= 29) {
            this.d(-108, ((int[]) (((Object[]) (((Object[]) (this.field_a[22]))[3]))[0]))[3]);
        }
        if (!this.b(param2, 113, param0)) {
            return false;
        }
        if (this.field_d[param2] != null && this.field_d[param2][param0] != null) {
            return true;
        }
        if (null != this.field_a[param2]) {
            return true;
        }
        this.a(param2, true);
        if (null == this.field_a[param2]) {
            return false;
        }
        return true;
    }

    private final synchronized void a(int param0, boolean param1) {
        byte[] discarded$0 = null;
        if (this.field_f) {
            this.field_a[param0] = this.field_h.a(param0, 2);
        } else {
            this.field_a[param0] = sf.a(false, -137, this.field_h.a(param0, 2));
        }
        if (!param1) {
            int[] var4 = (int[]) null;
            discarded$0 = this.a((int[]) null, -97, -90, -106);
        }
    }

    final synchronized boolean b(byte param0) {
        if (this.field_e == null) {
            this.field_e = this.field_h.a(true);
            if (!(null != this.field_e)) {
                return false;
            }
            this.field_a = new Object[this.field_e.field_l];
            this.field_d = new Object[this.field_e.field_l][];
        }
        int var2 = -122 % ((param0 - 37) / 44);
        return true;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (!this.b((byte) -37)) {
          return 0;
        } else {
          var2 = -90 / ((24 - param0) / 63);
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= this.field_a.length) {
              if (-1 != (var3 ^ -1)) {
                var5 = var4 * 100 / var3;
                return var5;
              } else {
                return 100;
              }
            } else {
              if ((this.field_e.field_k[var5] ^ -1) < -1) {
                var4 = var4 + this.a(var5, 100);
                var3 += 100;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final int b(String param0, int param1) {
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
            if (!this.b((byte) -42)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_e.field_b.a(false, bg.a(var4, (byte) 120));
              if (param1 == 0) {
                if (!this.a(var3_int, (byte) 42)) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_6_0 = ((int[]) (this.field_a[5]))[9];
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

            stackIn_13_1 = new StringBuilder().append("gk.AA(");

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
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
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

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
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
            if (this.b((byte) -81)) {
              param0 = param0.toLowerCase();
              var3_int = 68 / ((param1 - 64) / 52);
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_e.field_b.a(false, bg.a(var5, (byte) 120));
              if ((var4 ^ -1) > -1) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("gk.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
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
        int stackIn_66_0 = 0;
        int stackIn_105_0 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
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
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param2, (byte) 42)) {
              if (this.field_a[param2] == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_e.field_k[param2];
                  var34 = this.field_e.field_q[param2];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_d[param2]) {
                    array$0 = new Object[this.field_e.field_j[param2]];
                    this.field_d[param2] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_d[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = var34[var9_int];
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
                            if (param1[0] != 0) {
                              break L7;
                            } else {
                              if (-1 != (param1[1] ^ -1)) {
                                break L7;
                              } else {
                                if (0 != param1[2]) {
                                  break L7;
                                } else {
                                  if (0 != param1[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = rb.a(true, this.field_a[param2], -62);
                          var25 = var35;
                          var9 = var25;
                          var26 = new rb(var35);
                          var26.a(5, param1, 1515088773, var26.field_f.length);
                          break L5;
                        }
                      }
                      var9 = rb.a(false, this.field_a[param2], -84);
                      break L5;
                    }
                    if (param3 > 3) {
                      try {
                        L8: {
                          var36 = pn.a(var9, 0);
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

                          if (param1 == null) {
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
                        throw pn.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + param1.length + " " + lj.a(-124, var9, param1.length) + " " + lj.a(-118, var9, param1.length + -2) + " " + this.field_e.field_g[param2] + " " + this.field_e.field_t);
                      }
                      L10: {
                        if (this.field_f) {
                          this.field_a[param2] = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if ((var5_int ^ -1) < -2) {
                          if (-3 != (this.field_b ^ -1)) {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - var5_int * var12 * 4;
                            var31 = new rb(var43);
                            var39 = new int[var5_int];
                            var32 = var39;
                            var14 = var32;
                            var31.field_g = var11;
                            var15_int = 0;
                            L12: while (true) {
                              if (var12 <= var15_int) {
                                var40 = new byte[var5_int][];
                                var33 = var40;
                                var15 = var33;
                                var16 = 0;
                                L13: while (true) {
                                  if (var5_int <= var16) {
                                    var31.field_g = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L14: while (true) {
                                      if (var12 <= var17) {
                                        var17 = 0;
                                        L15: while (true) {
                                          if (var5_int <= var17) {
                                            break L11;
                                          } else {
                                            L16: {
                                              if (var6 == null) {
                                                var18 = var17;
                                                break L16;
                                              } else {
                                                var18 = var34[var17];
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              if (-1 == (this.field_b ^ -1)) {
                                                var7[var18] = sf.a(false, -137, var40[var17]);
                                                break L17;
                                              } else {
                                                var7[var18] = var40[var17];
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
                                            var18 = var18 + var31.a((byte) 109);
                                            au.a(var43, var16, var40[var19], var39[var19], var18);
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
                                  if (var5_int <= var17) {
                                    var15_int++;
                                    continue L12;
                                  } else {
                                    var16 = var16 + var31.a((byte) 122);
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
                            var11 = var11 - var12 * (var5_int * 4);
                            var29 = new rb(var43);
                            var14_int = 0;
                            var15_int = 0;
                            var29.field_g = var11;
                            var16 = 0;
                            L20: while (true) {
                              if (var12 <= var16) {
                                if (var14_int == 0) {
                                  stackIn_66_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  var44 = new byte[var14_int];
                                  var29.field_g = var11;
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
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L21;
                                        } else {
                                          L23: {
                                            var19 = var19 + var29.a((byte) 118);
                                            if (var6 == null) {
                                              var21 = var20;
                                              break L23;
                                            } else {
                                              var21 = var34[var20];
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (var21 == param0) {
                                              au.a(var43, var17, var44, var14_int, var19);
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
                                      var17 = var17 + var29.a((byte) 115);
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
                            if (var6 != null) {
                              var11 = var34[0];
                              break L28;
                            } else {
                              var11 = 0;
                              break L28;
                            }
                          }
                          if (this.field_b != 0) {
                            var7[var11] = var43;
                            break L11;
                          } else {
                            var7[var11] = sf.a(false, -137, var36);
                            return true;
                          }
                        }
                      }
                      stackIn_105_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_33_0 = 1;
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
          L29: {
            var5 = decompiledCaughtException;
            stackIn_108_0 = (RuntimeException) (var5);

            stackIn_108_1 = new StringBuilder().append("gk.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackIn_109_2 = "null";
              break L29;
            } else {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackIn_109_2 = "{...}";
              break L29;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_109_0), stackIn_109_2 + ',' + param2 + ',' + param3 + ')');
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
                  return stackIn_66_0 != 0;
                } else {
                  return stackIn_105_0 != 0;
                }
              }
            }
          }
        }
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.b((byte) 100)) {
            return null;
        }
        if (!(1 != this.field_e.field_j.length)) {
            return this.a(0, -10470, param0);
        }
        if (!this.a(param0, (byte) 42)) {
            return null;
        }
        if (!(param1 != (this.field_e.field_j[param0] ^ -1))) {
            return this.a(param0, param1 ^ 10468, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
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
            if (this.b((byte) 114)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_e.field_b.a(false, bg.a(var6, (byte) 120));
              if (this.a(var4_int, (byte) 42)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_e.field_r[var4_int].a(param1, bg.a(var7, (byte) 120));
                stackIn_7_0 = this.a(var5, (byte) 40, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gk.U(");

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
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -10470) {
            return (byte[]) null;
        }
        return this.a((int[]) null, param2, param0, -53);
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (!this.a(param1, (byte) 42)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 < -26) {
                  break L1;
                } else {
                  ((int[]) (this.field_a[2]))[0] = -26;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var5 = (CharSequence) ((Object) param2);
              var4_int = this.field_e.field_r[param1].a(false, bg.a(var5, (byte) 120));
              if (!this.b(param1, 91, var4_int)) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("gk.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    gk(ip param0, boolean param1, int param2) {
        this.field_e = null;
        try {
            if (0 > param2 || param2 > 2) {
                throw new IllegalArgumentException("");
            }
            this.field_h = param0;
            this.field_f = param1 ? true : false;
            this.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(String param0, int param1) {
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
            if (!this.b((byte) 106)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == -14012) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_e.field_b.a(false, bg.a(var4, (byte) 120));
                stackIn_8_0 = this.c(var3_int, 0);
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

            stackIn_11_1 = new StringBuilder().append("gk.H(");

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
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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

    static {
        field_g = new nf();
        field_c = "Loading sound effects";
    }
}
