/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private int field_j;
    int field_l;
    private int[] field_k;
    static int[] field_h;
    int field_i;
    int field_q;
    private int[] field_e;
    private ih field_s;
    private int field_d;
    int field_f;
    private String field_o;
    private int[] field_m;
    private int field_b;
    int field_p;
    private int[] field_r;
    private int field_g;
    private int[] field_a;
    private ed field_n;
    int field_c;

    final void a(boolean param0, boolean param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var12 = EscapeVector.field_A;
        var4 = ((dk) this).field_f - -((dk) this).field_p;
        if (param2 > 16) {
          L0: {
            var5 = ((dk) this).field_l - -((dk) this).field_i;
            var6 = 0;
            if (!param1) {
              break L0;
            } else {
              var6 = 2;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              var6 = 1;
              break L1;
            }
          }
          L2: {
            var7 = this.b((byte) -102);
            if (((dk) this).field_d != 2) {
              break L2;
            } else {
              L3: {
                if (!param0) {
                  var8 = 1;
                  em.a(1 + ((dk) this).field_f, 1 + ((dk) this).field_n.field_z + ((dk) this).field_l, -2 + ((dk) this).field_p, -2 + ((dk) this).field_i - ((dk) this).field_n.field_z, var8);
                  break L3;
                } else {
                  fc.a(var7, ((dk) this).field_f + -2, var4 + 2, 2 + var5, true, 29788, false, ((dk) this).field_e[1], ((dk) this).field_m[1], ((dk) this).field_g, -2 + ((dk) this).field_l, false);
                  break L3;
                }
              }
              ((dk) this).field_n.d(((dk) this).field_f, ((dk) this).field_l);
              break L2;
            }
          }
          L4: {
            if (((dk) this).field_d != 3) {
              break L4;
            } else {
              fc.a(var7, ((dk) this).field_f, var4, var5, true, 29788, false, ((dk) this).field_e[var6], ((dk) this).field_m[var6], ((dk) this).field_g, ((dk) this).field_l, false);
              break L4;
            }
          }
          L5: {
            if (((dk) this).field_d != 0) {
              if (((dk) this).field_d != 1) {
                if (((dk) this).field_d == 4) {
                  var8 = this.c(-18641);
                  var9 = ((dk) this).field_b + " - ";
                  ((dk) this).field_s.b(var9, ((dk) this).field_f - -((dk) this).field_j, var8, ((dk) this).field_r[1], -1);
                  ((dk) this).field_s.a(((dk) this).field_o, ((dk) this).field_f - -((dk) this).field_j, var8, ((dk) this).field_r[var6], -1);
                  if (((dk) this).field_n == null) {
                    break L5;
                  } else {
                    ((dk) this).field_n.e(var4 - ((dk) this).field_n.field_A, ((dk) this).field_l);
                    break L5;
                  }
                } else {
                  var8 = this.c(-18641);
                  var9_int = ((dk) this).field_p / 2 + ((dk) this).field_f;
                  lb.a(var8, ((dk) this).field_o, ((dk) this).field_r[var6], -128, var9_int);
                  break L5;
                }
              } else {
                L6: {
                  if (param0) {
                    stackOut_18_0 = ((dk) this).field_k[1];
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = ((dk) this).field_k[0];
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_19_0;
                  if (param0) {
                    stackOut_21_0 = ((dk) this).field_a[1];
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = ((dk) this).field_a[0];
                    stackIn_22_0 = stackOut_20_0;
                    break L7;
                  }
                }
                var9_int = stackIn_22_0;
                var10 = ((dk) this).field_f + (((dk) this).field_p - var8) / 2;
                var11 = ((dk) this).field_l + (-var9_int + ((dk) this).field_i) / 2;
                ((dk) this).field_n.a(var10, var11, var8, var9_int);
                break L5;
              }
            } else {
              var8 = 1;
              em.c(((dk) this).field_f, ((dk) this).field_l, ((dk) this).field_n.field_A, ((dk) this).field_n.field_z, ((dk) this).field_m[var6], var8);
              ((dk) this).field_n.a(((dk) this).field_f, ((dk) this).field_l, ((dk) this).field_e[var6]);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (((dk) this).field_d != 4) {
          return;
        } else {
          var2 = ((dk) this).field_f - -((dk) this).field_j;
          var3 = ((dk) this).field_p + ((dk) this).field_f;
          var4 = 1 + var3 + -var2;
          var5 = ((dk) this).field_s.b(((dk) this).field_o);
          if (var5 > var4) {
            var6_int = ((dk) this).field_o.length();
            L0: while (true) {
              L1: {
                if (var6_int < 0) {
                  break L1;
                } else {
                  ((dk) this).field_o = ((dk) this).field_o.substring(0, var6_int);
                  var5 = ((dk) this).field_s.b(((dk) this).field_o);
                  if (var4 >= var5) {
                    break L1;
                  } else {
                    var6_int--;
                    continue L0;
                  }
                }
              }
              var6 = oe.field_cc;
              if (((dk) this).field_o.length() > var6.length()) {
                ((dk) this).field_o = ((dk) this).field_o.substring(0, ((dk) this).field_o.length() + -var6.length()) + var6;
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    dk(int param0, int param1, String param2, int param3, ed param4, int param5, ih param6) {
        this(param0, param1, param2, param3, param6);
        try {
            ((dk) this).field_n = param4;
            ((dk) this).field_g = param5;
            ((dk) this).field_p = this.d(-1);
            ((dk) this).field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(boolean param0) {
        if (!(((dk) this).field_n != null)) {
            return 0;
        }
        return ((dk) this).field_n.field_A;
    }

    private final int d(int param0) {
        int var2 = this.b(0);
        int var3 = this.a(false);
        return var3 > var2 ? var3 : var2;
    }

    final void a(int[] param0, int[] param1, int param2) {
        try {
            if (param2 != -2) {
                ((dk) this).field_d = -77;
            }
            ((dk) this).field_m = param0;
            ((dk) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (var5 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var5) {
                        break L5;
                      } else {
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (8364 == var5) {
                      var3[var4] = (byte) -128;
                      break L2;
                    } else {
                      if (8218 == var5) {
                        var3[var4] = (byte) -126;
                        break L2;
                      } else {
                        if (var5 == 402) {
                          var3[var4] = (byte) -125;
                          break L2;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (var5 == 8225) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (710 != var5) {
                                    if (8240 != var5) {
                                      if (352 != var5) {
                                        if (var5 != 8249) {
                                          if (var5 == 338) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (381 != var5) {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (8221 == var5) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (8226 == var5) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var5 != 382) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("dk.K(").append(-14).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
        return stackIn_67_0;
    }

    final void a(int[] param0, int[] param1, byte param2, int[] param3) {
        ((dk) this).a(param1, param0, -2);
        if (param2 > -120) {
            return;
        }
        try {
            ((dk) this).field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0) {
        if (!(((dk) this).field_d != 1)) {
            return 0;
        }
        int var2 = this.f(-95);
        int var3 = this.a(0);
        return var3 + var2;
    }

    dk(int param0, int param1, String param2, int param3, int param4, ih param5) {
        this(param0, param1, param2, param3, param5);
        try {
            ((dk) this).field_g = param4;
            ((dk) this).field_p = this.d(-1);
            ((dk) this).field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final int c(int param0) {
        int var2 = ((dk) this).field_i + ((dk) this).field_l;
        int var3 = -3 + var2 - ((dk) this).field_s.field_x;
        return var3;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dc var4 = null;
        int var4_int = 0;
        cc var5_ref_cc = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        c var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var10 = om.field_g;
            var2 = var10.e(0);
            var3 = var10.e(0);
            L1: {
              if (var2 == 0) {
                var4 = (dc) (Object) en.field_i.a(false);
                if (var4 == null) {
                  nm.a(16);
                  return;
                } else {
                  L2: {
                    var5 = -var10.field_m + hi.field_r;
                    var14 = var4.field_h;
                    var13 = var14;
                    var12 = var13;
                    var11 = var12;
                    var6 = var11;
                    if (var14.length << 2 >= var5) {
                      break L2;
                    } else {
                      var5 = var14.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.field_g = true;
                      var4.c((byte) -105);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var10.e(0) << (ae.a(3, var7) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  pf.a(false, "LR1: " + hf.b((byte) 36), (Throwable) null);
                  nm.a(16);
                  break L1;
                } else {
                  var4_int = var10.e((byte) 106);
                  var5_ref_cc = (cc) (Object) vn.field_e.a(false);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_cc == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_cc.field_i != var3) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_cc.field_m) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_cc = (cc) (Object) vn.field_e.b((byte) 70);
                        continue L4;
                      }
                    }
                    if (var5_ref_cc != null) {
                      var5_ref_cc.c((byte) -62);
                      break L1;
                    } else {
                      nm.a(16);
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "dk.H(" + 108457410 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = ((dk) this).field_p + ((dk) this).field_f;
          if (((dk) this).field_f > param1) {
            break L0;
          } else {
            if (param1 >= var4) {
              break L0;
            } else {
              if (param0 == 65) {
                L1: {
                  var5 = ((dk) this).field_l + ((dk) this).field_i;
                  if (((dk) this).field_l > param2) {
                    break L1;
                  } else {
                    if (param2 >= var5) {
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              } else {
                return true;
              }
            }
          }
        }
        return false;
    }

    private final int f(int param0) {
        int var2 = ((dk) this).field_s.field_r + ((dk) this).field_s.field_x;
        int var3 = var2 + 6;
        int var4 = 50;
        return var3;
    }

    private final int b(int param0) {
        if (((dk) this).field_d == 1) {
            return 0;
        }
        String var2 = " ";
        int var3 = ((dk) this).field_s.b(var2);
        int var4 = ((dk) this).field_s.b(((dk) this).field_o);
        var4 = var4 - -(4 * var3);
        return var4;
    }

    private final int a(int param0) {
        if (null == ((dk) this).field_n) {
            return 0;
        }
        int discarded$0 = this.a(true);
        return ((dk) this).field_n.field_z;
    }

    final void b(byte param0, int param1, int param2) {
        int var4 = 126 / ((78 - param0) / 36);
        ((dk) this).field_l = param2;
        ((dk) this).field_f = param1;
    }

    private final int b(byte param0) {
        int var2 = 0;
        if (!(1 != ((dk) this).field_d)) {
            return 0;
        }
        return mj.field_d < ((dk) this).field_q ? (((dk) this).field_q + -mj.field_d) * 2 : 0;
    }

    public static void g(int param0) {
        field_h = null;
    }

    final void a(int param0, boolean param1) {
        if (param0 != -16383) {
            ((dk) this).field_s = null;
        }
        int var3 = 0;
        ((dk) this).a(param1, var3 != 0, (byte) 27);
    }

    final void a(int param0, int param1, int param2) {
        ((dk) this).field_i = param0;
        if (param1 != 0) {
            ((dk) this).field_d = -53;
        }
        ((dk) this).field_p = param2;
        this.h(160);
    }

    dk(int param0, int param1, int param2, String param3, int param4, ed param5, int param6, ih param7) {
        this(param0, param1, param3, param6, param7);
        try {
            ((dk) this).field_n = param5;
            ((dk) this).field_b = param2;
            ((dk) this).field_j = param4;
            ((dk) this).field_p = this.d(-1);
            ((dk) this).field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private dk(int param0, int param1, String param2, int param3, ih param4) {
        try {
            ((dk) this).field_s = param4;
            ((dk) this).field_d = param0;
            ((dk) this).field_c = param1;
            ((dk) this).field_q = param3;
            ((dk) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    dk(int param0, int param1, ed param2, int[] param3, int[] param4) {
        try {
            ((dk) this).field_d = param0;
            ((dk) this).field_c = param1;
            ((dk) this).field_a = param4;
            ((dk) this).field_k = param3;
            ((dk) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    dk(int param0, int param1, ed param2) {
        try {
            ((dk) this).field_d = param0;
            ((dk) this).field_n = param2;
            ((dk) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new int[32768];
        for (var0 = 0; 32768 > var0; var0++) {
            field_h[var0] = (int)(16384.0 * Math.sin((double)var0 / 5215.1903));
        }
    }
}
