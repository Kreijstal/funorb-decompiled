/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends li {
    boolean field_n;
    private int field_r;
    int field_q;
    int[] field_o;
    static String field_p;
    int field_s;

    private final int a(byte param0, int param1) {
        if (param0 != 117) {
            boolean discarded$0 = ((bo) this).a((byte) -58);
        }
        return param1;
    }

    private final void e(int param0) {
        ((bo) this).field_r = 0;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 76) {
            break L0;
          } else {
            int discarded$2 = this.a((byte) -101, 83);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((bo) this).field_r == 10) {
              break L2;
            } else {
              if (!((bo) this).field_n) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean b(int param0, int param1) {
        int fieldTemp$0 = ((bo) this).field_r;
        ((bo) this).field_r = ((bo) this).field_r + 1;
        ((bo) this).field_o[fieldTemp$0] = param0;
        if (param1 != -11) {
            ((bo) this).field_n = false;
        }
        return ((bo) this).field_r == 10 ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_68_0 = (byte[]) var3;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
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
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (255 < var5) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (8364 != var5) {
                      if (8218 != var5) {
                        if (402 == var5) {
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
                              if (8224 == var5) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (8225 == var5) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 == 710) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (352 == var5) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 != var5) {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (8217 == var5) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (8221 == var5) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (732 == var5) {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (8482 != var5) {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (339 != var5) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
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
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("bo.C(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + -711 + ')');
        }
        return stackIn_69_0;
    }

    private final void f(int param0) {
        ((bo) this).field_o = new int[10];
    }

    final void a(int param0, mi param1) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        try {
            param1.j(63, param0 + 124);
            param1.d(false);
            param1.a((byte) 114, 8, ((bo) this).field_q);
            for (var3_int = param0; var3_int < 10; var3_int++) {
                param1.a((byte) 118, 6, this.a((byte) 117, ((bo) this).field_o[var3_int]));
            }
            param1.q(param0 + -9);
            this.e(-85);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "bo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bo(int param0, int param1) {
        ((bo) this).field_s = param1;
        short fieldTemp$0 = sk.field_a;
        sk.field_a = (short)(sk.field_a + 1);
        ((bo) this).field_q = fieldTemp$0 % 255;
        this.f(-7307);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Disruptive behaviour";
    }
}
