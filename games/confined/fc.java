/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_c;
    static mn field_a;
    private int[] field_e;
    private int field_i;
    private int field_g;
    private int[] field_b;
    static od field_d;
    static volatile boolean field_f;
    private int field_h;

    private final void a(byte param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var4 = 46 / ((param0 - -56) / 40);
        int fieldTemp$3 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_h = this.field_h + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L1: {
              var3 = this.field_e[var2];
              if (-1 != (var2 & 2 ^ -1)) {
                if (0 == (var2 & 1)) {
                  this.field_i = this.field_i ^ this.field_i << 586757698;
                  break L1;
                } else {
                  this.field_i = this.field_i ^ this.field_i >>> 921568144;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  this.field_i = this.field_i ^ this.field_i >>> 2117997638;
                  break L1;
                } else {
                  this.field_i = this.field_i ^ this.field_i << -1888705811;
                  break L1;
                }
              }
            }
            this.field_i = this.field_i + this.field_e[255 & 128 + var2];
            dupTemp$4 = this.field_e[va.a(255, var3 >> 247630498)] - (-this.field_i + -this.field_h);
            var5 = dupTemp$4;
            this.field_e[var2] = dupTemp$4;
            dupTemp$5 = this.field_e[va.a(var5 >> 1964197960 >> -20768638, 255)] + var3;
            this.field_h = dupTemp$5;
            this.field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, mn param1) {
        RuntimeException var2 = null;
        oi var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: while (true) {
                var2_ref = (oi) ((Object) param1.a(false));
                if (var2_ref != null) {
                  var3 = (oi) ((Object) param1.a((byte) -124));
                  var4 = 1;
                  L2: while (true) {
                    if (var3 == null) {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var3 = (oi) ((Object) param1.a(-113));
                        var2_ref = (oi) ((Object) param1.d(2123));
                        var4 = 1;
                        L3: while (true) {
                          if (var2_ref == null) {
                            if (var4 != 0) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              continue L1;
                            }
                          } else {
                            L4: {
                              if (var2_ref.field_n + var2_ref.field_p > var3.field_n + var3.field_p) {
                                var4 = 0;
                                ri.a(var3, 0, var2_ref);
                                break L4;
                              } else {
                                var3 = var2_ref;
                                break L4;
                              }
                            }
                            var2_ref = (oi) ((Object) param1.d(2123));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L5: {
                        if (var3.field_p + var3.field_n < var2_ref.field_n + var2_ref.field_p) {
                          var4 = 0;
                          ri.a(var3, 0, var2_ref);
                          break L5;
                        } else {
                          var2_ref = var3;
                          break L5;
                        }
                      }
                      var3 = (oi) ((Object) param1.a((byte) -127));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte[] param4) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == -1257536924) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= vb.field_e.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param3 = vb.field_e[var5_int];
                  var6 = var5_int << -1257536924;
                  L2: while (true) {
                    incrementValue$12 = param3;
                    param3--;
                    if (incrementValue$12 == 0) {
                      var5_int++;
                      continue L1;
                    } else {
                      incrementValue$13 = var6;
                      var6++;
                      param1 = tl.field_i[incrementValue$13];
                      param2[param4[param1]] = param2[param4[param1]] + 1;
                      tl.field_i[param2[param4[param1]]] = param1;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("fc.H(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (-1 != (param3 ^ -1)) {
              if (param1 != (param3 ^ -1)) {
                var4_int = param3 - -param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              } else {
                var10 = param0[param2];
                var4 = var10;
                if (var4 != null) {
                  stackOut_8_0 = var10.toString();
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_6_0 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4_ref);
            stackOut_24_1 = new StringBuilder().append("fc.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        if (param0 == -4) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -5) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 256) {
                  var2 = 0;
                  L2: while (true) {
                    if (-257 >= (var2 ^ -1)) {
                      this.a((byte) -118);
                      this.field_g = 256;
                      return;
                    } else {
                      var4 = var4 + this.field_e[var2 - -1];
                      var3 = var3 + this.field_e[var2];
                      var7 = var7 + this.field_e[4 + var2];
                      var6 = var6 + this.field_e[3 + var2];
                      var10 = var10 + this.field_e[var2 + 7];
                      var5 = var5 + this.field_e[var2 + 2];
                      var9 = var9 + this.field_e[6 + var2];
                      var8 = var8 + this.field_e[var2 - -5];
                      var3 = var3 ^ var4 << -1787013205;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> 1115036258;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -1845440664;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -355437744;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -1156872726;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -843278108;
                      var3 = var3 + var8;
                      var9 = var9 + var10;
                      var9 = var9 ^ var10 << 1987222120;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> -1122962391;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_e[var2] = var3;
                      this.field_e[1 + var2] = var4;
                      this.field_e[var2 - -2] = var5;
                      this.field_e[3 + var2] = var6;
                      this.field_e[var2 - -4] = var7;
                      this.field_e[var2 + 5] = var8;
                      this.field_e[var2 - -6] = var9;
                      this.field_e[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var8 = var8 + this.field_b[var2 + 5];
                  var3 = var3 + this.field_b[var2];
                  var5 = var5 + this.field_b[var2 + 2];
                  var4 = var4 + this.field_b[1 + var2];
                  var7 = var7 + this.field_b[var2 + 4];
                  var10 = var10 + this.field_b[var2 - -7];
                  var6 = var6 + this.field_b[3 + var2];
                  var9 = var9 + this.field_b[var2 + 6];
                  var3 = var3 ^ var4 << -1864628629;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -115193118;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << 912736200;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> -895527152;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << 419714410;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> 198577188;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << -281224280;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> 1226148361;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  this.field_e[var2] = var3;
                  this.field_e[var2 + 1] = var4;
                  this.field_e[var2 + 2] = var5;
                  this.field_e[var2 - -3] = var6;
                  this.field_e[var2 + 4] = var7;
                  this.field_e[var2 - -5] = var8;
                  this.field_e[6 + var2] = var9;
                  this.field_e[7 + var2] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << -259644469;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 312474274;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 1859667368;
              var6 = var6 + var7;
              var8 = var8 + var5;
              var6 = var6 ^ var7 >>> -1877819920;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << 450261322;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 1357912068;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 1842914536;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> 1719400713;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(mn param0, byte param1) {
        RuntimeException var2 = null;
        oi var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 >= 13) {
              L1: while (true) {
                var2_ref = (oi) ((Object) param0.a(false));
                if (var2_ref == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = (oi) ((Object) param0.a((byte) -30));
                  var4 = 1;
                  L2: while (true) {
                    if (var3 == null) {
                      if (var4 == 0) {
                        var3 = (oi) ((Object) param0.a(59));
                        var2_ref = (oi) ((Object) param0.d(2123));
                        var4 = 1;
                        L3: while (true) {
                          if (var2_ref == null) {
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            L4: {
                              if (var3.field_p - var3.field_n >= -var2_ref.field_n + var2_ref.field_p) {
                                var3 = var2_ref;
                                break L4;
                              } else {
                                var4 = 0;
                                ri.a(var3, 0, var2_ref);
                                break L4;
                              }
                            }
                            var2_ref = (oi) ((Object) param0.d(2123));
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      L5: {
                        if (var3.field_p - var3.field_n >= -var2_ref.field_n + var2_ref.field_p) {
                          var2_ref = var3;
                          break L5;
                        } else {
                          ri.a(var3, 0, var2_ref);
                          var4 = 0;
                          break L5;
                        }
                      }
                      var3 = (oi) ((Object) param0.a((byte) -96));
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("fc.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -1) {
            field_f = false;
        }
    }

    final int c(int param0) {
        if (param0 != 256) {
            return 2;
        }
        if (!(this.field_g != 0)) {
            this.a((byte) -105);
            this.field_g = 256;
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        return this.field_b[fieldTemp$0];
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 == -7212) {
                break L1;
              } else {
                field_f = false;
                break L1;
              }
            }
            L2: {
              if (null != ki.field_b) {
                ki.field_b.field_O.a((byte) -127, param1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null != hb.field_u) {
                hb.field_u.field_H.a((byte) -127, param1);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("fc.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    fc(int[] param0) {
        int var2_int = 0;
        try {
            this.field_b = new int[256];
            this.field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_b[var2_int] = param0[var2_int];
            }
            this.b(-4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new mn();
        field_f = true;
    }
}
