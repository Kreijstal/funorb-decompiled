/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static bi field_f;
    static int[] field_e;
    private mn field_b;
    private rk field_c;
    static long field_d;
    static double[] field_a;

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (!param0) {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_7_0 = ug.a(var3, 194);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (param2 instanceof qf) {
                  var4 = (qf) (param2);
                  stackIn_13_0 = var4.a(87);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L1: {
                    if (param1 == 6) {
                      break L1;
                    } else {
                      field_e = (int[]) null;
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                }
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
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("vb.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final static void b(byte param0) {
        if (!(fd.field_j)) {
            throw new IllegalStateException();
        }
        qf.field_g = true;
        if (param0 < 104) {
            vb.a((byte) -90, '￘');
        }
        aa.a((byte) -118, false);
        rk.field_e = 0;
    }

    final rk b(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        rk var4 = null;
        Object stackIn_5_0 = null;
        rk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_b.field_a.field_h;
                break L1;
              }
            }
            if (this.field_b.field_a != var3) {
              L2: {
                this.field_c = var3.field_h;
                if (param1 == 6) {
                  break L2;
                } else {
                  var4 = (rk) null;
                  this.a((rk) null, 28);
                  break L2;
                }
              }
              stackIn_9_0 = (rk) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_c = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("vb.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rk) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final rk a(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        rk stackIn_10_0 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                this.field_c = (rk) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = this.field_b.field_a.field_a;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (var3 == this.field_b.field_a) {
              this.field_c = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_c = var3.field_a;
              stackIn_10_0 = (rk) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("vb.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rk) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ld.a((byte) -21, param1)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = gk.field_y;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    L2: {
                      if (param0 == -37) {
                        break L2;
                      } else {
                        vb.b((byte) -35);
                        break L2;
                      }
                    }
                    var7 = pa.field_d;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L3: while (true) {
                      if (var7.length <= var8) {
                        stackIn_25_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (var4 != param1) {
                          var8++;
                          continue L3;
                        } else {
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if ((var4 ^ -1) != (param1 ^ -1)) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vb.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    final rk c(int param0) {
        rk var2 = this.field_b.field_a.field_a;
        if (var2 == this.field_b.field_a) {
            this.field_c = null;
            return null;
        }
        if (param0 != 7) {
            return (rk) null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    vb(mn param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final rk a(byte param0) {
        if (param0 != 120) {
            vb.b((byte) -33);
        }
        rk var2 = this.field_b.field_a.field_h;
        if (this.field_b.field_a == var2) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 8) {
            field_d = -115L;
        }
        field_a = null;
        field_e = null;
    }

    final rk a(int param0) {
        if (param0 != 0) {
            field_d = -121L;
        }
        rk var2 = this.field_c;
        if (this.field_b.field_a == var2) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final rk b(int param0) {
        int var2 = -88 % ((param0 - 17) / 35);
        rk var3 = this.field_c;
        if (var3 == this.field_b.field_a) {
            this.field_c = null;
            return null;
        }
        this.field_c = var3.field_h;
        return var3;
    }

    static {
        field_e = new int[1024];
        field_a = new double[]{6.0, 6.0, 7.0, 8.0, 6.0, 4.0, 5.0, 6.0, 5.5, 6.0, 7.0, 6.0, 5.0, 6.0, 6.0, 8.0, 5.0, 8.0, 8.0, 6.0, 10.0, 9.0, 8.0, 7.0, 7.0};
    }
}
