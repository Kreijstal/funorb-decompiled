/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements fe {
    private int field_c;
    private int field_m;
    private ok field_g;
    private int field_i;
    static int field_f;
    private int field_n;
    private int field_b;
    static ve field_a;
    private int field_o;
    private int field_e;
    private int field_p;
    private int field_d;
    private int field_h;
    private int field_l;
    static String field_k;
    static String field_j;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        fj stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fj var11 = null;
        fa var12 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof fa) {
                stackIn_3_0 = (fj) (param3);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var12 = (fa) ((Object) stackIn_3_0);
              if (var12 == null) {
                break L2;
              } else {
                param2 = param2 & var12.field_L;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              fn.e(param1 + param3.field_q, param3.field_m + param4, param3.field_F, param3.field_z, this.field_c);
              var8 = param3.field_q + (param1 + this.field_h);
              if (param0 < -97) {
                break L4;
              } else {
                var11 = (fj) null;
                this.a((byte) 21, -47, false, (fj) null, -45);
                break L4;
              }
            }
            L5: {
              var9 = param3.field_m + (param4 + this.field_m);
              fn.d(var8, var9, this.field_i, this.field_d, 5592405);
              fn.e(var8, var9, this.field_i, this.field_d, var7);
              if (!var12.field_O) {
                break L5;
              } else {
                fn.f(var8, var9, this.field_i + var8, var9 + this.field_d, 1);
                fn.f(this.field_i + var8, var9, var8, var9 + this.field_d, 1);
                break L5;
              }
            }
            L6: {
              if (null == this.field_g) {
                break L6;
              } else {
                var10 = this.field_i + this.field_h + this.field_l;
                this.field_g.a(param3.field_B, param1 + param3.field_q + var10, this.field_o + (param3.field_m + param4), param3.field_F - (this.field_l + var10), param3.field_z - (this.field_l << -964336063), this.field_b, this.field_n, this.field_e, this.field_p, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("b.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, byte param2, CharSequence param3) {
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
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
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if (param1 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        L3: {
                          if (param2 == 16) {
                            break L3;
                          } else {
                            field_a = (ve) null;
                            break L3;
                          }
                        }
                        stackIn_43_0 = var6;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (0 == var8) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param0) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (90 < var9) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param1) {
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
                          var10 = param1 * var6 + var9;
                          if (var6 == var10 / param1) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("b.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_43_0;
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_8_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.length();
              var4 = var3_int;
              if (param2 == 1177) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                stackIn_8_0 = var6_int + 2;
                var5 = stackIn_8_0;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3_int) {
                      break L4;
                    } else {
                      if (!hc.a(param1.charAt(var5), -58)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (!vl.a((CharSequence) ((Object) var7_ref_String), -182)) {
                    continue L2;
                  } else {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = cc.a(true, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (args[var8].length() - (-var6_int + var5));
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 <= var8) {
                    var5 = var8 + 2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!hc.a(param1.charAt(var5), -58)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      if (vl.a((CharSequence) ((Object) var9), param2 + -1359)) {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = cc.a(true, (CharSequence) ((Object) var9));
                            discarded$0 = var6.append(param1.substring(var7, var8));
                            discarded$1 = var6.append(args[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param1.substring(var7));
                    stackIn_29_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("b.B(");

            if (args == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(df param0, int param1, kg param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            StringBuilder stackIn_40_1 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            dg var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                if (param1 < -9) {
                  var18 = new dg();
                  var18.field_r = param2.c(32);
                  var18.field_t = param2.f((byte) 67);
                  var18.field_q = new bc[var18.field_r];
                  var18.field_u = new int[var18.field_r];
                  var18.field_o = new int[var18.field_r];
                  var18.field_s = new byte[var18.field_r][][];
                  var18.field_m = new bc[var18.field_r];
                  var18.field_v = new int[var18.field_r];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18.field_r) {
                      af.field_cb.a((rk) (var18), (byte) -82);
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param2.c(32);
                              if (0 == var6_int) {
                                break L4;
                              } else {
                                if ((var6_int ^ -1) == -2) {
                                  break L4;
                                } else {
                                  if (-3 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (3 == var6_int) {
                                        break L5;
                                      } else {
                                        if ((var6_int ^ -1) == -5) {
                                          break L5;
                                        } else {
                                          var5++;
                                          decompiledRegionSelector0 = 0;
                                          break L2;
                                        }
                                      }
                                    }
                                    var20 = param2.d(true);
                                    var21 = param2.d(true);
                                    var9 = param2.c(32);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var22 = new byte[var9][];
                                          var19 = var22;
                                          var11 = var19;
                                          if (3 != var6_int) {
                                            break L7;
                                          } else {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param2.f((byte) 112);
                                                array$0 = new byte[var13];
                                                var11[var12_int] = array$0;
                                                param2.a(0, (byte) 87, var13, var22[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                        var18.field_o[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            var18.field_q[var5] = param0.a((byte) -107, pi.a((byte) 81, var20), var12, var21);
                                            var18.field_s[var5] = var22;
                                            break L3;
                                          } else {
                                            var12[var17] = pi.a((byte) 94, var10[var17]);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.d(true);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L10: {
                              var15 = param2.d(true);
                              var16 = param2.d(true);
                              var9 = 0;
                              if ((var6_int ^ -1) != -2) {
                                break L10;
                              } else {
                                var9 = param2.f((byte) 118);
                                break L10;
                              }
                            }
                            var18.field_o[var5] = var6_int;
                            var18.field_v[var5] = var9;
                            var18.field_m[var5] = param0.a(0, pi.a((byte) 98, var15), var16);
                            break L3;
                          }
                          decompiledRegionSelector0 = 1;
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18.field_u[var5] = -1;
                          decompiledRegionSelector0 = 1;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18.field_u[var5] = -2;
                          decompiledRegionSelector0 = 1;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18.field_u[var5] = -3;
                          decompiledRegionSelector0 = 1;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18.field_u[var5] = -4;
                          decompiledRegionSelector0 = 1;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18.field_u[var5] = -5;
                          decompiledRegionSelector0 = 1;
                          break L15;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_37_0 = (RuntimeException) (var4);

                stackIn_37_1 = new StringBuilder().append("b.E(");

                if (param0 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "null";
                  break L16;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L17;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L17;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_k = null;
        if (param0 >= -70) {
            String var2 = (String) null;
            b.a((String[]) null, (String) null, 82);
        }
        field_j = null;
    }

    b(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_p = 1;
        try {
            this.field_o = param2;
            this.field_d = param7;
            this.field_l = param1;
            this.field_h = param5;
            this.field_g = param0;
            this.field_i = param8;
            this.field_b = param3;
            this.field_c = param9;
            this.field_m = param6;
            this.field_n = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = 0;
        field_a = new ve();
        field_j = "Look out for <col=FFFFFF>extra life</col> power-ups!";
    }
}
