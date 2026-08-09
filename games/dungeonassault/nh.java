/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_i;
    private boolean field_d;
    static String field_a;
    private qa field_f;
    private Object[] field_j;
    private Object[][] field_c;
    private int field_g;
    static boolean field_e;
    private tm field_h;
    static String field_b;
    static int field_k;

    final boolean a(boolean param0, String param1) {
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
            if (!this.a(-14354)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_h.field_a.a(to.a(123, var4), -117);
                stackIn_8_0 = this.a(param0, var3_int);
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

            stackIn_11_1 = new StringBuilder().append("nh.E(").append(param0).append(',');

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
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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

    private final synchronized void d(int param0, int param1) {
        if (!this.field_d) {
            this.field_j[param0] = kj.a(false, false, this.field_f.a(param0, -7249));
        } else {
            this.field_j[param0] = this.field_f.a(param0, -7249);
        }
        if (param1 != -23889) {
            this.a(false, -26);
        }
    }

    final synchronized boolean a(int param0) {
        if (this.field_h == null) {
            this.field_h = this.field_f.a(param0 + 40892);
            if (!(this.field_h != null)) {
                return false;
            }
            this.field_j = new Object[this.field_h.field_l];
            this.field_c = new Object[this.field_h.field_l][];
        }
        if (param0 != -14354) {
            this.a(((int[]) (this.field_j[21]))[0], 48, -75);
            return true;
        }
        return true;
    }

    final static void c(boolean param0) {
        if (!param0) {
            field_a = (String) null;
        }
        cd.field_f = new rg();
        ta.field_a.b(1, cd.field_f);
    }

    final static void a(byte param0, nh param1, mb param2, int param3) {
        hh.field_b = eg.c(1) * param3 / 1000;
        ac.a((byte) -125, param1);
        kd.a(31913, param1);
        ob.a((byte) -53, param1);
        ck.e((byte) 65);
        hn.d((byte) -117);
        if (param0 >= -67) {
            return;
        }
        try {
            nl.field_d = -hh.field_b + 0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "nh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (!this.e(-1, param0)) {
            return 0;
        }
        if (param1 != 0) {
            ((byte[]) (((Object[]) (this.field_j[3]))[14]))[11] = (byte) 119;
        }
        return this.field_h.field_i[param0];
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.a(-14354)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_h.field_a.a(to.a(param1 ^ 122, var4), -125);
              if (param1 <= var3_int) {
                stackIn_7_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("nh.Q(");

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
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.a(param1 ^ 14353)) {
              param0 = param0.toLowerCase();
              if (param1 == -1) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_h.field_a.a(to.a(115, var4), -119);
                stackIn_7_0 = this.c(param1 ^ 123, var3_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ((int[]) (this.field_j[1]))[0];
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
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("nh.A(");

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
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        try {
          L0: {
            var5_int = -116 / ((-47 - param2) / 63);
            if (this.a(param3, param1, (byte) -119)) {
              L1: {
                L2: {
                  var6 = null;
                  if (this.field_c[param1] == null) {
                    break L2;
                  } else {
                    if (this.field_c[param1][param3] != null) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param0, param3, param1, -12028)) {
                  this.d(param1, -23889);
                  if (this.a(param0, param3, param1, -12028)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_c[param1] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != this.field_c[param1][param3]) {
                    var8 = dn.a(this.field_c[param1][param3], false, (byte) 48);
                    var6 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    if (this.field_g == 1) {
                      this.field_c[param1][param3] = null;
                      if ((this.field_h.field_i[param1] ^ -1) == -2) {
                        this.field_c[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (2 == this.field_g) {
                        this.field_c[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_28_0 = var6;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("nh.AA(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) ((Object) stackIn_28_0);
    }

    final boolean b(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param2 + -14272)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -82) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.b((String) null, (String) null, (byte) 88);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var7 = (CharSequence) ((Object) param1);
              var4_int = this.field_h.field_a.a(to.a(121, var7), -120);
              if ((var4_int ^ -1) > -1) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = (CharSequence) ((Object) param0);
                var5 = this.field_h.field_n[var4_int].a(to.a(121, var8), -126);
                if (0 <= var5) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
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
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("nh.BA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 != 2) {
            field_b = (String) (this.field_j[5]);
        }
        if (!this.a(param0, param2, (byte) -122)) {
            return false;
        }
        if (null != this.field_c[param2]) {
            if (!(this.field_c[param2][param0] == null)) {
                return true;
            }
        }
        if (null != this.field_j[param2]) {
            return true;
        }
        this.d(param2, -23889);
        if (null != this.field_j[param2]) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.e(-1, param1)) {
            return false;
        }
        if (null != this.field_j[param1]) {
            return true;
        }
        this.d(param1, -23889);
        if (param0) {
            return false;
        }
        if (null != this.field_j[param1]) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
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
            if (this.a(param0 ^ 3479)) {
              L1: {
                if (param0 == -13703) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a(110, (String) null, 85);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var4_int = this.field_h.field_a.a(to.a(115, var7), -121);
              if (this.e(param0 + 13702, var4_int)) {
                var8 = (CharSequence) ((Object) param1);
                var5 = this.field_h.field_n[var4_int].a(to.a(117, var8), -117);
                stackIn_9_0 = this.a(var5, 2, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("nh.R(").append(param0).append(',');

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
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
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

    final synchronized byte[] a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
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
            if (this.a(-14354)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 < -106) {
                  break L1;
                } else {
                  this.field_j = (Object[]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_h.field_a.a(to.a(116, var6), -121);
              if (this.e(-1, var4_int)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_h.field_n[var4_int].a(to.a(118, var7), -124);
                stackIn_9_0 = this.b(5, var4_int, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = null;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("nh.O(");

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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        if (this.a(param0 ^ -14454)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_j.length) {
              if (var2 != 0) {
                var4 = param0 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (this.field_h.field_k[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + this.c(-126, var4);
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
            if (this.a(-14354)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_h.field_a.a(to.a(118, var4), param1 + -1119);
              if (!this.e(param1 ^ -1001, var3_int)) {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 == 1000) {
                    break L1;
                  } else {
                    nh.c(true);
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

            stackIn_13_1 = new StringBuilder().append("nh.D(");

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
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
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

    final synchronized int c(int param0, int param1) {
        int var3 = -122 % ((param0 - -67) / 52);
        if (!this.e(-1, param1)) {
            return 0;
        }
        if (this.field_j[param1] != null) {
            return 100;
        }
        return this.field_f.b(param1, 27318);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
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
        ec var26 = null;
        byte[] var27 = null;
        ec var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ec var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = DungeonAssault.field_K;
        try {
          L0: {
            if (this.e(-1, param2)) {
              if (this.field_j[param2] != null) {
                L1: {
                  var5_int = this.field_h.field_k[param2];
                  var34 = this.field_h.field_m[param2];
                  var24 = var34;
                  var6 = var24;
                  if (null != this.field_c[param2]) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_h.field_i[param2]];
                    this.field_c[param2] = array$0;
                    break L1;
                  }
                }
                var7 = this.field_c[param2];
                var8 = 1;
                if (param3 == -12028) {
                  var9_int = 0;
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
                        if (var7[var10] == null) {
                          var8 = 0;
                          break L3;
                        } else {
                          var9_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var8 != 0) {
                      stackIn_24_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L5: {
                        L6: {
                          if (param0 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (0 != param0[0]) {
                                break L7;
                              } else {
                                if (param0[1] != 0) {
                                  break L7;
                                } else {
                                  if (0 != param0[2]) {
                                    break L7;
                                  } else {
                                    if (param0[3] == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var35 = dn.a(this.field_j[param2], true, (byte) 48);
                            var25 = var35;
                            var9 = var25;
                            var26 = new ec(var35);
                            var26.a(var26.field_m.length, param0, 5, -10708);
                            break L5;
                          }
                        }
                        var9 = dn.a(this.field_j[param2], false, (byte) 48);
                        break L5;
                      }
                      try {
                        L8: {
                          var36 = lc.a(var9, 50166);
                          var27 = var36;
                          var23 = var27;
                          var43 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackIn_37_0 = (RuntimeException) (var11_ref_RuntimeException);

                          stackIn_37_1 = new StringBuilder();

                          if (param0 == null) {
                            stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                            stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                            stackIn_38_2 = 0;
                            break L9;
                          } else {
                            stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                            stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                            stackIn_38_2 = 1;
                            break L9;
                          }
                        }
                        throw vk.a((Throwable) ((Object) stackIn_38_0), (stackIn_38_2 != 0) + " " + param2 + " " + param0.length + " " + qh.a(16777215, var9, param0.length) + " " + qh.a(16777215, var9, -2 + param0.length) + " " + this.field_h.field_q[param2] + " " + this.field_h.field_f);
                      }
                      L10: {
                        if (!this.field_d) {
                          break L10;
                        } else {
                          this.field_j[param2] = null;
                          break L10;
                        }
                      }
                      L11: {
                        if (var5_int > 1) {
                          if ((this.field_g ^ -1) == -3) {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * (var12 * var5_int);
                            var32 = new ec(var43);
                            var14 = 0;
                            var32.field_o = var11;
                            var15 = 0;
                            var16 = 0;
                            L12: while (true) {
                              if (var12 <= var16) {
                                if (-1 == (var14 ^ -1)) {
                                  stackIn_87_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  var44 = new byte[var14];
                                  var32.field_o = var11;
                                  var14 = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L13: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15] = var44;
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
                                            var19 = var19 + var32.h(-35);
                                            if (var6 == null) {
                                              var21 = var20;
                                              break L15;
                                            } else {
                                              var21 = var34[var20];
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            if (param1 == var21) {
                                              cj.a(var43, var17, var44, var14, var19);
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
                                      var17 = var17 + var32.h(param3 ^ 11905);
                                      if (var6 == null) {
                                        var19 = var18;
                                        break L18;
                                      } else {
                                        var19 = var34[var18];
                                        break L18;
                                      }
                                    }
                                    if (var19 == param1) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      var18++;
                                      continue L17;
                                    } else {
                                      var18++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - var5_int * var12 * 4;
                            var29 = new ec(var43);
                            var38 = new int[var5_int];
                            var30 = var38;
                            var14_ref_int__ = var30;
                            var29.field_o = var11;
                            var15 = 0;
                            L19: while (true) {
                              if (var12 <= var15) {
                                var39 = new byte[var5_int][];
                                var31 = var39;
                                var15_ref_byte____ = var31;
                                var16 = 0;
                                L20: while (true) {
                                  if (var5_int <= var16) {
                                    var29.field_o = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L21: while (true) {
                                      if (var17 >= var12) {
                                        var17 = 0;
                                        L22: while (true) {
                                          if (var17 >= var5_int) {
                                            break L11;
                                          } else {
                                            L23: {
                                              if (var6 == null) {
                                                var18 = var17;
                                                break L23;
                                              } else {
                                                var18 = var34[var17];
                                                break L23;
                                              }
                                            }
                                            L24: {
                                              if (-1 != (this.field_g ^ -1)) {
                                                var7[var18] = var39[var17];
                                                break L24;
                                              } else {
                                                var7[var18] = kj.a(false, false, var39[var17]);
                                                break L24;
                                              }
                                            }
                                            var17++;
                                            continue L22;
                                          }
                                        }
                                      } else {
                                        var18 = 0;
                                        var19 = 0;
                                        L25: while (true) {
                                          if (var5_int <= var19) {
                                            var17++;
                                            continue L21;
                                          } else {
                                            var18 = var18 + var29.h(-117);
                                            cj.a(var43, var16, var39[var19], var38[var19], var18);
                                            var16 = var16 + var18;
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var19++;
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    array$1 = new byte[var38[var16]];
                                    var15_ref_byte____[var16] = array$1;
                                    var38[var16] = 0;
                                    var16++;
                                    continue L20;
                                  }
                                }
                              } else {
                                var16 = 0;
                                var17 = 0;
                                L26: while (true) {
                                  if (var5_int <= var17) {
                                    var15++;
                                    continue L19;
                                  } else {
                                    var16 = var16 + var29.h(-121);
                                    var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                    var17++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L27: {
                            if (var6 != null) {
                              var11 = var34[0];
                              break L27;
                            } else {
                              var11 = 0;
                              break L27;
                            }
                          }
                          if (0 != this.field_g) {
                            var7[var11] = var43;
                            break L11;
                          } else {
                            var7[var11] = kj.a(false, false, var36);
                            return true;
                          }
                        }
                      }
                      stackIn_102_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackIn_11_0 = ((boolean[]) (((Object[]) (((Object[]) (this.field_j[0]))[0]))[7]))[13];
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_105_0 = (RuntimeException) (var5);

            stackIn_105_1 = new StringBuilder().append("nh.F(");

            if (param0 == null) {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "null";
              break L28;
            } else {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "{...}";
              break L28;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_87_0 != 0;
                } else {
                  return stackIn_102_0 != 0;
                }
              }
            }
          }
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param0 != 5) {
            field_b = (String) null;
        }
        return this.a((int[]) null, param1, (byte) 76, param2);
    }

    final int b(boolean param0) {
        if (!param0) {
            this.a(((int[]) (this.field_j[3]))[0], 56);
        }
        if (!(this.a(-14354))) {
            return -1;
        }
        return this.field_h.field_i.length;
    }

    private final synchronized boolean e(int param0, int param1) {
        if (!this.a(-14354)) {
            return false;
        }
        if ((param1 ^ -1) <= param0 && param1 < this.field_h.field_i.length && this.field_h.field_i[param1] != 0) {
            return true;
        }
        if (!ro.field_u) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        if (this.a(-14354)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (this.field_h.field_j.length <= var3) {
              L1: {
                if (param0 == 59) {
                  break L1;
                } else {
                  this.a(((int[]) (this.field_j[5]))[0], -79);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_h.field_j[var3];
              if (null == this.field_j[var4]) {
                this.d(var4, param0 ^ -23916);
                if (this.field_j[var4] == null) {
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

    final synchronized byte[] a(int param0, int param1) {
        if (!this.a(param0 ^ 8699)) {
            return null;
        }
        if (1 == this.field_h.field_i.length) {
            return this.b(param0 + 6640, 0, param1);
        }
        if (!this.e(-1, param1)) {
            return null;
        }
        if (!(-2 != (this.field_h.field_i[param1] ^ -1))) {
            return this.b(5, param1, 0);
        }
        if (param0 != -6635) {
            this.field_j[3] = this.field_j[3];
        }
        throw new RuntimeException();
    }

    nh(qa param0, boolean param1, int param2) {
        this.field_h = null;
        try {
            if (-1 < (param2 ^ -1) || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_f = param0;
            this.field_d = param1 ? true : false;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(-14354)) {
            return false;
        }
        if ((param1 ^ -1) > -1 || -1 < (param0 ^ -1) || this.field_h.field_i.length <= param1 || this.field_h.field_i[param1] <= param0) {
            if (!ro.field_u) {
                return false;
            }
            throw new IllegalArgumentException(param1 + " " + param0);
        }
        if (param2 >= -100) {
            this.a((String) (this.field_j[1]), -34);
            return true;
        }
        return true;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
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
            if (param0 == 0) {
              if (this.e(-1, param2)) {
                param1 = param1.toLowerCase();
                var5 = (CharSequence) ((Object) param1);
                var4_int = this.field_h.field_n[param2].a(to.a(121, var5), -125);
                if (this.a(var4_int, param2, (byte) -109)) {
                  stackIn_10_0 = var4_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 42;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("nh.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    static {
        field_i = "<%0> active";
        field_a = "There is nothing in this room to trouble a party of raiders.";
        field_b = "Raider was detected by guardian, which alerted the monsters of the dungeon.";
    }
}
