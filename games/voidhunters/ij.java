/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    ksa field_a;
    private ksa field_b;

    final ksa a(boolean param0) {
        ksa var2;
        var2 = this.field_a.field_c;
        if (this.field_a != var2) {
          if (!param0) {
            return (ksa) null;
          } else {
            var2.b(-3846);
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa[] f(int param0) {
        int incrementValue$1 = 0;
        ksa[] var2;
        int var3;
        ksa var4;
        int var5;
        ksa[] var6;
        var5 = VoidHunters.field_G;
        var6 = new ksa[this.c(3)];
        var2 = var6;
        if (param0 != -4872) {
          return (ksa[]) null;
        } else {
          var3 = 0;
          var4 = this.field_a.field_c;
          L0: while (true) {
            if (var4 == this.field_a) {
              return var2;
            } else {
              incrementValue$1 = var3;
              var3++;
              var6[incrementValue$1] = var4;
              var4 = var4.field_c;
              continue L0;
            }
          }
        }
    }

    final ksa a(int param0, ksa param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ksa stackIn_10_0 = null;
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
              if (param1 == null) {
                var3 = this.field_a.field_c;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 == 3) {
                break L2;
              } else {
                this.c(111);
                break L2;
              }
            }
            if (var3 == this.field_a) {
              this.field_b = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_c;
              stackIn_10_0 = (ksa) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ij.J(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ksa) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final ksa c(byte param0) {
        ksa var2;
        ksa var3;
        if (param0 < -102) {
          var2 = this.field_a.field_a;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.b(-3846);
            return var2;
          }
        } else {
          var3 = (ksa) null;
          this.a((ksa) null, (byte) -49);
          var2 = this.field_a.field_a;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.b(-3846);
            return var2;
          }
        }
    }

    final void b(int param0, ksa param1) {
        try {
            if (param0 != -10258) {
                this.e(-27);
            }
            if (param1.field_a != null) {
                param1.b(-3846);
            }
            param1.field_a = this.field_a.field_a;
            param1.field_c = this.field_a;
            param1.field_a.field_c = param1;
            param1.field_c.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ij.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        ksa var2;
        int var3;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          var2 = this.field_a.field_c;
          if (this.field_a == var2) {
            if (param0 < 89) {
              this.field_a = (ksa) null;
              this.field_b = null;
              return;
            } else {
              this.field_b = null;
              return;
            }
          } else {
            var2.b(-3846);
            continue L0;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 60 % ((59 - param0) / 37);
        return this.field_a.field_c == this.field_a ? true : false;
    }

    final void a(ksa param0, byte param1) {
        if (null != param0.field_a) {
            param0.b(-3846);
        }
        param0.field_c = this.field_a.field_c;
        param0.field_a = this.field_a;
        param0.field_a.field_c = param0;
        if (param1 != -55) {
            return;
        }
        try {
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ij.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ksa a(byte param0) {
        ksa var2;
        if (param0 > 6) {
          var2 = this.field_b;
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_c;
            return var2;
          }
        } else {
          return (ksa) null;
        }
    }

    final static int a(byte[] param0, int param1, int param2, String param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -10388) {
              var4_int = param2;
              var5 = param3.length();
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var6 >= var5) {
                    break L2;
                  } else {
                    L3: {
                      var7 = mwa.a(param3.charAt(var6), -89);
                      if ((var5 ^ -1) < (var6 + 1 ^ -1)) {
                        stackIn_9_0 = mwa.a(param3.charAt(1 + var6), -23);
                        break L3;
                      } else {
                        stackIn_9_0 = -1;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_9_0;
                      if (var6 - -2 < var5) {
                        stackIn_12_0 = mwa.a(param3.charAt(2 + var6), -103);
                        break L4;
                      } else {
                        stackIn_12_0 = -1;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_12_0;
                      if (3 + var6 >= var5) {
                        stackIn_15_0 = -1;
                        break L5;
                      } else {
                        stackIn_15_0 = mwa.a(param3.charAt(var6 + 3), -84);
                        break L5;
                      }
                    }
                    var10 = stackIn_15_0;
                    incrementValue$0 = param2;
                    param2++;
                    param0[incrementValue$0] = (byte)knb.a(var8 >>> -244767388, var7 << -1767335422);
                    if (var9 == -1) {
                      break L2;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param0[incrementValue$1] = (byte)knb.a(dla.a(15, var8) << -1155566844, var9 >>> 1022033794);
                      if (-1 == var10) {
                        break L2;
                      } else {
                        incrementValue$2 = param2;
                        param2++;
                        param0[incrementValue$2] = (byte)knb.a(var10, dla.a(var9, 3) << -123170330);
                        var6 += 4;
                        continue L1;
                      }
                    }
                  }
                }
                stackIn_19_0 = param2 + -var4_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 104;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ij.N(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final ksa d(int param0) {
        ksa var2 = null;
        if (param0 != 0) {
            this.field_a = (ksa) null;
            var2 = this.field_a.field_c;
            if (!(var2 != this.field_a)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_c;
            return var2;
        }
        var2 = this.field_a.field_c;
        if (!(var2 != this.field_a)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_c;
        return var2;
    }

    final ksa a(int param0) {
        ksa var2 = null;
        if (param0 != -1155566844) {
            this.b(-8);
            var2 = this.field_b;
            if (!(this.field_a != var2)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_b;
        if (!(this.field_a != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    final ksa b(byte param0) {
        ksa var2;
        var2 = this.field_a.field_a;
        if (param0 >= 115) {
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          this.f(-72);
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        }
    }

    public ij() {
        this.field_a = new ksa();
        this.field_a.field_c = this.field_a;
        this.field_a.field_a = this.field_a;
    }

    final int c(int param0) {
        int var2;
        ksa var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != 3) {
          this.field_a = (ksa) null;
          var2 = 0;
          var3 = this.field_a.field_c;
          L0: while (true) {
            if (var3 == this.field_a) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = this.field_a.field_c;
          L1: while (true) {
            if (var3 == this.field_a) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
