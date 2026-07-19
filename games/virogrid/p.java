/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_d;
    static km field_a;
    static int field_h;
    static ul field_b;
    static byte[] field_e;
    l field_i;
    private l field_c;
    static String field_g;
    static boolean field_f;

    final l b(boolean param0) {
        l var2 = null;
        if (param0) {
            field_a = (km) null;
            var2 = this.field_i.field_a;
            if (!(this.field_i != var2)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_i.field_a;
        if (!(this.field_i != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final void a(boolean param0) {
        l discarded$1 = null;
        l var2 = null;
        int var3 = 0;
        l var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        L0: while (true) {
          var2 = this.field_i.field_f;
          if (var2 != this.field_i) {
            var2.a(false);
            continue L0;
          } else {
            this.field_c = null;
            if (!param0) {
              return;
            } else {
              var4 = (l) null;
              discarded$1 = this.a(-4, (l) null);
              return;
            }
          }
        }
    }

    final void b(l param0, byte param1) {
        int discarded$0 = 0;
        try {
            if (null != param0.field_a) {
                param0.a(false);
            }
            param0.field_a = this.field_i;
            param0.field_f = this.field_i.field_f;
            param0.field_a.field_f = param0;
            if (param1 != -45) {
                CharSequence var4 = (CharSequence) null;
                discarded$0 = p.a(-77, -60, false, (CharSequence) null);
            }
            param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "p.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (df.field_f >= param1 + param3 + param2) {
            return param2 + param3;
        }
        if (!((-param1 + param2 ^ -1) > param0)) {
            return param2 - param1;
        }
        return -param1 + df.field_f;
    }

    final l d(int param0) {
        l var2 = null;
        var2 = this.field_i.field_f;
        if (this.field_i != var2) {
          if (param0 != -29889) {
            return (l) null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final l b(int param0) {
        int var2 = 0;
        l var3 = null;
        var2 = -93 / ((-46 - param0) / 34);
        var3 = this.field_i.field_a;
        if (this.field_i == var3) {
          return null;
        } else {
          var3.a(false);
          return var3;
        }
    }

    final l e(int param0) {
        l var2 = null;
        if (param0 != 9003) {
            field_d = -121;
            var2 = this.field_c;
            if (!(this.field_i != var2)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_c;
        if (!(this.field_i != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, lk param5, um param6) {
        dj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ai.a(-1, param6, (int[]) null, param5.field_Eb, param5.field_Ob, param5.field_Nb, -1, param5, 60);
        md.field_e.a(true, (byte) -126);
        md.field_e.a(4, (int[]) null, 0);
        md.field_e.a((byte) -110);
        if (param2) {
            return;
        }
        try {
            var7 = md.field_e;
            var8 = param1;
            var9 = param3;
            var10 = param4;
            var11 = param0;
            var7.field_a.a(var11, 0, var10, var8, var9);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "p.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final l a(int param0) {
        l discarded$2 = null;
        l var2 = null;
        var2 = this.field_c;
        if (var2 != this.field_i) {
          if (param0 != 16213) {
            discarded$2 = this.b(true);
            this.field_c = var2.field_f;
            return var2;
          } else {
            this.field_c = var2.field_f;
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            if (param2 < -95) {
              L1: while (true) {
                if ((param0 ^ -1) >= -2) {
                  if (param0 == 1) {
                    stackOut_10_0 = var3_int * param1;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_12_0 = var3_int;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    if (-1 == (param0 & 1 ^ -1)) {
                      break L2;
                    } else {
                      var3_int = var3_int * param1;
                      break L2;
                    }
                  }
                  param0 = param0 >> 1;
                  param1 = param1 * param1;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 81;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "p.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final l a(int param0, l param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        l stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        l stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
              if (param0 == 480) {
                break L1;
              } else {
                field_h = 13;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = this.field_i.field_f;
                break L2;
              }
            }
            if (this.field_i != var3) {
              this.field_c = var3.field_f;
              stackOut_8_0 = (l) (var3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_c = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("p.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (l) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final l a(byte param0) {
        int discarded$2 = 0;
        l var2 = null;
        var2 = this.field_i.field_f;
        if (var2 == this.field_i) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_f;
          if (param0 >= -20) {
            discarded$2 = p.a(-111, 78, -112);
            return var2;
          } else {
            return var2;
          }
        }
    }

    public static void c(int param0) {
        int discarded$2 = 0;
        CharSequence var2 = null;
        if (param0 > -27) {
          var2 = (CharSequence) null;
          discarded$2 = p.a(-2, 62, false, (CharSequence) null);
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final void a(l param0, byte param1) {
        try {
            if (param0.field_a != null) {
                param0.a(false);
            }
            param0.field_a = this.field_i.field_a;
            param0.field_f = this.field_i;
            if (param1 > -30) {
                l var4 = (l) null;
                this.b((l) null, (byte) 27);
            }
            param0.field_a.field_f = param0;
            param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static eh a(int param0, int param1) {
        if (param0 < 32) {
          field_e = (byte[]) null;
          return va.a(1, false, param1, -105, true, false);
        } else {
          return va.a(1, false, param1, -105, true, false);
        }
    }

    final boolean b(byte param0) {
        l discarded$6 = null;
        l var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 7) {
          L0: {
            var3 = (l) null;
            discarded$6 = this.a(-30, (l) null);
            if (this.field_i.field_f != this.field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_i.field_f != this.field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > param0) {
                break L1;
              } else {
                if (-37 > (param0 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param3.length();
                    if (param1 == 4330) {
                      break L2;
                    } else {
                      field_f = false;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_41_0 = var6;
                        stackIn_42_0 = stackOut_41_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (param2) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param0 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + param0 * var6;
                          if (var10 / param0 == var6) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var4);
            stackOut_43_1 = new StringBuilder().append("p.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        return stackIn_42_0;
    }

    public p() {
        this.field_i = new l();
        this.field_i.field_f = this.field_i;
        this.field_i.field_a = this.field_i;
    }

    static {
        field_h = 480;
        field_b = new ul(2);
        field_g = "Find opponents";
        field_f = false;
    }
}
