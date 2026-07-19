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
        boolean discarded$0 = false;
        if (param0 != 117) {
            discarded$0 = this.a((byte) -58);
        }
        return param1;
    }

    private final void e(int param0) {
        this.field_r = 0;
        if (param0 > -67) {
            mi var3 = (mi) null;
            this.a(13, (mi) null);
        }
    }

    final boolean a(byte param0) {
        int discarded$2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 76) {
            break L0;
          } else {
            discarded$2 = this.a((byte) -101, 83);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 == (this.field_r ^ -1)) {
              break L2;
            } else {
              if (!this.field_n) {
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
        int fieldTemp$0 = this.field_r;
        this.field_r = this.field_r + 1;
        this.field_o[fieldTemp$0] = param0;
        if (param1 != -11) {
            this.field_n = false;
        }
        return (this.field_r ^ -1) == -11 ? true : false;
    }

    public static void a(int param0) {
        byte[] discarded$0 = null;
        field_p = null;
        if (param0 <= 65) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = bo.a((CharSequence) null, 23);
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            if (param1 == -711) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackOut_69_0 = (byte[]) (var3);
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 1;
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
                            var3[var4] = (byte)-125;
                            break L2;
                          } else {
                            if (var5 == 8222) {
                              var3[var4] = (byte)-124;
                              break L2;
                            } else {
                              if (var5 == 8230) {
                                var3[var4] = (byte)-123;
                                break L2;
                              } else {
                                if (8224 == var5) {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                } else {
                                  if (8225 == var5) {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (var5 == 710) {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    } else {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (352 == var5) {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (8249 != var5) {
                                            if (var5 != 338) {
                                              if (var5 != 381) {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (8217 == var5) {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  } else {
                                                    if (var5 != 8220) {
                                                      if (8221 == var5) {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (8211 == var5) {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 8212) {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (732 == var5) {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (8482 != var5) {
                                                                  if (var5 == 353) {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 == 8250) {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (339 != var5) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 != 376) {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte)-117;
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
                          var3[var4] = (byte)-126;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-128;
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
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var2);
            stackOut_71_1 = new StringBuilder().append("bo.C(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    private final void f(int param0) {
        this.field_o = new int[10];
        if (param0 != -7307) {
            this.field_n = false;
        }
    }

    final void a(int param0, mi param1) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        try {
            param1.j(63, param0 + 124);
            param1.d(false);
            param1.a((byte) 114, 8, this.field_q);
            for (var3_int = param0; var3_int < 10; var3_int++) {
                param1.a((byte) 118, 6, this.a((byte) 117, this.field_o[var3_int]));
            }
            param1.q(param0 + -9);
            this.e(-85);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "bo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bo(int param0, int param1) {
        this.field_s = param1;
        short fieldTemp$0 = sk.field_a;
        sk.field_a = (short)(sk.field_a + 1);
        this.field_q = fieldTemp$0 % 255;
        this.f(-7307);
    }

    static {
        field_p = "Disruptive behaviour";
    }
}
