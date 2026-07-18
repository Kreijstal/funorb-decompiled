/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static md field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    ug field_f;
    static float field_h;
    static String field_d;
    private ug field_e;

    final void b(byte param0) {
        ug var2 = null;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((pj) this).field_f.field_d;
          if (((pj) this).field_f != var2) {
            var2.c(param0 + -19943);
            continue L0;
          } else {
            if (param0 != 121) {
              field_b = null;
              ((pj) this).field_e = null;
              return;
            } else {
              ((pj) this).field_e = null;
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_67_0 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_67_0 = (byte[]) var3;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (0 >= var5) {
                        break L4;
                      } else {
                        if (128 > var5) {
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
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 == 8218) {
                        var3[var4] = (byte) -126;
                        break L2;
                      } else {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (8224 != var5) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (381 != var5) {
                                              if (8216 != var5) {
                                                if (var5 != 8217) {
                                                  if (8220 != var5) {
                                                    if (var5 != 8221) {
                                                      if (8226 != var5) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (8250 != var5) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      var4++;
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
            stackOut_69_0 = (RuntimeException) var2;
            stackOut_69_1 = new StringBuilder().append("pj.K(").append(3231).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L6;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ')');
        }
        return stackIn_68_0;
    }

    final static void a(int param0, d param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        hb var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = gf.field_c;
            var8 = var7;
            var8.b(true, 3);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.b(1, -49152);
            var8.c(param1.field_n, 121);
            var8.c(param1.field_m, 88);
            var8.c(param1.field_p, 62);
            var8.a(-803539344, param1.field_o);
            var8.a(-803539344, param1.field_i);
            var8.a(-803539344, param1.field_j);
            var8.a(-803539344, param1.field_l);
            var8.b(param1.field_f.length, -49152);
            var5 = 0;
            L1: while (true) {
              if (param1.field_f.length <= var5) {
                int discarded$1 = var8.a((byte) -108, var4);
                var8.a(var8.field_h + -var4, (byte) -124);
                break L0;
              } else {
                var7.a(-803539344, param1.field_f[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pj.E(").append(3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + true + ')');
        }
    }

    final void a(ug param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_c) {
                param0.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_d = ((pj) this).field_f.field_d;
            param0.field_c = ((pj) this).field_f;
            param0.field_c.field_d = param0;
            param0.field_d.field_c = param0;
            if (param1 == 13) {
              break L0;
            } else {
              ug discarded$2 = ((pj) this).a((byte) -120);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pj.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final ug c(byte param0) {
        ug var2 = null;
        var2 = ((pj) this).field_f.field_c;
        if (var2 != ((pj) this).field_f) {
          var2.c(-19822);
          if (param0 != -66) {
            field_h = -1.0866156816482544f;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug d(int param0) {
        ug var2 = null;
        if (param0 == 4011) {
          var2 = ((pj) this).field_f.field_d;
          if (var2 == ((pj) this).field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        } else {
          field_c = null;
          var2 = ((pj) this).field_f.field_d;
          if (var2 == ((pj) this).field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        }
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
              gb.a(-63);
              stackOut_4_0 = (vk) var2;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("pj.N(").append(101).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final int b(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = 0;
        ug var3 = ((pj) this).field_f.field_d;
        while (((pj) this).field_f != var3) {
            var3 = var3.field_d;
            var2++;
        }
        int var4 = 61 / ((param0 - 78) / 46);
        return var2;
    }

    final ug a(boolean param0) {
        ug var2 = null;
        var2 = ((pj) this).field_e;
        if (((pj) this).field_f != var2) {
          ((pj) this).field_e = var2.field_c;
          if (!param0) {
            field_h = -0.11541689187288284f;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pj) this).field_e = null;
          return null;
        }
    }

    final ug d(byte param0) {
        ug var2 = null;
        var2 = ((pj) this).field_e;
        if (((pj) this).field_f == var2) {
          ((pj) this).field_e = null;
          return null;
        } else {
          if (param0 != 63) {
            return null;
          } else {
            ((pj) this).field_e = var2.field_d;
            return var2;
          }
        }
    }

    final ug c(int param0) {
        ug var2 = null;
        var2 = ((pj) this).field_f.field_c;
        if (var2 != ((pj) this).field_f) {
          if (param0 != -1) {
            return null;
          } else {
            ((pj) this).field_e = var2.field_c;
            return var2;
          }
        } else {
          ((pj) this).field_e = null;
          return null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11253) {
          L0: {
            ((pj) this).field_f = null;
            if (((pj) this).field_f != ((pj) this).field_f.field_d) {
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
            if (((pj) this).field_f != ((pj) this).field_f.field_d) {
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

    final ug a(byte param0) {
        ug var2 = null;
        if (param0 != -117) {
            pj.a(false, 11);
            var2 = ((pj) this).field_f.field_d;
            if (!(((pj) this).field_f != var2)) {
                ((pj) this).field_e = null;
                return null;
            }
            ((pj) this).field_e = var2.field_d;
            return var2;
        }
        var2 = ((pj) this).field_f.field_d;
        if (!(((pj) this).field_f != var2)) {
            ((pj) this).field_e = null;
            return null;
        }
        ((pj) this).field_e = var2.field_d;
        return var2;
    }

    private final void a(int param0, pj param1, ug param2) {
        ug var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = ((pj) this).field_f.field_c;
            ((pj) this).field_f.field_c = param2.field_c;
            param2.field_c.field_d = ((pj) this).field_f;
            if (param2 != ((pj) this).field_f) {
              param2.field_c = param1.field_f.field_c;
              param2.field_c.field_d = param2;
              param1.field_f.field_c = var4;
              var4.field_d = param1.field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("pj.I(").append(-16293).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(pj param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(-16293, param0, ((pj) this).field_f.field_d);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b() {
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 480;
              var2 = mk.a(sd.a(37, param1));
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("pj.Q(").append(83).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 31645) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              jk.field_B = jk.field_B + 1;
              if (kc.field_d != 0) {
                L3: {
                  var2_int = -116 + qg.field_c;
                  var3 = ab.field_e + -90;
                  var4 = ee.field_F;
                  var5 = 0;
                  if (!param0) {
                    stackOut_7_0 = kg.field_c;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = fg.field_b;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_8_0;
                  var7 = 0;
                  if (!param0) {
                    break L4;
                  } else {
                    var8 = 9;
                    L5: while (true) {
                      if (var8 < 0) {
                        break L4;
                      } else {
                        L6: {
                          if (0 == (var6 & 1 << var8)) {
                            var7 += 20;
                            var8--;
                            break L6;
                          } else {
                            var8--;
                            break L6;
                          }
                        }
                        var8--;
                        continue L5;
                      }
                    }
                  }
                }
                L7: {
                  var8 = var7 + 10;
                  var9 = 0;
                  if (var9 >= 10) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        if (!param0) {
                          break L9;
                        } else {
                          if ((1 << var9 & var6) == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (lf.a(-19864, var2_int, var3, 40, 40, var8, 10)) {
                        ee.field_F = var9;
                        var5 = 1;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                    L10: {
                      L11: {
                        if (!param0) {
                          break L11;
                        } else {
                          if ((var6 & 1 << var9) != 0) {
                            break L11;
                          } else {
                            var9++;
                            break L10;
                          }
                        }
                      }
                      var8 += 40;
                      var9++;
                      break L10;
                    }
                    var9++;
                    var9++;
                    break L7;
                  }
                }
                if (var5 == 0) {
                  break L2;
                } else {
                  if (ee.field_F != var4) {
                    break L2;
                  } else {
                    jk.field_B = 0;
                    ee.field_F = -1;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L12: {
              if (uk.field_r >= 0) {
                break L12;
              } else {
                if (fj.field_E == null) {
                  break L12;
                } else {
                  if (!fj.field_E.field_j) {
                    break L12;
                  } else {
                    uk.field_r = fj.field_E.field_e;
                    fg.field_b = fg.field_b & ~uk.field_r;
                    fj.field_E = null;
                    k.field_i = true;
                    kg.field_c = kg.field_c | uk.field_r;
                    break L12;
                  }
                }
              }
            }
            if (!ok.a(false)) {
              L13: while (true) {
                var11 = (vl) (Object) em.field_C.d(4011);
                if (var11 == null) {
                  break L0;
                } else {
                  int discarded$1 = 4;
                  mh.a(var11, param1 + -31645);
                  continue L13;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "pj.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_c) {
                param1.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_c = ((pj) this).field_f.field_c;
            param1.field_d = ((pj) this).field_f;
            param1.field_c.field_d = param1;
            param1.field_d.field_c = param1;
            if (param0 == -8212) {
              break L0;
            } else {
              field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pj.M(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public pj() {
        ((pj) this).field_f = new ug();
        ((pj) this).field_f.field_c = ((pj) this).field_f;
        ((pj) this).field_f.field_d = ((pj) this).field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
