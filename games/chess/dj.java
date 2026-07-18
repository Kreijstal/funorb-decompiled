/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends l {
    int[] field_u;
    private String[] field_v;
    static String field_q;
    private int[] field_s;
    static km field_t;
    static String field_w;
    private int[][] field_r;

    final static void a() {
        vj.field_c = new jc();
    }

    final String e(byte param0) {
        int var3 = 0;
        int var4 = Chess.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((dj) this).field_v == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((dj) this).field_v[0]);
        for (var3 = 1; ((dj) this).field_v.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((dj) this).field_v[var3]);
        }
        if (param0 >= -102) {
            field_t = null;
        }
        return var2.toString();
    }

    final void a(p param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.i(-79);
              if (0 != var3_int) {
                this.a(var3_int, 80, param0);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dj.J(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        p var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var10 = new p(param0);
              var3 = 92 % ((61 - param1) / 50);
              var4 = var10.i(-92);
              var5 = var10.e((byte) -124);
              if (var5 < 0) {
                break L1;
              } else {
                L2: {
                  if (0 == je.field_l) {
                    break L2;
                  } else {
                    if (var5 <= je.field_l) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var4 != 0) {
                  L3: {
                    var6 = var10.e((byte) -93);
                    if (var6 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (je.field_l == 0) {
                          break L4;
                        } else {
                          if (je.field_l < var6) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var18 = new byte[var6];
                        var16 = var18;
                        var14 = var16;
                        var12 = var14;
                        var7 = var12;
                        if (var4 != 1) {
                          var8 = (Object) (Object) nc.field_N;
                          synchronized (var8) {
                            L6: {
                              nc.field_N.a(var18, (byte) -34, var10);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$2 = 9;
                          int discarded$3 = en.a(var7, var6, param0, var5);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var7;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var17 = new byte[var5];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var6_ref_byte__ = var11;
                  var10.a(var5, (byte) 124, var17, 0);
                  stackOut_6_0 = (byte[]) var6_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("dj.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final static void g(int param0) {
        hd.field_c.a(0, -(bo.field_c ? 44 + sc.field_e : 0) + bh.field_G.field_M, -2147483648, 18, 0);
        uk.field_c.a(-40 + (bh.field_G.field_M + (-sc.field_e + -2)), 42 - -sc.field_e, -2147483648, 18, 0);
        ib.field_c.a(param0, bh.field_G.field_pb - 20, 20, -3, sc.field_e, 0, bh.field_G.field_M);
    }

    final static gm h() {
        return (gm) (Object) new kh();
    }

    final static byte[] a(CharSequence param0, int param1) {
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
        var6 = Chess.field_G;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (0 >= var5) {
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
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (var5 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (8218 != var5) {
                        if (402 != var5) {
                          if (var5 != 8222) {
                            if (var5 != 8230) {
                              if (8224 == var5) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (var5 != 8225) {
                                  if (710 != var5) {
                                    if (var5 != 8240) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (381 == var5) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
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
                                                    if (8221 != var5) {
                                                      if (8226 != var5) {
                                                        if (8211 != var5) {
                                                          if (var5 != 8212) {
                                                            if (732 != var5) {
                                                              if (var5 != 8482) {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (8250 != var5) {
                                                                    if (var5 != 339) {
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
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var4] = (byte) -123;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L2;
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
            stackOut_68_1 = new StringBuilder().append("dj.C(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param1 + ')');
        }
        return stackIn_67_0;
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        if (param0 != 32768) {
            return;
        }
        if (null != ((dj) this).field_u) {
            for (var2 = 0; ((dj) this).field_u.length > var2; var2++) {
                ((dj) this).field_u[var2] = s.a(((dj) this).field_u[var2], 32768);
            }
        }
    }

    public static void d() {
        field_q = null;
        field_t = null;
        field_w = null;
    }

    private final void a(int param0, int param1, p param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        hg var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                if (param0 != 2) {
                  if (param0 != 3) {
                    if (4 == param0) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.i(-103);
                    ((dj) this).field_r = new int[var4_int][];
                    ((dj) this).field_s = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param2.f(674914976);
                          var7 = li.a(var6, 0);
                          if (var7 != null) {
                            ((dj) this).field_s[var5] = var6;
                            ((dj) this).field_r[var5] = new int[var7.field_c];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_c) {
                                break L3;
                              } else {
                                ((dj) this).field_r[var5][var8] = param2.f(674914976);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param2.i(-113);
                  ((dj) this).field_u = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((dj) this).field_u[var5] = param2.f(674914976);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                ((dj) this).field_v = gl.a((byte) -118, '<', param2.d(0));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("dj.D(").append(param0).append(',').append(80).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    dj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Your request to join has been declined.";
        field_w = "Cancel unrated rematch";
    }
}
