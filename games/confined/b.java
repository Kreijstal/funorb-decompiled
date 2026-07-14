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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        fa var12 = null;
        fj stackIn_3_0 = null;
        fj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof fa) {
            stackOut_2_0 = (fj) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (fj) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (fa) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            param2 = param2 & var12.field_L;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param2) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          fn.e(param1 + param3.field_q, param3.field_m + param4, param3.field_F, param3.field_z, ((b) this).field_c);
          var8 = param3.field_q + (param1 + ((b) this).field_h);
          if (param0 < -97) {
            break L3;
          } else {
            var11 = null;
            ((b) this).a((byte) 21, -47, false, (fj) null, -45);
            break L3;
          }
        }
        L4: {
          var9 = param3.field_m + (param4 + ((b) this).field_m);
          fn.d(var8, var9, ((b) this).field_i, ((b) this).field_d, 5592405);
          fn.e(var8, var9, ((b) this).field_i, ((b) this).field_d, var7);
          if (!var12.field_O) {
            break L4;
          } else {
            fn.f(var8, var9, ((b) this).field_i + var8, var9 + ((b) this).field_d, 1);
            fn.f(((b) this).field_i + var8, var9, var8, var9 + ((b) this).field_d, 1);
            break L4;
          }
        }
        L5: {
          if (null == ((b) this).field_g) {
            break L5;
          } else {
            var10 = ((b) this).field_i + ((b) this).field_h + ((b) this).field_l;
            int discarded$1 = ((b) this).field_g.a(param3.field_B, param1 + param3.field_q + var10, ((b) this).field_o + (param3.field_m + param4), param3.field_F - (((b) this).field_l + var10), param3.field_z - (((b) this).field_l << -964336063), ((b) this).field_b, ((b) this).field_n, ((b) this).field_e, ((b) this).field_p, 0);
            break L5;
          }
        }
    }

    final static int a(boolean param0, int param1, byte param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Confined.field_J ? 1 : 0;
          if (2 > param1) {
            break L0;
          } else {
            if (param1 <= 36) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    L2: {
                      if (param2 == 16) {
                        break L2;
                      } else {
                        field_a = null;
                        break L2;
                      }
                    }
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (0 == var8) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L1;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param0) {
                            break L3;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param1) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = param1 * var6 + var9;
                    if (var6 == var10 / param1) {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L1;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static String a(String[] args, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Confined.field_J ? 1 : 0;
          var3 = param1.length();
          var4 = var3;
          if (param2 == 1177) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (var6_int >= 0) {
            var5 = var6_int + 2;
            L2: while (true) {
              L3: {
                if (var5 >= var3) {
                  break L3;
                } else {
                  if (!hc.a(param1.charAt(var5), -58)) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              var7_ref = param1.substring(2 + var6_int, var5);
              if (!vl.a((CharSequence) (Object) var7_ref, -182)) {
                continue L1;
              } else {
                if (var5 >= var3) {
                  continue L1;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L1;
                  } else {
                    var5++;
                    var8 = cc.a(true, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (args[var8].length() - (-var6_int + var5));
                    continue L1;
                  }
                }
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var5 = 0;
            var7 = 0;
            L4: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (0 <= var8) {
                var5 = var8 + 2;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      if (!hc.a(param1.charAt(var5), -58)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param1.substring(2 + var8, var5);
                  if (vl.a((CharSequence) (Object) var9, param2 + -1359)) {
                    if (var3 <= var5) {
                      continue L4;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = cc.a(true, (CharSequence) (Object) var9);
                        StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(args[var10]);
                        var7 = var5;
                        continue L4;
                      }
                    }
                  } else {
                    continue L4;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param1.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    final static void a(df param0, int param1, kg param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
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
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = Confined.field_J ? 1 : 0;
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
              L0: while (true) {
                if (var5 >= var18.field_r) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_u[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param2.c(32);
                        if (0 == var6_int) {
                          break L2;
                        } else {
                          if (var6_int == -2) {
                            break L2;
                          } else {
                            if (-3 == var6_int) {
                              break L2;
                            } else {
                              L3: {
                                if (3 == var6_int) {
                                  break L3;
                                } else {
                                  if ((var6_int ^ -1) == -5) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param2.d(true);
                              var21 = param2.d(true);
                              var9 = param2.c(32);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var11_int >= var9) {
                                  L5: {
                                    var24 = new byte[var9][];
                                    var23 = var24;
                                    var22 = var23;
                                    var19 = var22;
                                    var11 = var19;
                                    if (3 != var6_int) {
                                      break L5;
                                    } else {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var12_int >= var9) {
                                          break L5;
                                        } else {
                                          var13 = param2.f((byte) 112);
                                          var11[var12_int] = new byte[var13];
                                          param2.a(0, (byte) 87, var13, var24[var12_int]);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_o[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_q[var5] = param0.a((byte) -107, pi.a((byte) 81, var20), var12, var21);
                                      var18.field_s[var5] = var24;
                                      var5++;
                                      break L1;
                                    } else {
                                      var12[var17] = pi.a((byte) 94, var10[var17]);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param2.d(true);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param2.d(true);
                        var16 = param2.d(true);
                        var9 = 0;
                        if ((var6_int ^ -1) != -2) {
                          break L8;
                        } else {
                          var9 = param2.f((byte) 118);
                          break L8;
                        }
                      }
                      var18.field_o[var5] = var6_int;
                      var18.field_v[var5] = var9;
                      var18.field_m[var5] = param0.a(0, pi.a((byte) 98, var15), var16);
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_u[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_u[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
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
            Object var2 = null;
            String discarded$0 = b.a((String[]) null, (String) null, 82);
        }
        field_j = null;
    }

    b(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((b) this).field_e = 1;
        ((b) this).field_p = 1;
        ((b) this).field_o = param2;
        ((b) this).field_d = param7;
        ((b) this).field_l = param1;
        ((b) this).field_h = param5;
        ((b) this).field_g = param0;
        ((b) this).field_i = param8;
        ((b) this).field_b = param3;
        ((b) this).field_c = param9;
        ((b) this).field_m = param6;
        ((b) this).field_n = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = new ve();
        field_j = "Look out for <col=FFFFFF>extra life</col> power-ups!";
    }
}
