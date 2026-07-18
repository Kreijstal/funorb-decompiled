/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv {
    int field_w;
    static String field_j;
    byte[] field_u;
    static int[] field_G;
    int field_C;
    boolean[] field_f;
    int field_E;
    int field_r;
    byte[] field_D;
    int field_H;
    static String field_d;
    byte[] field_p;
    int[] field_s;
    int[] field_a;
    int field_J;
    int field_z;
    byte field_o;
    int field_v;
    int field_g;
    int[][] field_i;
    int[] field_t;
    int field_q;
    static vr field_B;
    int field_y;
    int[] field_m;
    int[][] field_x;
    boolean[] field_k;
    byte[] field_I;
    byte[][] field_e;
    byte[] field_F;
    int field_c;
    int field_h;
    int field_b;
    byte[] field_n;
    int field_l;
    int[][] field_A;

    final static int a(byte param0) {
        return qk.field_l;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (bs.field_k < 224) {
            var1 = bs.field_k % 32;
            gka.a(param0 ^ -16922, 32 + bs.field_k - var1);
        } else {
            gka.a(param0 + -17025, 256);
        }
        if (param0 != 16964) {
            Object var2 = null;
            byte[] discarded$0 = bv.a(-13, (CharSequence) null);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_G = null;
        field_j = null;
        field_B = null;
        int var1 = 93;
    }

    final static byte[] a(int param0, CharSequence param1) {
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 18019) {
                break L1;
              } else {
                bv.b(-42);
                break L1;
              }
            }
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_68_0 = (byte[]) var3;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (128 > var5) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (255 < var5) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte) -128;
                      break L3;
                    } else {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (8222 != var5) {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  } else {
                                    if (8240 == var5) {
                                      var3[var4] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (338 != var5) {
                                            if (var5 != 381) {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var5 != 8221) {
                                                      if (8226 == var5) {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (732 != var5) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (var5 != 8250) {
                                                                    if (var5 != 339) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L3;
                                                                      } else {
                                                                        if (376 != var5) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("bv.A(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    bv() {
        ((bv) this).field_u = new byte[18002];
        ((bv) this).field_E = 0;
        ((bv) this).field_H = 0;
        ((bv) this).field_s = new int[257];
        ((bv) this).field_D = new byte[256];
        ((bv) this).field_m = new int[6];
        ((bv) this).field_e = new byte[6][258];
        ((bv) this).field_i = new int[6][258];
        ((bv) this).field_x = new int[6][258];
        ((bv) this).field_f = new boolean[256];
        ((bv) this).field_a = new int[16];
        ((bv) this).field_I = new byte[4096];
        ((bv) this).field_t = new int[256];
        ((bv) this).field_k = new boolean[16];
        ((bv) this).field_n = new byte[18002];
        ((bv) this).field_A = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your email address again to make sure it's correct";
        field_j = "Email is valid";
        field_G = new int[8192];
    }
}
